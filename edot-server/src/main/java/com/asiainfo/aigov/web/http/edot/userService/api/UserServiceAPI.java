package com.asiainfo.aigov.web.http.edot.userService.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.aigov.web.http.edot.userService.bean.GjjBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.RealBean;
import com.asiainfo.aigov.web.http.edot.userService.bean.RspBean;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.https.HttpsClient;

@Component
public class UserServiceAPI {
	
	private static String accessUrl;
	
	private static Logger logger = Logger.getLogger(UserServiceAPI.class);
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("MPS_SERVICE_URL");
		}
		return accessUrl;
	}

	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static UserServiceAPI userServiceAPI;
	
	@PostConstruct
    public void init() throws Exception {
		userServiceAPI = this;
		userServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/
	
	/**
	 * 登陆接口
	 * 返回业务数据JSONObject data，包含String sessionId和UserInfo userInfo
	 * @param accout 用户注册使用的电话号码
	 * @param pwd 用户密码
	 * @param loginType normal
	 * @return
	 */
	public static RspBean login(String accout, String pwd, String loginType) {
		try {
			String url = getAccessUrl() + "/mps/yd/login.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("accout", accout);
			params.put("pwd", pwd);
			if(StringUtils.isNotEmpty(loginType))
				params.put("loginType", loginType);
			else
				params.put("loginType", "normal");
			String result = HttpsClient.doPost(url, params, false);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 保存实名认证信息 
	 * @param userId 用户ID
	 * @param userName 用户名称
	 * @param phoneNo 手机号
	 * @param idFrontImage 身份证正面照
	 * @param idBackImage 身份证反面照
	 * @param idHandImage 身份证手持照
	 * @param idCardNo 身份证号
	 * @return
	 */
	public static RspBean saveRealAuthen(String userId,String userName,String phoneNo,String idFrontImage,String idBackImage,String idHandImage,String idCardNo){
		try {
			String url = getAccessUrl() + "/mps/yd/saveRealAuthen.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("userId", userId);
			params.put("realName", userName);
			params.put("idFrontImage", idFrontImage);
			params.put("idBackImage", idBackImage);
			params.put("idHandImage", idHandImage);
			params.put("cardNo", idCardNo);
			params.put("consumer",AppPropertyUtil.getProperty("CONSUMER"));
			params.put("token", AppPropertyUtil.getProperty("token"));
			
			String result = HttpsClient.doPostJson(url, params, false);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 快速实名认证
	 * @param userId 用户id
	 * @param realName 名称
	 * @param phoneNo 手机
	 * @param cardNo 身份证
	 * @return
	 */
	public static RspBean fastCheckUser(String userId,String realName,String phoneNo,String cardNo){
		try {
			String url = getAccessUrl() + "/mps/yd/fastCheckUser.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("userId", userId);
			params.put("realName", realName);
			params.put("phoneNo", phoneNo);
			params.put("cardNo", cardNo);
			params.put("consumer",AppPropertyUtil.getProperty("CONSUMER"));
			params.put("token", AppPropertyUtil.getProperty("token"));
			
			String result = HttpsClient.doGet(url, params, false);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * @param userId 用户Id
	 * @param userName 用户名
	 * @param phoneNo 手机号
	 * @return
	 */
	public static RealBean getRealAuthen(String userId){
		try {
			String url = getAccessUrl() + "/mps/yd/getRealAuthen.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("userId", userId);
			params.put("consumer",AppPropertyUtil.getProperty("CONSUMER"));
			params.put("token", AppPropertyUtil.getProperty("token"));
			
			String result = HttpsClient.doPost(url, params, false);
			return JSONObject.parseObject(result, RealBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 注册接口
	 * @param userName 用户名
	 * @param phoneNo 手机号码
	 * @param passwd 用户密码
	 * @param idCardNo 身份证号
	 * @param realName 真实名称
	 * @param regisType 注册类型(APP：手机客户端登陆，WX：微信端登陆，WEB：web端登陆)
	 * @param userType 用户类型(企业用户：enterprise，普通用户：normal，医生：doctor，行政监管：administrative，12345热线：hotline)
	 * @return
	 */
	public static RspBean registe(String userName, String phoneNo, String passwd, String idCardNo, String realName, String regisType, String userType) {
		try {
			String url = getAccessUrl() + "/mps/yd/registe.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("userName", userName);
			params.put("phoneNo", phoneNo);
			params.put("passwd", passwd);
			params.put("idCardNo", idCardNo);
			params.put("realName", realName);
			params.put("registType", regisType);
			if(StringUtils.isNotEmpty(userType))
				params.put("userType", userType);
			else
				params.put("userType", "normal");
			String result = HttpsClient.doPost(url, params, false);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 发送短信验证码
	 * @param phoneNo 手机号码
	 * @param businessType 业务类型（YD_UPDATE_PASSWD：修改密码；YD_REGISTER_PHONE：用户注册）
	 * @return
	 */
	public static RspBean pushMsg(String phoneNo, String businessType) {
		try {
			String url = getAccessUrl() + "/mps/yd/pushMsg.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("phoneNo", phoneNo);
			params.put("businessType", businessType);
			String result = HttpsClient.doPost(url, params, false);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 修改密码
	 * @param phoneNo 手机号码
	 * @param pwd 用户密码
	 * @return
	 */
	public static RspBean changePwd(String phoneNo, String pwd) {
		try {
			String url = getAccessUrl() + "/mps/yd/changePwd.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("phoneNo", phoneNo);
			params.put("pwd", pwd);
			String result = HttpsClient.doPost(url, params, false);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 公积金账户查询
	 * @param jcode 个人身份证号码
	 * @param jname 个人姓名
	 * @return
	 */
	public static GjjBean gjj(String jcode, String jname) {
		try {
			String url = "http://xyzfgjj.xys.gov.cn/app/gjj2.asp";
			Map<String, String> params = new HashMap<String, String>();
			params.put("tp", "geren");
			params.put("jcode", jcode);
			params.put("jname", jname);
			params.put("random", String.valueOf(Math.random()));
			String result = HttpsClient.doGet(url, params);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, GjjBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 公积金账户查询（新）
	 * @param jcode 个人身份证号码
	 * @param jname 个人姓名
	 * @return
	 */
	public static Map<String, String> gjj2(String jcode, String jname) {
		try {
			String url = "http://10.63.32.17/webService/getData?serviceID=a807628857b04a2b83a0121b806ffacd";
			Map<String, String> params = new HashMap<String, String>();
			params.put("NAME", jname);
			params.put("ID", jcode);
			String result = HttpsClient.doPost(url, params);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			Map<String, String> map = new HashMap<String, String>();
			xmlElements(result,map);
			url = "http://10.63.32.17/webService/getData?serviceID=a609e512f2c840398ef048baeda7d61c&ID="+jcode+"&NAME="+jname;
			String result2 = searchLoginService(url);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, null, result2);
			xmlElements(result2,map);
			return map;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 判断用户是否注册
	 * @param phoneNo
	 * @param userType
	 * @return registerState //0未注册 1已注册
	 */
	public static RspBean checkUserRegisted(String phoneNo, String userType) {
		try {
			String url = getAccessUrl() + "/mps/yd/checkUserRegisted.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("phoneNo", phoneNo);
			if(StringUtils.isNotEmpty(userType))
				params.put("userType", userType);
			else
				params.put("userType", "normal");
			String result = HttpsClient.doPost(url, params, false);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 修改手机号
	 * @param userId
	 * @param userName
	 * @param newPhone
	 * @param userType
	 * @return
	 */
	public static RspBean changePhone(String userId, String userName, String newPhone, String userType) {
		try {
			String url = getAccessUrl() + "/mps/yd/changePhone.ajax";
			Map<String, String> params = new HashMap<String, String>();
			params.put("userId", userId);
			params.put("userName", userName);
			params.put("newPhone", newPhone);
			params.put("userType", userType);
			String result = HttpsClient.doPost(url, params, false);
			userServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result, RspBean.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 程序中访问http数据接口 
	 * @param urlStr
	 * @return
	 * Author: chenyp
	 * Date: 2015年5月12日
	 */
    public static String searchLoginService(String urlStr) {    

        /** 网络的url地址 */
        URL url = null;

        /** 输入流 */
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        try {
            url = new URL(urlStr);
            in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String str = null;
            while ((str = in.readLine()) != null) {
                sb.append(str);
            }
        } catch (Exception ex) {
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
            }
        }
        String result = sb.toString();
        logger.info("请求串 urlStr="+urlStr+"\n返回结果result="+result);
        return result;
    }
    
    private static void xmlElements(String xmlDoc,Map<String, String> map) {
    		xmlDoc = xmlDoc.trim().replaceAll("\n", "");
        //创建一个新的字符串v 
        StringReader read = new StringReader(xmlDoc);
        //创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
        InputSource source = new InputSource(read);
        //创建一个新的SAXBuilder
        SAXBuilder sb = new SAXBuilder();
        try {
            //通过输入源构造一个Document
            Document doc = sb.build(source);
            //取的根元素
            Element root = doc.getRootElement();
            System.out.println(root.getName());//输出根元素的名称（测试）
            //得到根元素所有子元素的集合
            List jiedian = root.getChildren();
            //获得XML中的命名空间（XML中未定义可不写）
            Namespace ns = root.getNamespace();
            Element et = null;
            for(int i=0;i<jiedian.size();i++){
                et = (Element) jiedian.get(i);//循环依次得到子元素
                List jiedian2 = et.getChildren();
                if (jiedian2.size() == 0) {
                		map.put(et.getName(), root.getChild(et.getName(),ns).getText());
				}else{
					for(int j=0;j<jiedian2.size();j++){
	                		Element et2 = (Element) jiedian2.get(j);
	                		List jiedian3 = et2.getChildren();
	                		if (jiedian3.size() == 0) {
							map.put(et2.getName(), et.getChild(et2.getName(),ns).getText());
						}else{
							for (int k = 0; k < jiedian3.size(); k++) {
								Element et3 = (Element) jiedian3.get(k);
								List jiedian4 = et3.getChildren();
								if (jiedian4.size() == 0) {
									map.put(et3.getName(), et2.getChild(et3.getName(),ns).getText());
								}
							}
						}
	                }
				}
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}

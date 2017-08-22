package com.asiainfo.aigov.web.webservice.edot.cardService.api;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.WebServiceUtils;
import com.asiainfo.frame.utils.https.HttpsClient;

@Component
public class CardServiceAPI {

	private static String accessUrl;
	
	private static String accessUrl2;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("ECARD_PORTAL_SERVICE_URL")+"/services/CardService?wsdl";
		}
		return accessUrl;
	}
	
	private static String getAccessUrl2(){
		if(accessUrl2 == null){
			accessUrl2 = AppPropertyUtil.getProperty("ECARD_PORTAL_SERVICE_URL")+"/common/dictItem/getDictItemCondition";
		}
		return accessUrl2;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static CardServiceAPI cardServiceAPI;
	
	@PostConstruct
    public void init() {
		cardServiceAPI = this;
		cardServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/

	/**
	 * 卡状态查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Response queryCardStatus(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryCardStatus", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryCardStatus", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4001.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 缴费信息查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Response queryRechargeInfo(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryRechargeInfo", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryRechargeInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4002.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 消费信息查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Response queryConsumeInfo(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryConsumeInfo", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryConsumeInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4003.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 口头挂失接口
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4004.rsp.Response syncCardInfo(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4004.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "syncCardInfo", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " syncCardInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4004.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 卡申领接口
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4005.rsp.Response savePadSmppCard(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4005.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "savePadSmppCard", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " savePadSmppCard", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4005.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 补换卡接口
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4006.rsp.Response updatePadSmppCard(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4006.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "updatePadSmppCard", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " updatePadSmppCard", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4006.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 卡余额查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response queryCardAmount(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryCardAmount", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryCardAmount", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4007.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 卡充值
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4008.rsp.Response saveCardPayOrder(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4008.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "saveCardPayOrder", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " saveCardPayOrder", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4008.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 卡申领前验卡接口
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4009.rsp.Response checkPersonalCard(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4009.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "checkPersonalCard", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " checkPersonalCard", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4009.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 交易信息(缴费/消费)查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4010.rsp.Response queryTradeInfo(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4010.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryTradeInfo", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryTradeInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4010.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}

	/**
	 * 办卡进度查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Response queryCardProgressList(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryCardProgressList", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryCardProgressList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4011.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}

	/**
	 * 卡申领接口
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.rsp.Response saveSelfApply(com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "saveSelfApply", reqContent);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " saveSelfApply", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.cardService.bean.ED4012.rsp.Response.unmarshal(in);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if(out != null){
				try {
					out.close();
					out = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in != null){
				in.close();
				in = null;
			}
		}
	}
	
	/**
	 * 查询数据字典条件
	 * @param params
	 * @return
	 */
	public static JSONObject getDictItemCondition(Map<String, String> params) {
		try {
			String url = getAccessUrl2();
			String result = HttpsClient.doPost(url, params, false);
			cardServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_HTTP, url, params.toString(), result);
			return JSONObject.parseObject(result);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}

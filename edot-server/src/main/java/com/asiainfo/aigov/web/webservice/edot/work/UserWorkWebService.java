package com.asiainfo.aigov.web.webservice.edot.work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.aigov.web.controller.edot.work.WorkController;
import com.asiainfo.aigov.web.webservice.edot.work.bean.ApplyFile;
import com.asiainfo.aigov.web.webservice.edot.work.bean.ApplyMaterialInfo;
import com.asiainfo.aigov.web.webservice.edot.work.bean.CaseInfo;
import com.asiainfo.aigov.web.webservice.edot.work.bean.CaseMaterial;
import com.asiainfo.aigov.web.webservice.edot.work.bean.Consult;
import com.asiainfo.aigov.web.webservice.edot.work.bean.FlowInfo;
import com.asiainfo.aigov.web.webservice.edot.work.bean.ApplyInfo;
import com.asiainfo.aigov.web.webservice.edot.work.bean.WorkResponse;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.utils.FileUtil;
import com.asiainfo.frame.utils.HttpClientUtil;
import com.asiainfo.frame.utils.JsonUtil;

/**
 * @author songxiaoliang
 * 
 *         用户办事接口
 * 
 */
public class UserWorkWebService {
	private static Logger log = Logger.getLogger(UserWorkWebService.class);
	/**
	 * 用户办事申请
	 * 
	 * @param applyInfo
	 * @param files
	 *            key:材料编号；value：材料流
	 * @return
	 * @throws Exception
	 */
	public static WorkResponse workApply(ApplyInfo applyInfo, List<ApplyFile> applyFiles) throws Exception {
		log.info("用户办事申请数据：\n"+JSONObject.toJSONString(applyInfo,true));
		// System.out.println(JSONObject.toJSONString(applyFiles,true));
		String url = WorkWebService.getHost()+ "/xzspserver/services/interface/netCase";
//		url = "http://127.0.0.1:8080/edot/work/testWorkApply";
		Map<String, String> params = new HashMap<String, String>();
		params.put("data", JSONObject.toJSONString(applyInfo));
		Map<String, byte[]> files = new HashMap<String, byte[]>();
		for (ApplyFile applyFile : applyFiles) {
			files.put(applyFile.getFileName(), applyFile.getBuffer());
		}
		String result = HttpClientUtil.postResponseBodyAsString(url, params, files);
		log.info("用户办事申请返回：" + result);
		return JSONObject.parseObject(result, WorkResponse.class);
	}

	/**
	 * 
	 * 根据手机号或证件号码（身份证、组织机构证号码等）查询用户办件数据，带分页参数。 返回办件基本信息
	 * 
	 * @param mobileOrIdcard
	 * @param page
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public static List<CaseInfo> searchCaseInfos(String mobileOrIdcard,
			String page, String pagesize) throws Exception {
		String url = WorkWebService.getHost() + "/xzspserver/services/interface/getCaseListByApplicantPapercode";
		Map<String, String> params = new HashMap<String, String>();
		params.put("idcard", mobileOrIdcard);
		params.put("page", page);
		params.put("pagesize", pagesize);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			String data = resp.getData();
			List<CaseInfo> list = JSONObject.parseArray(data, CaseInfo.class);
			return list;
		}
		return null;
	}

	/**
	 * 获取用户申请办件信息 返回办件基本信息、材料信息、审核流程信息
	 * 
	 * @param caseno
	 *            办件编号
	 * @return
	 * @throws Exception
	 */
	public static CaseInfo getCaseInfoWithFlowAndMaterial(String caseno)
			throws Exception {
		String url = WorkWebService.getHost() + "/xzspserver/services/interface/caseinfo";
		Map<String, String> params = new HashMap<String, String>();
		params.put("caseno", caseno);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			CaseInfo caseInfo = JSONObject.parseObject(resp.getData(), CaseInfo.class);
			List<FlowInfo> flowInfos = JSONObject.parseArray(resp.getProdata(), FlowInfo.class);
			List<CaseMaterial> caseMaterials = JSONObject.parseArray(resp.getMatedata(), CaseMaterial.class);
			caseInfo.setFlowInfos(flowInfos);
			caseInfo.setCaseMaterials(caseMaterials);
			return caseInfo;
		}
		return null;
	}

	/**
	 * 获取用户申请办件信息 返回办件基本信息 待办:2015050751558979、补正:201603230145137331
	 * 不予许可:201607220107847763、退件:201605180135371488、不予受理:2015070928341470
	 * 许可:2015051169915157、已发证:2015050583547409
	 * 
	 * @param caseno
	 * @return
	 * @throws Exception
	 */
	public static CaseInfo getCaseInfo(String caseno) throws Exception {
		String url = WorkWebService.getHost() + "/xzspserver/services/interface/case";
		Map<String, String> params = new HashMap<String, String>();
		params.put("caseno", caseno);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			CaseInfo caseInfo = JSONObject.parseObject(resp.getData(), CaseInfo.class);
			return caseInfo;
		}
		return null;
	}

	/**
	 * 根据办件编号获取办件材料列表
	 * 
	 * @param caseno
	 * @return
	 * @throws Exception
	 */
	public static List<CaseMaterial> searchMaterials(String caseno)
			throws Exception {
		String url = WorkWebService.getHost()
				+ "/xzspserver/services/interface/getCaseMaterialByCaseNo";
		Map<String, String> params = new HashMap<String, String>();
		params.put("caseno", caseno);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			List<CaseMaterial> caseMaterials = JSONObject.parseArray(resp.getData(), CaseMaterial.class);
			return caseMaterials;
		}
		return null;
	}

	/**
	 * 根据办件编号获取过程信息
	 * 
	 * @param caseno
	 * @return
	 * @throws Exception
	 */
	public static List<FlowInfo> getFlowInfos(String caseno) throws Exception {
		String url = WorkWebService.getHost()
				+ "/xzspserver/services/interface/getCaseProcessByCaseNo";
		Map<String, String> params = new HashMap<String, String>();
		params.put("caseno", caseno);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			List<FlowInfo> flowInfos = JSONObject.parseArray(resp.getData(), FlowInfo.class);
			return flowInfos;
		}
		return null;
	}

	/**
	 * 咨询申请
	 * 
	 * @param deptcode
	 *            咨询部门编码
	 * @param deptname
	 *            咨询部门名称
	 * @param mobile
	 *            申报人手机号
	 * @param receiver
	 *            申报人（用户姓名）
	 * @param title
	 *            咨询标题
	 * @param content
	 *            咨询内容
	 * @param submitTime
	 *            提交时间 格式：2016-06-20
	 * @return
	 */
	public static String applyConsult(String deptcode, String deptname,
			String mobile, String receiver, String title, String content,
			String submitTime) throws Exception {
		String url = WorkWebService.getHost()
				+ "/xzspserver/services/interface/feedback";
		Map<String, String> params = new HashMap<String, String>();
		params.put("deptcode", deptcode);
		params.put("deptname", deptname);
		params.put("mobile", mobile);
		params.put("receiver", receiver);
		params.put("title", title);
		params.put("content", content);
		params.put("submitTime", submitTime);
		String result = HttpClientUtil.postResponseBodyAsString(url, JSONObject.toJSONString(params));
		System.out.println("咨询返回：" + result);
		String valid = JsonUtil.getValue(result, "valid");
		String message = JsonUtil.getValue(result, "message");
		String id = JsonUtil.getValue(result, "data.id");

		if (!"1".equals(valid)) {
			throw new AIException(message);
		}
		return id;
	}

	/**
	 * 通过手机号、咨询人获取咨询列表
	 * 
	 * @param mobile
	 * @param zixunren
	 *            咨询人姓名
	 * @param page
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public static List<Consult> searchConsults(String mobile, String zixunren,
			String page, String pagesize) throws Exception {
		String url = WorkWebService.getHost() + "/xzspserver/services/interface/myfeedback";
		Map<String, String> params = new HashMap<String, String>();
		params.put("mobile", mobile);
		params.put("zixunren", zixunren);
		params.put("page", page);
		params.put("pagesize", pagesize);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			String data = resp.getData();
			List<Consult> list = JSONObject.parseArray(data, Consult.class);
			return list;
		}
		return null;
	}

	/**
	 * 通过手机号获取咨询列表
	 * 
	 * @param mobile
	 * @param zixunren
	 *            咨询人姓名
	 * @param page
	 * @param pagesize
	 * @return
	 * @throws Exception
	 */
	public static List<Consult> searchConsults(String mobile, String page,
			String pagesize) throws Exception {
		String url = WorkWebService.getHost() + "/xzspserver/services/interface/getFeedBackByMobile";
		Map<String, String> params = new HashMap<String, String>();
		params.put("mobile", mobile);
		params.put("page", page);
		params.put("pagesize", pagesize);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			String data = resp.getData();
			List<Consult> list = JSONObject.parseArray(data, Consult.class);
			return list;
		}
		return null;
	}

	/**
	 * 根据编号获取咨询
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public static Consult getConsult(String id) throws Exception {
		String url = WorkWebService.getHost()
				+ "/xzspserver/services/interface/feedinfo";
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", id);

		String content = HttpClientUtil.getResponseBodyAsString(url, params);
		WorkResponse resp = JSONObject.parseObject(content, WorkResponse.class);
		if (resp.isSuccess()) {
			String data = resp.getData();
			Consult bean = JSONObject.parseObject(data, Consult.class);
			return bean;
		}
		return null;
	}

	public static WorkResponse testWorkApply() throws Exception {
		ApplyInfo applyInfo = new ApplyInfo();
		applyInfo.setNetcaseapplicant("测试");// 个人/企业名称(必填)
		applyInfo.setNetcaseapplicanttype("个人");// 申报类型：个人、企业(必填)
		applyInfo.setNetcaseapplicantpapertype("身份证");// 证件类型：身份证、组织机关代码(必填)
		applyInfo.setNetcaseapplicantpapercode("352271198021280043");// 证件号码(必填)
//		applyInfo.setNetcaseapplicantphone("0591-2827265");// 申报人电话
		applyInfo.setNetcaseapplicantmobile("18888888888");// 手机号码(必填)
//		applyInfo.setNetcaseapplicantaddress("福建福州");// 联系地址
//		applyInfo.setNetcaseapplicantzipcode("352100");// 邮政编码
//		applyInfo.setNetcaseapplicantemail("215297@qq.com");// 电子邮箱
		applyInfo.setLoginName("18888888888");// 登陆用户名（如果不登录申报，直接给手机号）(必填)
		applyInfo.setServno("610400000000JY000-XK-0002");// 事项编号(必填)
		ApplyMaterialInfo mate1 = new ApplyMaterialInfo();
		mate1.setMateno("610400000000JY000-XK-0002-CL002");
		mate1.setMatename("户籍所在地的街道办事处、乡人民政府或工作单位所毕业的学校对其思想品德、有无犯罪记录等方面情况的鉴定及证明材料");
		applyInfo.getMateList().add(mate1);
		ApplyMaterialInfo mate2 = new ApplyMaterialInfo();
		mate2.setMateno("610400000000JY000-XK-0002-CL001");
		mate2.setMatename("提供身份证（户口本）、学历证、普通话等级证书原件及复印件");
		applyInfo.getMateList().add(mate2);

		List<ApplyFile> applyFiles = new ArrayList<ApplyFile>();
		String fileName = "1.5M.jpg";
		for (int i = 0; i < 10; i++) {
			ApplyFile applyFile1 = new ApplyFile();
			applyFile1.setMateno("610400000000JY000-XK-0002-CL001");
			applyFile1.setOriginalName(fileName);
			applyFile1.setBuffer(FileUtil.readFileAsByteArray("C:/vincent/"+fileName));
			applyFiles.add(applyFile1);
		}
		
		ApplyFile applyFile2 = new ApplyFile();
		applyFile2.setMateno("610400000000JY000-XK-0002-CL002");
		applyFile2.setOriginalName("2.17M.png");
		applyFile2.setBuffer(FileUtil.readFileAsByteArray("C:/vincent/2.17M.png"));
		applyFiles.add(applyFile2);
		System.out.println(JSONObject.toJSONString(applyInfo));
		return workApply(applyInfo, applyFiles);
	}

	public static void main(String[] args) throws Exception {
		WorkWebService.isDebug = true;
		WorkWebService.HOST = "http://220.178.67.202:4980";
		WorkWebService.HOST = "http://61.190.16.10:8180";	//测试
//		WorkWebService.HOST = "http://10.63.32.22:8180";	//正式
		
		String page = "1";
		String pagesize = "2";
		String pagesizeMax = String.valueOf(Integer.MAX_VALUE);

//		WorkResponse resp = testWorkApply();
//		System.out.println("【用户办事申请返回】：\n"+JSONObject.toJSONString(resp,true));
		
		// 15291196553、18082211212、18717259166、71008094-9
		 List<CaseInfo> list7 = searchCaseInfos("18905916816", page, pagesizeMax);
		 System.out.println("【用户办件列表查询】：\n"+JSONObject.toJSONString(list7,true));

		// CaseInfo bean3 = getCaseInfoWithFlowAndMaterial("2015050453600334");
		// System.out.println("【用户办件详细查询】：\n"+JSONObject.toJSONString(bean3,true));

		// CaseInfo bean5 = getCaseInfo("2015050751558979");
		// System.out.println("【用户办件基本信息查询】：\n"+JSONObject.toJSONString(bean5,true));

		// List<CaseMaterial> list8 = searchMaterials("201603230145137331");
		// System.out.println("【用户办件材料查询】：\n"+JSONObject.toJSONString(list8,true));

		// List<FlowInfo> list9 = getFlowInfos("201603230145137331");
		// System.out.println("【用户办件流程查询】：\n"+JSONObject.toJSONString(list9,true));

		// String id = applyConsult("610400000000GS100", "市工商局", "18688888888",
		// "某某人",
		// "测试", "测试不用管 ", TimeUtil.format(new Date(), TimeUtil.FORMAT_NORMAL));
		// System.out.println("【用户咨询】id："+id);

		// List<Consult> list6 = searchConsults("18688888888","1",pagesizeMax);
		// System.out.println("【用户咨询反馈】：\n"+JSONObject.toJSONString(list6,true));

		// Consult bean4 = getConsult("6");
		// System.out.println("【用户咨询详细查询】：\n"+JSONObject.toJSONString(bean4,true));
		
	}

}

package com.asiainfo.aigov.web.webservice.edot.rechargeService.api;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asiainfo.aigov.service.edot.common.IEdHttpLogSV;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.WebServiceUtils;

@Component
public class RechargeServiceAPI {

	private static String accessUrl;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("ECARD_SERVICE_URL")+"/services/NFCService?wsdl";
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static RechargeServiceAPI rechargeServiceAPI;
	
	@PostConstruct
    public void init() {
		rechargeServiceAPI = this;
		rechargeServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/

	/**
	 * 联机校验MAC1,计算MAC2
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.rsp.Response CardRecharge1(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "CommonRecharge1", reqContent);
			rechargeServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " CommonRecharge1", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.rsp.Response.unmarshal(in);
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
	 * 校验充资TAC
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.rsp.Response CardRecharge2(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "CommonRecharge2", reqContent);
			rechargeServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " CommonRecharge2", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.rsp.Response.unmarshal(in);
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
	 * 验卡
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6003.rsp.Response ValidateCard(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6003.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "ValidateCard", reqContent);
			rechargeServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " ValidateCard", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6003.rsp.Response.unmarshal(in);
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
	 * 冲正
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6004.rsp.Response CorrectCommonRecharge(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6004.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "CorrectCommonRecharge", reqContent);
			rechargeServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " CorrectCommonRecharge", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6004.rsp.Response.unmarshal(in);
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
	 * 获取交易记录
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response GetTradeRecord(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "GetChargeRecord", reqContent);
			rechargeServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " GetChargeRecord", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response.unmarshal(in);
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
	 * 查询充值记录列表
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Response GetRechargeTradeRecord(com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "GetRechargeTradeRecord", reqContent);
			rechargeServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " GetRechargeTradeRecord", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Response.unmarshal(in);
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
	
}

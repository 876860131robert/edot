package com.asiainfo.aigov.web.controller.edot.recharge;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.aigov.web.controller.edot.wiseMedical.WiseMedicalController;
import com.asiainfo.aigov.web.http.edot.alpayService.api.AlpayServiceAPI;
import com.asiainfo.aigov.web.webservice.edot.rechargeService.api.RechargeServiceAPI;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.utils.AppPropertyUtil;
import com.asiainfo.frame.utils.DateUtils;

@Controller
public class RechargeController extends BaseController {
	
	@Autowired
	private WiseMedicalController wiseMedicalController;
	
	@RequestMapping("/static/nfc/index")
	public String index(){
		return "nfc/index";
	}
	
	@RequestMapping("/recharge/ValidateCard")
	@ResponseBody
	@Remarks("验卡")
	public AjaxResponse ValidateCard(String cardNo, String chipSerial) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6003.req.Request req = new com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6003.req.Request();
		req.setCardNo(cardNo);
		req.setChipSerial(chipSerial);
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6003.rsp.Response rsp = RechargeServiceAPI.ValidateCard(req);
		resp.setData(rsp);
		return resp;
	}

	@RequestMapping("/recharge/CardRecharge1")
	@ResponseBody
	@Remarks("联机校验MAC1,计算MAC2")
	public AjaxResponse CardRecharge1(String cardNo, String amount, String chipSerial, String cardSerial, String tranAmount)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request req = new com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request();
	    req.setCardNo(cardNo);
	    req.setAmount(amount);
	    req.setChipSerial(chipSerial);
	    req.setCardSerial(cardSerial);
	    req.setRandomNumber("F71EC297");
		req.setTranSerial("71");
		req.setTranAmount(tranAmount);
		req.setTranType("2");
		req.setTerminalNo("NFC000000000");
		req.setMac("8B6DC7F1");
		req.setTradeDateTime(DateUtils.getDateString());
		req.setPayMode("08");
		req.setPayChannel("01");
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.rsp.Response rsp = RechargeServiceAPI.CardRecharge1(req);
		if(rsp != null && "0".equals(rsp.getResultCode())){
			resp = wiseMedicalController.queryForAlipay("3", rsp.getTerminalTranNo(), String.valueOf(Integer.parseInt(amount) / 100)/*分转元*/, AppPropertyUtil.getProperty("RETURN_URL") + "/static/nfc/index");
		} else {
			resp.setData(rsp);
		}
		return resp;
	}
	
	@RequestMapping("/recharge/CardRecharge1/dome")
	@ResponseBody
	@Remarks("联机校验MAC1,计算MAC2")
	public AjaxResponse CardRecharge1_dome(String cardNo, String amount, String chipSerial, String cardSerial, String tranAmount)
			throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request req = new com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.req.Request();
	    req.setCardNo(cardNo);
	    req.setAmount(amount);
	    req.setChipSerial(chipSerial);
	    req.setCardSerial(cardSerial);
	    req.setRandomNumber("F71EC297");
		req.setTranSerial("71");
		req.setTranAmount(tranAmount);
		req.setTranType("2");
		req.setTerminalNo("NFC000000000");
		req.setMac("8B6DC7F1");
		req.setTradeDateTime(DateUtils.getDateString());
		req.setPayMode("08");
		req.setPayChannel("01");
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6001.rsp.Response rsp = RechargeServiceAPI.CardRecharge1(req);
		if(rsp != null && "0".equals(rsp.getResultCode())){
			resp = wiseMedicalController.queryForAlipay("3", rsp.getTerminalTranNo(), amount/*分转元*/, AppPropertyUtil.getProperty("RETURN_URL") + "/static/nfc/index");
		} else {
			resp.setData(rsp);
		}
		return resp;
	}
	
	@RequestMapping("/recharge/queryForAlipay")
	@ResponseBody
	@Remarks("手机app支付（支付宝）")
	public AjaxResponse queryForAlipay(String orderId, String orderFee) throws Exception {
		return wiseMedicalController.queryForAlipay("3", orderId, orderFee, AppPropertyUtil.getProperty("RETURN_URL") + "/static/nfc/index");
	}
	
	@RequestMapping("/recharge/CardRecharge2")
	@ResponseBody
	@Remarks("校验充资TAC")
	public AjaxResponse CardRecharge2(String cardNo, String amount, String totalAmount, String chipSerial, String cardSerial, String terminalTranNo) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request req = new com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.req.Request();
	    req.setCardNo(cardNo);
	    req.setAmount(amount);
	    req.setTotalAmount(totalAmount);
	    req.setChipSerial(chipSerial);
	    req.setCardSerial(cardSerial);
	    req.setTranSerialBefore("71");
	    req.setTranType("2");
		req.setTerminalNo("NFC000000000");
		req.setTerminalTranNo(terminalTranNo);
	    req.setTac("27E315DE");
	    req.setTradeDateTime(DateUtils.getDateString());
	    
	    // 总共尝试3次
	    int count = 1;
	    while(count <= 3){
	    	try {
	    		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6002.rsp.Response rsp = RechargeServiceAPI.CardRecharge2(req);
	    		if(rsp != null && "0".equals(rsp.getResultCode())){
	    			resp.setData(rsp);
	    			return resp;
		    	} else {
		    		count++;
		    	}
			} catch (Exception e) {
				count++;
			}
	    }
	    throw new AIException("充值失败，请联系客服！");
	}
	
	@RequestMapping("/recharge/CorrectCommonRecharge")
	@ResponseBody
	@Remarks("冲正")
	public AjaxResponse CorrectCommonRecharge(String terminalTranNo, String payStatus) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6004.req.Request req = new com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6004.req.Request();
		req.setTerminalTranNo(terminalTranNo);
	    req.setPayStatus(payStatus);
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6004.rsp.Response rsp = RechargeServiceAPI.CorrectCommonRecharge(req);
		resp.setData(rsp);
		return resp;
	}
	
	@RequestMapping("/recharge/GetTradeRecord")
	@ResponseBody
	@Remarks("获取交易记录")
	public AjaxResponse GetTradeRecord(String terminalTranNo) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.req.Request req = new com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.req.Request();
		req.setTerminalTranNo(terminalTranNo);
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6005.rsp.Response rsp = RechargeServiceAPI.GetTradeRecord(req);
		resp.setData(rsp);
		return resp;
	}
	
	@RequestMapping("/recharge/GetRechargeTradeRecord")
	@ResponseBody
	@Remarks("查询充值记录列表")
	public AjaxResponse GetRechargeTradeRecord(String cardNo, String pageCount, String curPageNum, String extraCon) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request req = new com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.req.Request();
		req.setCardNo(cardNo);
		if(StringUtils.isNotEmpty(extraCon))
			req.setTerminalTranNo(extraCon);
		req.setPageSize(pageCount);
		req.setCurrentPage(curPageNum);
		com.asiainfo.aigov.web.webservice.edot.rechargeService.bean.ED6006.rsp.Response rsp = RechargeServiceAPI.GetRechargeTradeRecord(req);
		if(rsp.getRecordList() != null){
			resp.setData(rsp.getRecordList().getRecord());
		}
		return resp;
	}
	
	@RequestMapping("/recharge/payStatus")
	@ResponseBody
	@Remarks("查询支付宝订单状态")
	public AjaxResponse payStatus(String terminalTranNo) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		
		com.asiainfo.aigov.web.http.edot.alpayService.bean.RspBean rspBean = AlpayServiceAPI.payStatus(terminalTranNo, "2"/*手机网页支付*/);
		resp.setData(rspBean);
		return resp;
	}
	
}

package com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.api;

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
public class WiseMedicalServiceAPI {

	private static String accessUrl;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("MPS_SERVICE_URL")+"/services/WiseMedicalService?wsdl";
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static WiseMedicalServiceAPI wiseMedicalServiceAPI;
	
	@PostConstruct
    public void init() {
		wiseMedicalServiceAPI = this;
		wiseMedicalServiceAPI.edHttpLogSV = this.edHttpLogSV;
		/******************* 解决工具类中的注入问题 end *******************/
    }
	
	/**
	 * 个人基本信息查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Response queryPersonalBaseInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryPersonalBaseInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryPersonalBaseInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2001.rsp.Response.unmarshal(in);
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
	 * 个人基本信息修改
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2002.rsp.Response changePersonalBaseInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2002.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "changePersonalBaseInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " changePersonalBaseInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2002.rsp.Response.unmarshal(in);
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
	 * 就诊人列表查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Response queryPatients(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryPatients", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryPatients", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2003.rsp.Response.unmarshal(in);
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
	 * 就诊人列表查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2020.rsp.Response queryPatientList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2020.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryPatientList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryPatientList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2020.rsp.Response.unmarshal(in);
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
	 * 就诊人详细信息查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Response queryPatientDetail(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryPatientDetail", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryPatientDetail", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2004.rsp.Response.unmarshal(in);
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
	 * 就诊人信息变更
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2005.rsp.Response changePatientInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2005.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "changePatientInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " changePatientInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2005.rsp.Response.unmarshal(in);
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
	 * 删除就诊人信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2006.rsp.Response deletePatient(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2006.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "deletePatient", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " deletePatient", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2006.rsp.Response.unmarshal(in);
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
	 * 新增就诊人信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2007.rsp.Response addPatientInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2007.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "addPatientInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " addPatientInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2007.rsp.Response.unmarshal(in);
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
	 * 新增就诊卡信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.rsp.Response addPatientCardInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "addPatientCardInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " addPatientCardInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2008.rsp.Response.unmarshal(in);
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
	 * 修改就诊卡信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2009.rsp.Response changePatientCardInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2009.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "changePatientCardInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " changePatientCardInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2009.rsp.Response.unmarshal(in);
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
	 * 我的关注
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Response queryAttentionInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryAttentionInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryAttentionInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2010.rsp.Response.unmarshal(in);
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
	 * 增加关注医生
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2011.rsp.Response addAttentionDoctor(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2011.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "addAttentionDoctor", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " addAttentionDoctor", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2011.rsp.Response.unmarshal(in);
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
	 * 取消关注
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2012.rsp.Response deleteAttentionInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2012.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "deleteAttentionInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " deleteAttentionInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2012.rsp.Response.unmarshal(in);
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
	 * 医院信息查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Response queryHospital(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryHospital", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryHospital", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2013.rsp.Response.unmarshal(in);
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
	 * 根据科室查询医生
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Response queryDoctorByOffice(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryDoctorByOffice", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryDoctorByOffice", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2014.rsp.Response.unmarshal(in);
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
	 * 手机app支付（支付宝）
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.rsp.Response queryForAlipay(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryForAlipay", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryForAlipay", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2015.rsp.Response.unmarshal(in);
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
	 * 手机app退款（支付宝）
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.rsp.Response queryAlipayRefund(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryAlipayRefund", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryAlipayRefund", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2016.rsp.Response.unmarshal(in);
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
	 * 预约挂号订单查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Response queryOrder(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryOrder", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryOrder", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2017.rsp.Response.unmarshal(in);
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
	 * 根据主科室查子列表科室
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Response queryOfficesByMainOffice(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryOfficesByMainOffice", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryOfficesByMainOffice", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2018.rsp.Response.unmarshal(in);
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
	 * 预约挂号订单保存
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Response saveOrder(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "saveOrder", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " saveOrder", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2019.rsp.Response.unmarshal(in);
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
	 * 更新订单状态
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.rsp.Response updateOrder(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "updateOrder", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " updateOrder", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2021.rsp.Response.unmarshal(in);
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
	 * 满意度调查保存
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2022.rsp.Response saveQuestionnaire(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2022.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "saveQuestionnaire", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " saveQuestionnaire", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2022.rsp.Response.unmarshal(in);
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
	 * 查询满意度调查
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Response queryQuestionnaire(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryQuestionnaire", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryQuestionnaire", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2023.rsp.Response.unmarshal(in);
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
	 * 健康体检列表查询2
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.rsp.Response getHealexamInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getHealexamInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getHealexamInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2024.rsp.Response.unmarshal(in);
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
	 * 健康体检详情查询2
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Response getHealexamInfoDetail(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getHealexamInfoDetail", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getHealexamInfoDetail", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2025.rsp.Response.unmarshal(in);
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
	 * 药品、检查检验单缴费订单保存
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Response savePayOrder(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "savePayOrder", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " savePayOrder", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2026.rsp.Response.unmarshal(in);
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
	 * 待评价就诊信息查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Response queryEvaluateList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryEvaluateList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryEvaluateList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED2027.rsp.Response.unmarshal(in);
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
	 * 医疗服务查询（门诊，住院列表查询）
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Response getOutpatientList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getOutpatientList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getOutpatientList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3001.rsp.Response.unmarshal(in);
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
	 * 医疗服务查询-门诊详情查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Response getOutpatientDetails(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getOutpatientDetails", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getOutpatientDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3002.rsp.Response.unmarshal(in);
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
	 * 医疗服务查询-住院详情查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Response getInpatientDetails(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getInpatientDetails", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getInpatientDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3003.rsp.Response.unmarshal(in);
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
	 * 健康体检列表查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp.Response getHealexamList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getHealexamList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getHealexamList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3004.rsp.Response.unmarshal(in);
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
	 * 健康体检详情查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp.Response getHealexamDetails(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getHealexamDetails", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getHealexamDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3005.rsp.Response.unmarshal(in);
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
	 * 预防接种列表查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Response getVaccList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getVaccList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getVaccList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3006.rsp.Response.unmarshal(in);
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
	 * 预防接种详情查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Response getVaccDetails(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getVaccDetails", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getVaccDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3007.rsp.Response.unmarshal(in);
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
	 * 血压列表查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Response getHyperList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getHyperList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getHyperList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3008.rsp.Response.unmarshal(in);
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
	 * 血压列表详情查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3009.rsp.Response getHyperDetails(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3009.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getHyperDetails", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getHyperDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3009.rsp.Response.unmarshal(in);
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
	 * 血糖列表查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3010.rsp.Response getDiabetesList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3010.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getDiabetesList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getDiabetesList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3010.rsp.Response.unmarshal(in);
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
	 * 血糖详情查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Response getDiabetesDetails(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getDiabetesDetails", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getDiabetesDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3011.rsp.Response.unmarshal(in);
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
	 * 传染病报告列表查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Response getInfectList(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getInfectList", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getInfectList", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3012.rsp.Response.unmarshal(in);
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
	 * 传染病报告详情查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Response getInfectDetails(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getInfectDetails", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getInfectDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3013.rsp.Response.unmarshal(in);
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
	 * 查取人基本信息、生活环境信息、档案管理信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Response getBaseinfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "getBaseinfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " getBaseinfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3014.rsp.Response.unmarshal(in);
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
	 * 查取个人健康摘要信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Response queryHealthSummaryInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryHealthSummaryInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryHealthSummaryInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED3015.rsp.Response.unmarshal(in);
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
	 * 身体部位查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Response queryBodyPartInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryBodyPartInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryBodyPartInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5001.rsp.Response.unmarshal(in);
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
	 * 症状查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5002.rsp.Response querySymptomInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5002.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "querySymptomInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " querySymptomInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5002.rsp.Response.unmarshal(in);
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
	 * 相关症状查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Response queryRelSymptomInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryRelSymptomInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryRelSymptomInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5003.rsp.Response.unmarshal(in);
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
	 * 疾病信息查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Response queryDiseaseInfo(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryDiseaseInfo", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryDiseaseInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5004.rsp.Response.unmarshal(in);
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
	 * 病因查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5005.rsp.Response queryCauseDisease(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5005.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryCauseDisease", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryCauseDisease", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5005.rsp.Response.unmarshal(in);
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
	 * 治疗方案查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5006.rsp.Response querySchedule(com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5006.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "querySchedule", reqContent);
			wiseMedicalServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " querySchedule", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.wiseMedicalService.bean.ED5006.rsp.Response.unmarshal(in);
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

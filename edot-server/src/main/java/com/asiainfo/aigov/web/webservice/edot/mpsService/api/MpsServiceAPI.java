package com.asiainfo.aigov.web.webservice.edot.mpsService.api;

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
public class MpsServiceAPI {
	
	private static String accessUrl;
	
	private static String getAccessUrl(){
		if(accessUrl == null){
			accessUrl = AppPropertyUtil.getProperty("MPS_SERVICE_URL")+"/services/MpsService?wsdl";
		}
		return accessUrl;
	}
	
	/******************* 解决工具类中的注入问题 begin *******************/
	@Autowired
	private IEdHttpLogSV edHttpLogSV;
	
	private static MpsServiceAPI mpsServiceAPI;
	
	@PostConstruct
    public void init() {
		mpsServiceAPI = this;
		mpsServiceAPI.edHttpLogSV = this.edHttpLogSV;
    }
	/******************* 解决工具类中的注入问题 end *******************/
	
	/**
	 * 查取就诊卡信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Response queryPatsCardInfo(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryPatsCardInfo", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryPatsCardInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1001.rsp.Response.unmarshal(in);
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
	 * 可预约科室查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Response queryAppointDept(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryAppointDept", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryAppointDept", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1002.rsp.Response.unmarshal(in);
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
	 * 可预约医生查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.rsp.Response queryAppointDoctor(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryAppointDoctor", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryAppointDoctor", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1003.rsp.Response.unmarshal(in);
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
	 * 医生可预约号源查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Response queryRegistHid(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryRegistHid", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryRegistHid", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1004.rsp.Response.unmarshal(in);
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
	 * 预约请求写入/撤销处理
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.rsp.Response opAppoint(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "opAppoint", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " opAppoint", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1005.rsp.Response.unmarshal(in);
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
	 * 挂号请求写入/撤销处理
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Response opRegist(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "opRegist", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " opRegist", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1006.rsp.Response.unmarshal(in);
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
	 * 查询挂号预约订单状态
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.rsp.Response queryPatsRegistStatus(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryPatsRegistStatus", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryPatsRegistStatus", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1007.rsp.Response.unmarshal(in);
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
	 * 预约订单查询
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1008.rsp.Response queryAppointOrder(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1008.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryAppointOrder", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryAppointOrder", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1008.rsp.Response.unmarshal(in);
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
	 * 查询申请单记录
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Response queryAppPayInfo(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryAppPayInfo", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryAppPayInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1009.rsp.Response.unmarshal(in);
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
	 * 待缴费请求写入
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp.Response opPay(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "opPay", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " opPay", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1010.rsp.Response.unmarshal(in);
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
	 * 退费请求写入（接口尚未开放）
	 * @param req
	 * @return
	 */
	@Deprecated
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.rsp.Response opRefunds(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "opRefunds", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " opRefunds", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1011.rsp.Response.unmarshal(in);
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
	 * 查阅检验记录概要信息概
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Response queryCheckListMaster(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryCheckListMaster", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryCheckListMaster", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1012.rsp.Response.unmarshal(in);
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
	 * 查阅检验记录详细信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Response queryCheckListDetails(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryCheckListDetails", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryCheckListDetails", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1013.rsp.Response.unmarshal(in);
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
	 * 查阅检查记录信息概要
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Response queryExamMaster(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryExamMaster", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryExamMaster", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1014.rsp.Response.unmarshal(in);
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
	 * 居民健康卡注册
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response healthCardRegistration(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "healthCardRegistration", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " healthCardRegistration", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1015.rsp.Response.unmarshal(in);
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
	 * 查询同步医院基本信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response queryHospitalInfo(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryHospitalInfo", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryHospitalInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1016.rsp.Response.unmarshal(in);
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
	 * 查询同步科室基本信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp.Response queryDeptInfo(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryDeptInfo", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryDeptInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1017.rsp.Response.unmarshal(in);
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
	 * 查询同步医生基本信息
	 * @param req
	 * @return
	 */
	public static com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1018.rsp.Response queryDoctorInfo(com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1018.req.Request req) {
		StringWriter out = null;
		StringReader in = null;
		try {
			out = new StringWriter();
			req.marshal(out);
			String reqContent = out.toString();
			String rspContent = WebServiceUtils.send(getAccessUrl(), "queryDoctorInfo", reqContent);
			mpsServiceAPI.edHttpLogSV.saveHttpLog(IEdHttpLogSV.LOG_TYP_WS, accessUrl + " queryDoctorInfo", reqContent, rspContent);
			in = new StringReader(rspContent);
			return com.asiainfo.aigov.web.webservice.edot.mpsService.bean.ED1018.rsp.Response.unmarshal(in);
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

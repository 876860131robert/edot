package com.asiainfo.aigov.web.controller.edot.hotLine;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.common.cache.redis.JRedisPoolUtils;
import com.asiainfo.aigov.model.Page;
import com.asiainfo.aigov.model.edot.hotLine.HotMail;
import com.asiainfo.aigov.model.edot.hotLine.HotMailExample;
import com.asiainfo.aigov.service.edot.hotLine.IHotMailService;
import com.asiainfo.aigov.web.controller.edot.work.WorkConstants;
import com.asiainfo.aigov.web.http.edot.HotLineService.api.HotLineServiceAPI;
import com.asiainfo.aigov.web.http.edot.HotLineService.bean.SQInfo;
import com.asiainfo.aigov.web.http.edot.HotLineService.bean.SQList;
import com.asiainfo.aigov.web.http.edot.userService.bean.UserInfo;
import com.asiainfo.frame.annotation.Remarks;
import com.asiainfo.frame.annotation.User;
import com.asiainfo.frame.controller.BaseController;
import com.asiainfo.frame.exception.AIException;
import com.asiainfo.frame.model.AjaxResponse;
import com.asiainfo.frame.model.UserSessionInfo;
import com.asiainfo.frame.servlet.ImageServlet;
import com.asiainfo.frame.utils.SessionUtil;

/**
* @ClassName: HotMailController
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2017年7月24日 下午4:48:30
* 
*/
@Controller
@RequestMapping("/hotMail")
public class HotMailController extends BaseController {

	@Autowired
	private IHotMailService hotMailService;
	@Autowired
	private JRedisPoolUtils jRedisPoolUtils;
	
	@RequestMapping("/saveHotMail")
	@ResponseBody
	@Remarks("信箱保存")
	@User
	public AjaxResponse saveHotMail(HttpServletRequest request, HotMail hotMail, @RequestParam String code) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		if(/*!"XLHS".equals(code) &&*/ !ImageServlet.validateCode(request, code)) {
			throw new AIException("验证码不正确！");
		}

		UserSessionInfo userInfo = SessionUtil.getUserSessionInfo(request);

		UserInfo u = (UserInfo) userInfo.getUser();

		hotMailService.add(hotMail, u);
		return resp;
	}

	@RequestMapping("/selectHotMailList")
	@ResponseBody
	@Remarks("信箱列表")
	public AjaxResponse selectHotMailList(@RequestParam String userId, @RequestParam String modelId, @RequestParam(defaultValue = "1") String curPage, @RequestParam(defaultValue = "10") String pageSize) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		List<HotMail> list2 = new ArrayList<HotMail>();
		list2 = (List<HotMail>) jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_MAIL_LIST+"_"+userId+"_"+modelId+"_"+curPage+"_"+pageSize);
		if (list2 == null) {
			Page page = new Page();
			page.setPageIndex(Integer.valueOf(curPage));
			page.setPageSize(Integer.valueOf(pageSize));
			HotMailExample example = new HotMailExample();
			example.createCriteria().andCreateIdEqualTo(userId);
			example.createCriteria().andModelIdEqualTo(modelId);	// 添加条件
			List<HotMail> list = hotMailService.select(example, page);
			if(list != null) {
				for(int i = 0; i < list.size(); i++) {
					HotMail mail = list.get(i);
					String modelId2 = mail.getModelId();
					String hotMailDept = "办事咨询";
					if("1".equals(modelId2)) {
						hotMailDept = "市长信箱";
					} else if("4".equals(modelId2)) {
						hotMailDept = "部门信箱";
					} else if("9".equals(modelId2)) {
						hotMailDept = "掌上信访";
					} else if("5".equals(modelId2)) {
						hotMailDept = "办事咨询";
					}
					mail.setHotMailDept(hotMailDept);
					list2.add(mail);
				}
				jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_MAIL_LIST+"_"+userId+"_"+modelId+"_"+curPage+"_"+pageSize, list2, 3600);
			}
		}
		resp.setData(list2);
		return resp;
	}

	@RequestMapping("/getHotMailList")
	@ResponseBody
	@Remarks("公开信箱列表")
	public AjaxResponse getHotMailList(String modelId, String curPageNum, String pageCount) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		List<SQList> list = null;
		list = (List<SQList>) jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_MAIL_LIST+"_"+modelId+"_"+curPageNum+"_"+pageCount);
		if (list == null) {
			String deptId = "";
			// 市长信箱
			if("1".equals(modelId)) {
				deptId = "71";
				// 部门信箱
			} else if("4".equals(modelId)) {
				deptId = "71";
				// 掌上信访
			} else if("9".equals(modelId)) {
				deptId = "34";
			} else if("10".equals(modelId)){
				modelId="4";
				deptId = "33";
			}else if("11".equals(modelId)){
				modelId="4";
				deptId = "30";
			}
			list = HotLineServiceAPI.SQList(modelId, pageCount, deptId, curPageNum, "", "", SQList.class);
			for (SQList sqList : list) {
				String []mc = sqList.getModel_cname().split("-");
				if (mc.length > 1) {
					sqList.setModel_cname(mc[1]);
				}
			}
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_MAIL_LIST+"_"+modelId+"_"+curPageNum+"_"+pageCount, list, 3600);
		}
		resp.setData(list);
		return resp;
	}

	@RequestMapping("/getHotMailInfo")
	@ResponseBody
	@Remarks("公开信箱详情")
	public AjaxResponse getHotMailInfo(String sqId) throws Exception {
		AjaxResponse resp = new AjaxResponse();
		SQInfo info = (SQInfo) jRedisPoolUtils.get(WorkConstants.REDIS_DOMAIN_MAIL_DETAIL+"_"+sqId);
		if (info == null) {
			info = HotLineServiceAPI.getAppealConent(sqId);
			jRedisPoolUtils.set(WorkConstants.REDIS_DOMAIN_MAIL_DETAIL+"_"+sqId, info, 3600);
		}
		resp.setData(info);
		return resp;
	}

}

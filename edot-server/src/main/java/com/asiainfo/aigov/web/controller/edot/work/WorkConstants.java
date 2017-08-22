package com.asiainfo.aigov.web.controller.edot.work;


/**
 * @author songxiaoliang
 */
public class WorkConstants {
	public static final String ITEM_TYPE_COMMON = "1";	//条目类型：一般类型
	public static final String ITEM_TYPE_MULT 	= "2";	//条目类型：多子条目

	public static final String USER_WORK_UNREAD = "0";	//用户办事已读状态：已读
	public static final String USER_WORK_READ 	= "1";	//用户办事已读状态：未读

	public static final String USER_WORK_STATUS_APPLY 		= "1";	//用户办事状态：已申请
	public static final String USER_WORK_STATUS_FINISHED 	= "2";	//用户办事状态：完成
	public static final String USER_WORK_STATUS_EXCEPTION 	= "3";	//用户办事状态：异常
	
	public static final String REDIS_DOMAIN_WROK_UNREAD_COUNT = "WROK_UNREAD_COUNT"; //未读办事统计redis中的domain编码
	public static final String REDIS_DOMAIN_CONSULT_UNREAD_COUNT = "CONSULT_UNREAD_COUNT"; //未读沟通redis中的domain编码
	
	public static final String HOTMAIL_MODEL_ID_WORK_GUIDE = "5"; //办事咨询

	public static final String WORK_TYPE_PERSON 	= "001"; //个人办事
	public static final String WORK_TYPE_COMPANY 	= "002"; //企业办事
	public static final String WORK_TYPE_DEPT	 	= "003"; //部门办事
	
	public static final String CLASS_TYPE_PERSON 	= "1"; //个人办事
	public static final String CLASS_TYPE_COMPANY 	= "2"; //企业办事
	
	public static final String REDIS_DOMAIN_NEWS_LIST = "NEWS_LIST"; //新闻列表缓存
	public static final String REDIS_DOMAIN_NEWS_INFO = "NEWS_INFO"; //新闻详情缓存
	
	public static final String GET_REGION_CODE_BY_NAME = "GET_REGION_CODE_BY_NAME"; //通过区县名称获取编码
	
	public static final String REDIS_DOMAIN_WORK_LIST = "WORK_LIST"; //办事列表缓存
	public static final String REDIS_DOMAIN_WORK_MORE = "WORK_MORE"; //办事更多缓存
	
	public static final String REDIS_DOMAIN_MAIL_LIST = "MAIL_LIST"; //信箱列表缓存
	public static final String REDIS_DOMAIN_MAIL_DETAIL = "MAIL_DETAIL"; //信箱详情缓存
	
	public static final String REDIS_DOMAIN_MY_WEATHER = "MY_WEATHER"; //我的天气
	public static final String REDIS_DOMAIN_MY_CITY = "MY_CITY"; //我所在的城市
	
	public static final String CACHE_TYPE_NEWS = "news";	//缓存类型
}

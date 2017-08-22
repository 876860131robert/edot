package com.asiainfo.aigov.web.http.edot.newsService.bean;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.frame.utils.AppPropertyUtil;

/**
 * 新闻信息类(58个字段：列表52、信息+3、视频+3)
 * @author asus
 *
 */
public class NewsInfo implements Serializable {

	private static final long serialVersionUID = 8810190137186320238L;

	private String app_id;
	
	private int att_id;

	private String author;//作者

	private String auto_desc;

	private String cat_cname;

	private int cat_id;

	private int comment_num;

	private String content_url;

	private int day_hits;

	private String description;//摘要

	private String down_dtime;

	private String editor;//编辑

	private int final_status;

	private int from_id;

	private int hits;

	private int i_ver;

	private int id;
	
	private String info_content;//新闻内容

	private String info_description;

	private int info_id;

	private String info_keywords;

	private int info_status;

	private String input_dtime;

	private int input_user;

	private int is_allow_comment;

	private int is_am_tupage;

	private int is_auto_down;

	private int is_auto_up;

	private int is_host;

	private int is_pic;

	private String lasthit_dtime;

	private int model_id;

	private String modify_dtime;

	private int modify_user;

	private int month_hits;

	private String opt_dtime;

	private int page_count;
	
	private int play_time;

	private String pre_title;//标题前缀
	
	private int prepage_wcount;

	private String released_dtime;//发表时间(发布时间)

	private String site_id;//资讯:CMSxy,投资:CMSzsj,旅游:CMSwwly

	private String source;//来源

	private int step_id;

	private String subtitle;//副标题

	private String tags;

	private String thumb_url;//缩略图

	private String title;//标题

	private String title_color;

	private int title_hashkey;

	private String top_title;//上标题

	private int tupage_num;

	private String up_dtime;
	
	private String video_path;

	private int week_hits;

	private int weight;

	private int wf_id;
	
	private int word_count;
	
	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String appId) {
		app_id = appId;
	}

	public int getAtt_id() {
		return att_id;
	}

	public void setAtt_id(int attId) {
		att_id = attId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuto_desc() {
		return auto_desc;
	}

	public void setAuto_desc(String autoDesc) {
		auto_desc = autoDesc;
	}

	public String getCat_cname() {
		return cat_cname;
	}

	public void setCat_cname(String catCname) {
		cat_cname = catCname;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int catId) {
		cat_id = catId;
	}

	public int getComment_num() {
		return comment_num;
	}

	public void setComment_num(int commentNum) {
		comment_num = commentNum;
	}

	public String getContent_url() {
		return content_url;
	}

	public void setContent_url(String contentUrl) {
		content_url = contentUrl;
	}

	public int getDay_hits() {
		return day_hits;
	}

	public void setDay_hits(int dayHits) {
		day_hits = dayHits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDown_dtime() {
		return down_dtime;
	}

	public void setDown_dtime(String downDtime) {
		down_dtime = downDtime;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getFinal_status() {
		return final_status;
	}

	public void setFinal_status(int finalStatus) {
		final_status = finalStatus;
	}

	public int getFrom_id() {
		return from_id;
	}

	public void setFrom_id(int fromId) {
		from_id = fromId;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getI_ver() {
		return i_ver;
	}

	public void setI_ver(int iVer) {
		i_ver = iVer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo_content() {
		return info_content;
	}

	public void setInfo_content(String infoContent) {
		info_content = infoContent;
	}

	public String getInfo_description() {
		return info_description;
	}

	public void setInfo_description(String infoDescription) {
		info_description = infoDescription;
	}

	public int getInfo_id() {
		return info_id;
	}

	public void setInfo_id(int infoId) {
		info_id = infoId;
	}

	public String getInfo_keywords() {
		return info_keywords;
	}

	public void setInfo_keywords(String infoKeywords) {
		info_keywords = infoKeywords;
	}

	public int getInfo_status() {
		return info_status;
	}

	public void setInfo_status(int infoStatus) {
		info_status = infoStatus;
	}

	public String getInput_dtime() {
		return input_dtime;
	}

	public void setInput_dtime(String inputDtime) {
		input_dtime = inputDtime;
	}

	public int getInput_user() {
		return input_user;
	}

	public void setInput_user(int inputUser) {
		input_user = inputUser;
	}

	public int getIs_allow_comment() {
		return is_allow_comment;
	}

	public void setIs_allow_comment(int isAllowComment) {
		is_allow_comment = isAllowComment;
	}

	public int getIs_am_tupage() {
		return is_am_tupage;
	}

	public void setIs_am_tupage(int isAmTupage) {
		is_am_tupage = isAmTupage;
	}

	public int getIs_auto_down() {
		return is_auto_down;
	}

	public void setIs_auto_down(int isAutoDown) {
		is_auto_down = isAutoDown;
	}

	public int getIs_auto_up() {
		return is_auto_up;
	}

	public void setIs_auto_up(int isAutoUp) {
		is_auto_up = isAutoUp;
	}

	public int getIs_host() {
		return is_host;
	}

	public void setIs_host(int isHost) {
		is_host = isHost;
	}

	public int getIs_pic() {
		return is_pic;
	}

	public void setIs_pic(int isPic) {
		is_pic = isPic;
	}

	public String getLasthit_dtime() {
		return lasthit_dtime;
	}

	public void setLasthit_dtime(String lasthitDtime) {
		lasthit_dtime = lasthitDtime;
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int modelId) {
		model_id = modelId;
	}

	public String getModify_dtime() {
		return modify_dtime;
	}

	public void setModify_dtime(String modifyDtime) {
		modify_dtime = modifyDtime;
	}

	public int getModify_user() {
		return modify_user;
	}

	public void setModify_user(int modifyUser) {
		modify_user = modifyUser;
	}

	public int getMonth_hits() {
		return month_hits;
	}

	public void setMonth_hits(int monthHits) {
		month_hits = monthHits;
	}

	public String getOpt_dtime() {
		return opt_dtime;
	}

	public void setOpt_dtime(String optDtime) {
		opt_dtime = optDtime;
	}

	public int getPage_count() {
		return page_count;
	}

	public void setPage_count(int pageCount) {
		page_count = pageCount;
	}

	public int getPlay_time() {
		return play_time;
	}

	public void setPlay_time(int playTime) {
		play_time = playTime;
	}

	public String getPre_title() {
		return pre_title;
	}

	public void setPre_title(String preTitle) {
		pre_title = preTitle;
	}

	public int getPrepage_wcount() {
		return prepage_wcount;
	}

	public void setPrepage_wcount(int prepageWcount) {
		prepage_wcount = prepageWcount;
	}

	public String getReleased_dtime() {
		return released_dtime;
	}

	public void setReleased_dtime(String releasedDtime) {
		released_dtime = releasedDtime;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String siteId) {
		site_id = siteId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getStep_id() {
		return step_id;
	}

	public void setStep_id(int stepId) {
		step_id = stepId;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getThumb_url() {
		if(StringUtils.isNotEmpty(thumb_url) && !(thumb_url.startsWith("http://") || thumb_url.startsWith("https://"))){
			if("CMSxy".equals(this.site_id)){
				return AppPropertyUtil.getProperty("NEWS_SERVICE_URL")+thumb_url;
			} else if("CMSzsj".equals(this.site_id)){
				return AppPropertyUtil.getProperty("NEWS2_SERVICE_URL")+thumb_url;
			} else if("CMSwwly".equals(this.site_id)){
				return AppPropertyUtil.getProperty("NEWS3_SERVICE_URL")+thumb_url;
			} else {
				return thumb_url;
			}
		} else {
			return thumb_url;
		}
	}

	public void setThumb_url(String thumbUrl) {
		thumb_url = thumbUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle_color() {
		return title_color;
	}

	public void setTitle_color(String titleColor) {
		title_color = titleColor;
	}

	public int getTitle_hashkey() {
		return title_hashkey;
	}

	public void setTitle_hashkey(int titleHashkey) {
		title_hashkey = titleHashkey;
	}

	public String getTop_title() {
		return top_title;
	}

	public void setTop_title(String topTitle) {
		top_title = topTitle;
	}

	public int getTupage_num() {
		return tupage_num;
	}

	public void setTupage_num(int tupageNum) {
		tupage_num = tupageNum;
	}

	public String getUp_dtime() {
		return up_dtime;
	}

	public void setUp_dtime(String upDtime) {
		up_dtime = upDtime;
	}

	public String getVideo_path() {
		return video_path;
	}

	public void setVideo_path(String videoPath) {
		video_path = videoPath;
	}

	public int getWeek_hits() {
		return week_hits;
	}

	public void setWeek_hits(int weekHits) {
		week_hits = weekHits;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWf_id() {
		return wf_id;
	}

	public void setWf_id(int wfId) {
		wf_id = wfId;
	}

	public int getWord_count() {
		return word_count;
	}

	public void setWord_count(int wordCount) {
		word_count = wordCount;
	}
	
}

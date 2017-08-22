package com.asiainfo.aigov.web.http.edot.newsService.bean;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.frame.utils.AppPropertyUtil;

public class NewsList implements Serializable {

	private static final long serialVersionUID = 8621236379252624586L;

	private int info_id;
	
	private String title;//标题
	
	private String thumb_url;//缩略图
	
	private String source;//来源
	
	private String released_dtime;//发表时间(发布时间)
	
	private String content_url;
	
	private int cat_id;
	
	private String site_id;//资讯:CMSxy,投资:CMSzsj,旅游:CMSwwly

	public int getInfo_id() {
		return info_id;
	}

	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getReleased_dtime() {
		return released_dtime;
	}

	public void setReleased_dtime(String released_dtime) {
		this.released_dtime = released_dtime;
	}

	public String getContent_url() {
		return content_url;
	}

	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}
	
}

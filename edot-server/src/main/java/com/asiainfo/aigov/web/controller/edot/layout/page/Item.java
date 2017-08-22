package com.asiainfo.aigov.web.controller.edot.layout.page;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.frame.utils.StringUtil;


/**
 * 页面基本条目，如文本，文件，图片等
 * @author songxiaoliang
 */
public class Item implements Serializable {
	private static final long serialVersionUID = -4548145564587767691L;
	private String id;
	private String label;
	private String value;
	private String desc;
	/**
	 * 类型：文本-text；
	 * 		按钮-btn；
	 * 		图片-img；
	 * 		附件-file；
	 * 		一个区域里的头-head；
	 * 		输入文本-input-text；
	 * 		输入文件-input-file；
	 */
	private String type;	
	
	public Item(String label, String value, String type) {
		super();
		this.label = label;
		this.value = value;
		this.type = type;
	}

	public Item() {
		super();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		if(StringUtils.isNotBlank(value)){
			return StringUtil.htmlLineToBr(value);
		}
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLabel() {
		if(StringUtils.isNotBlank(label)){
			return StringUtil.htmlLineToBr(label);
		}
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDesc() {
		if(StringUtils.isNotBlank(desc)){
			return StringUtil.htmlLineToBr(desc);
		}
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}

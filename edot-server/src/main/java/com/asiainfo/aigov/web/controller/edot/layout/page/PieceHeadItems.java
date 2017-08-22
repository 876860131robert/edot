package com.asiainfo.aigov.web.controller.edot.layout.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.asiainfo.aigov.web.controller.edot.layout.LayoutConstants;

/**
 * 页面中的块：
 * 适用于 首行为标题，下面为内容列表的布局
 * @author songxiaoliang
 */
public class PieceHeadItems implements Serializable {
	private static final long serialVersionUID = 7976584586224031288L;
	private String regionName;
	private String id;
	private String head;
	private List<Item> items = new ArrayList<Item>();
	
	public PieceHeadItems() {
	}
	public PieceHeadItems(String head) {
		super();
		this.head = head;
	}
	
	public PieceHeadItems(String regionName, String head) {
		super();
		this.regionName = regionName;
		this.head = head;
	}
	/**
	 * 根据分隔符将文本分成若干条目
	 * @param itemContent
	 * @param separator
	 */
	public void addTextItems(String itemContent, String separator){
		if(StringUtils.isNotEmpty(itemContent) && StringUtils.isNotEmpty(separator)){
			String[] textItems = itemContent.split(separator);
			for (String content : textItems) {
				items.add(new Item(null, content, LayoutConstants.ITEM_TYPE_TEXT));
			}
		}
	}
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}

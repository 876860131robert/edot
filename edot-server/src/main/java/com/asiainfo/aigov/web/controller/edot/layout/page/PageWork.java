package com.asiainfo.aigov.web.controller.edot.layout.page;

import java.util.ArrayList;
import java.util.List;


/**
 * 办事指南页面
 * @author songxiaoliang
 */
public class PageWork {
	private String head;
	private List<Item> baseinfo = new ArrayList<Item>();
	private List<PieceHeadItems> otherinfo = new ArrayList<PieceHeadItems>();
	
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public List<Item> getBaseinfo() {
		return baseinfo;
	}
	public void setBaseinfo(List<Item> baseinfo) {
		this.baseinfo = baseinfo;
	}
	public List<PieceHeadItems> getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(List<PieceHeadItems> otherinfo) {
		this.otherinfo = otherinfo;
	}
}

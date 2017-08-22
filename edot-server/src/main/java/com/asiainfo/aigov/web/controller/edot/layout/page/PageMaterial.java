package com.asiainfo.aigov.web.controller.edot.layout.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * 材料提交页
 * @author songxiaoliang
 */
public class PageMaterial {
	private Map<String,String> datas = new HashMap<String, String>();//业务数据
	private List<PieceHeadItems> titleItemsList = new ArrayList<PieceHeadItems>();

	public PieceHeadItems findTitleItems(String regionName){
		for (PieceHeadItems titleItems : titleItemsList) {
			if(regionName.equals(titleItems.getRegionName())){
				return titleItems;
			}
		}
		return null;
	}

	public List<PieceHeadItems> getTitleItemsList() {
		return titleItemsList;
	}

	public void setTitleItemsList(List<PieceHeadItems> titleItemsList) {
		this.titleItemsList = titleItemsList;
	}

	public Map<String, String> getDatas() {
		return datas;
	}

	public void setDatas(Map<String, String> datas) {
		this.datas = datas;
	}
}

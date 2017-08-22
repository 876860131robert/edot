package com.asiainfo.aigov.web.controller.edot.layout.page;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.aigov.model.edot.layout.PageItemCfg;
import com.asiainfo.aigov.web.controller.edot.layout.LayoutConstants;
import com.asiainfo.frame.utils.JsonUtil;

/**
 * @author songxiaoliang
 */
public class PageFactory {
	/**
	 * 通过静态数据创建Item
	 * @param config
	 * @return
	 */
	public static Item buildItemByStatic(PageItemCfg config) {
		Item item = new Item();
		item.setId(config.getItemId());
		item.setLabel(config.getItemLabel());
		item.setValue(config.getItemValue());
		item.setDesc(config.getItemDesc());
		item.setType(config.getItemType());
		return item;
	}
	/**
	 * 通过json数据创建Item
	 * @param jsonData
	 * @param config
	 * @return
	 */
	public static Item buildItemByJson(String jsonData, PageItemCfg config){
		Item item = new Item();
		item.setId(config.getItemId());
		item.setLabel(config.getItemLabel());
		item.setDesc(config.getItemDesc());
		item.setType(config.getItemType());
		
		String labelProperty = config.getItemLabelProperty();
		if(StringUtils.isNotBlank(labelProperty)){
			item.setLabel(JsonUtil.getValue(jsonData, labelProperty));
		}
		String valueProperty = config.getItemValueProperty();
		item.setValue(JsonUtil.getValue(jsonData, valueProperty));
		
		return item;
	}
	/**
	 * 通过json数据创建List<Item>
	 * @param jsonData
	 * @param config
	 * @return
	 */
	public static List<Item> buildItemListByJson(String jsonData, PageItemCfg config){
		List<Item> items = new ArrayList<Item>();
		String labelProperty = config.getItemLabelProperty();	//可以为空
		String valueProperty = config.getItemValueProperty();	//必填
		if(StringUtils.isNotBlank(valueProperty)){
			String[] valueProperties = valueProperty.split(",");
			for (int i = 0; i < valueProperties.length; i++) {
				String vp = valueProperties[i];
				List<String> values = JsonUtil.getValueList(jsonData, vp);
				List<String> names = null;
				try {
					String np = labelProperty.split(",")[i];
					if(StringUtils.isNotBlank(np)){
						names = JsonUtil.getValueList(jsonData, np);
					}
				} catch (Exception e) {
					// ignore
				}
				
				for (int j = 0; j < values.size(); j++) {
					Item item = new Item();
					item.setType(config.getItemType());
					item.setValue(values.get(j));
					if(names!=null && names.size()>j){
						item.setLabel(names.get(j));
					}
					items.add(item);
				}
			}
		}
		
		return items;
	}
	
	public static PieceHeadItems buildPieceHeadItemsByJson(String jsonData, PageItemCfg config){
		PieceHeadItems items = new PieceHeadItems(config.getItemLabel());
		items.setItems(buildItemListByJson(jsonData, config));
		return items;
	}
	
	public static PieceHeadItems buildPieceHeadItemsByStatic(List<PageItemCfg> list){
		PieceHeadItems items = new PieceHeadItems();
		for (PageItemCfg pageItemCfg : list) {
			items.setRegionName(pageItemCfg.getRegionName());
			if(LayoutConstants.ITEM_TYPE_HEAD.equals(pageItemCfg.getItemType())){
				items.setHead(pageItemCfg.getItemLabel());
			}else{
				Item item = buildItemByStatic(pageItemCfg);
				items.getItems().add(item);
			}
		}
		return items;
	}
	
	public static PageMaterial buildPageMaterial(List<PageItemCfg> list){
		PageMaterial material = new PageMaterial();
		Map<String,List<PageItemCfg>> regionMap = new LinkedHashMap<String, List<PageItemCfg>>();
		for (PageItemCfg pageItemCfg : list) {
			String regionName = pageItemCfg.getRegionName();
			if(regionMap.get(regionName)==null){
				regionMap.put(regionName, new ArrayList<PageItemCfg>());
			}
			regionMap.get(regionName).add(pageItemCfg);
		}
		for(List<PageItemCfg> cfgList: regionMap.values()){
			PieceHeadItems pht = buildPieceHeadItemsByStatic(cfgList);
			material.getTitleItemsList().add(pht);
		}
		
		return material;
	}
	
	public static PageWork buildPageWork(String jsonData, List<PageItemCfg> list){
		PageWork work = new PageWork();
		for (PageItemCfg config : list) {
			if("baseinfo".equals(config.getRegionName())){
				if(LayoutConstants.VALUE_MODE_STATIC.equals(config.getValueMode())){
					work.getBaseinfo().add(buildItemByStatic(config));
				}
				else if(LayoutConstants.VALUE_MODE_JSON.equals(config.getValueMode())){
					work.getBaseinfo().add(buildItemByJson(jsonData, config));
				}
			}
			else if("otherinfo".equals(config.getRegionName())){
				if(LayoutConstants.VALUE_MODE_JSON.equals(config.getValueMode())){
					work.getOtherinfo().add(buildPieceHeadItemsByJson(jsonData, config));
				}
			}
		}
		
		return work;
	}
	
	
}

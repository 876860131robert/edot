package com.asiainfo.aigov.service.edot.system;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.aigov.model.edot.system.Feature;

/**
 * @author songxiaoliang
 */
public class FeatureRoot {
	private List<Feature> data = new ArrayList<Feature>();

	public List<Feature> getData() {
		return data;
	}

	public void setData(List<Feature> data) {
		this.data = data;
	}
	
}

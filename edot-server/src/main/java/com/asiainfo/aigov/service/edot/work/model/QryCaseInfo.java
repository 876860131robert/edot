package com.asiainfo.aigov.service.edot.work.model;

import java.util.List;

import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.web.webservice.edot.work.bean.CaseInfo;


public class QryCaseInfo extends CaseInfo {
	private List<Material> materialList;

	public List<Material> getMaterialList() {
		return materialList;
	}

	public void setMaterialList(List<Material> materialList) {
		this.materialList = materialList;
	}
	
}

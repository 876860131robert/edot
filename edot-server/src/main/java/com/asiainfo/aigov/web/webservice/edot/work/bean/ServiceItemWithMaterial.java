package com.asiainfo.aigov.web.webservice.edot.work.bean;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.aigov.model.edot.work.Material;
import com.asiainfo.aigov.model.edot.work.ServiceItem;

/**
 * @author songxiaoliang
 */
public class ServiceItemWithMaterial {
	private ServiceItem serviceItem;
	private List<Material> matertials = new ArrayList<Material>();
	
    public ServiceItem getServiceItem() {
		return serviceItem;
	}

	public void setServiceItem(ServiceItem serviceItem) {
		this.serviceItem = serviceItem;
	}

	public List<Material> getMaterials() {
		return matertials;
	}

	public void setMaterials(List<Material> matertials) {
		this.matertials = matertials;
	}
}

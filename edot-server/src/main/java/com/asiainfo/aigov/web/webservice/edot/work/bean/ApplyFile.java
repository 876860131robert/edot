package com.asiainfo.aigov.web.webservice.edot.work.bean;

import java.util.Random;

import com.asiainfo.frame.utils.FileUtil;

/**
 * 用户办事申请材料文件
 * @author songxiaoliang
 */
public class ApplyFile {
	private String mateno;			//材料编号
	private String originalName;
	private byte[] buffer;
	
	//文件名：材料编号__时间戳.文件后缀；如：610400000000LY000-XK-0003-CL005__8787857576.jpg
	public String getFileName(){
		Random random = new Random();
		int rd = random.nextInt(1000);
		long timeMillis = System.currentTimeMillis()+rd;
//		return mateno+"__"+timeMillis+"."+FileUtil.getSuffixName(originalName);
		return mateno+"__"+originalName;
	}
	
	public String getMateno() {
		return mateno;
	}
	public void setMateno(String mateno) {
		this.mateno = mateno;
	}
	
	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	public byte[] getBuffer() {
		return buffer;
	}

	public void setBuffer(byte[] buffer) {
		this.buffer = buffer;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			ApplyFile applyFile = new ApplyFile();
			applyFile.setMateno("610400000000LY000-XK-0003-CL005");
			applyFile.setOriginalName("阿斯钢.jpg");
			System.out.println(applyFile.getFileName());
		}
	}
}

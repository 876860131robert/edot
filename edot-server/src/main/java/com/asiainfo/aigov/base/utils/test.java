package com.asiainfo.aigov.base.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import com.asiainfo.frame.utils.FileUtil;

import sun.misc.BASE64Encoder;

public class test {
	public static String imgBase64Trans(String imgPath)throws Exception{
		BASE64Encoder en = new BASE64Encoder();
		String imgBase64 = en.encode(FileUtil.readFileAsByteArray(imgPath));
		return imgBase64;
	}

	public static void main(String[] args)throws Exception{
		System.out.println("====");
		System.out.println(imgBase64Trans("C:/vincent/test3.jpg"));
	}
}

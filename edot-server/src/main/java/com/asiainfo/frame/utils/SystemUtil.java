package com.asiainfo.frame.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Properties;

/** 
 * @Title        SystemUtil.java
 * @Description: 系统基本信息获取类
 * @author:      Administrator
 * @date:        2017年8月14日上午11:30:19 
 *  
 */
public class SystemUtil {
	
	     // 当前实例
	     private static SystemUtil currentSystem = null;
	     private static InetAddress localHost = null;
	     
	     private SystemUtil() {
	         try {
	             localHost = InetAddress.getLocalHost();
	         } catch (UnknownHostException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	         }
	     }
	 
	     /**
	      * 单例模式获取对象
	      * 
	      * @return
	      */
	     public static SystemUtil getInstance() {
	         if (currentSystem == null)
	             currentSystem = new SystemUtil();
	         return currentSystem;
	     }
	 
	     /**
	      * 获取服务器IP地址
	      * @return
	      */
	     @SuppressWarnings("unchecked")
	     public static String  getServerIp(){
	         String SERVER_IP = null;
	         try {
	             Enumeration netInterfaces = NetworkInterface.getNetworkInterfaces();
	             InetAddress ip = null;
	             while (netInterfaces.hasMoreElements()) {
	                 NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
	                 ip = (InetAddress) ni.getInetAddresses().nextElement();
	                 SERVER_IP = ip.getHostAddress();
	                 if (!ip.isSiteLocalAddress() && !ip.isLoopbackAddress()
	                         && ip.getHostAddress().indexOf(":") == -1) {
	                     SERVER_IP = ip.getHostAddress();
	                     break;
	                 } else {
	                     ip = null;
	                 }
	             }
	         } catch (SocketException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	         }
	     
	         return SERVER_IP;
	     }
	     /**
	      * 获取用户机器名称
	      * 
	      * @return
	      */
	     public static String getHostName() {
	         return localHost.getHostName();
	     }
	 
	     /**
	      * 获取C盘卷 序列号
	      * 
	      * @return
	      */
	     public String getDiskNumber() {
	         String line = "";
	         String HdSerial = "";// 记录硬盘序列号
	 
	         try {
	 
	             Process proces = Runtime.getRuntime().exec("cmd /c dir c:");// 获取命令行参数
	             BufferedReader buffreader = new BufferedReader(
	                     new InputStreamReader(proces.getInputStream()));
	 
	             while ((line = buffreader.readLine()) != null) {
	 
	                 if (line.indexOf("卷的序列号是 ") != -1) { // 读取参数并获取硬盘序列号
	 
	                     HdSerial = line.substring(line.indexOf("卷的序列号是 ")
	                             + "卷的序列号是 ".length(), line.length());
	                     break;
	                 }
	             }
	 
	         } catch (IOException e) {
	             // TODO Auto-generated catch block
	           e.printStackTrace();
	       }

	       return HdSerial;
	   }

	   /**
	    * 获取Mac地址
	    * 
	    * @return Mac地址，例如：F0-4D-A2-39-24-A6
	    */
	     public static String getLocalMac(InetAddress ia) throws SocketException {
	 		// TODO Auto-generated method stub
	 		//获取网卡，获取地址
	 		byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
	 		System.out.println("mac数组长度："+mac.length);
	 		StringBuffer sb = new StringBuffer("");
	 		for(int i=0; i<mac.length; i++) {
	 			if(i!=0) {
	 				sb.append("-");
	 			}
	 			//字节转换为整数
	 			int temp = mac[i]&0xff;
	 			String str = Integer.toHexString(temp);
	 			System.out.println("每8位:"+str);
	 			if(str.length()==1) {
	 				sb.append("0"+str);
	 			}else {
	 				sb.append(str);
	 			}
	 		}
	 		System.out.println("本机MAC地址:"+sb.toString().toUpperCase());
	 		return sb.toString().toUpperCase();
	 	}

	   /**
	    * 获取当前系统名称
	    * 
	    * @return 当前系统名，例如： windows xp
	    */
	   public static String getSystemName() {
	       Properties sysProperty = System.getProperties();
	       // 系统名称
	       String systemName = sysProperty.getProperty("os.name");
	       return systemName;
	   }

	   private static String getMacFromBytes(byte[] bytes) {
	       StringBuffer mac = new StringBuffer();
	       byte currentByte;
	       boolean first = false;
	       for (byte b : bytes) {
	           if (first) {
	               mac.append("-");
	           }
	           currentByte = (byte) ((b & 240) >> 4);
	           mac.append(Integer.toHexString(currentByte));
	           currentByte = (byte) (b & 15);
	           mac.append(Integer.toHexString(currentByte));
	           first = true;
	       }
	       return mac.toString().toUpperCase();
	   }
	
	/**
	 * 获取系统硬盘信息
	 * 
	 * @return
	 */
	public static String getDiskInfo() {  
	    StringBuffer sb=new StringBuffer();  
	    File[] roots = File.listRoots();// 获取磁盘分区列表  
	    for (File file : roots) {  
	         long totalSpace=file.getTotalSpace();  
	         long freeSpace=file.getFreeSpace();  
	         long usableSpace=file.getUsableSpace();  
	         if(totalSpace>0){  
	                         sb.append(file.getPath() + "(总计：");  
	             sb.append(Math.round(((double)totalSpace/ (1024*1024*1024))*100/100.0) + "GB  ");  
	             if(Math.round((((double)usableSpace/ (1024*1024*1024))*100)/100.0)<=1){  
	                 sb.append("剩余：" + Math.round((((double)usableSpace/ (1024*1024))*100)/100.0) + "MB)<br>");  
	             }else{  
	                 sb.append("剩余：" + Math.round((((double)usableSpace/ (1024*1024*1024))*100)/100.0) + "GB)<br>");  
	             }  
	          // sb.append("已使用" + Math.round((((double)(totalSpace-usableSpace)/(1024*1024*1024))*100)/100.0) + "G<br>");  
	         }  
	    }  
	    return sb.toString();  
	}  
	
	/**
	 * 系统内存信息
	 * 
	 * @return
	 */
	public static String getEMS() {  
	    StringBuffer sb=new StringBuffer();  
	    OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory  
	            .getOperatingSystemMXBean();  
	       sb.append("系统物理内存总计：" +  ((com.sun.management.OperatingSystemMXBean) osmb).getTotalPhysicalMemorySize()  
	            / 1024 / 1024 + "MB<br>");  
	       sb.append("系统物理可用内存总计：" +  ((com.sun.management.OperatingSystemMXBean) osmb).getFreePhysicalMemorySize()  
	            / 1024 / 1024 + "MB");  
	    return sb.toString();  
	}  
	
	/**
	 * @return
	 */
	public static String getDiskFileList() {  
        StringBuffer sb = new StringBuffer();  
        String[] fileList = null;  
        File[] roots = File.listRoots();// 获取硬盘分区列表；  
        for (File file : roots) {  
            long totalSpace = file.getTotalSpace();  
            fileList = file.list();  
            if (totalSpace > 0) {  
                sb.append(file.getPath() + "下目录和文件：");  
                for (int i = 0; i < fileList.length; i++) {  
                    sb.append(fileList[i] + "/n");  
                }  
            }  
        }  
        return sb.toString();  
    }  
	
	public static void main(String[] args) {
		getDiskFileList();
		String kk=getEMS();
		System.out.println(kk);
		InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
			String ip=addr.getHostAddress().toString(); //获取本机ip
			System.out.println(ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
}

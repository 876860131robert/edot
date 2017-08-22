<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.asiainfo.frame.utils.IpUtil"%>
<%@page import="java.net.NetworkInterface"%>
<%@page import="java.net.SocketException"%>
<%@page import="java.net.InterfaceAddress"%>
<%@page import="java.net.InetAddress"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>测试</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
</head>
<script>

</script>
<body>
<%
Enumeration<NetworkInterface> netInterfaces = null;  
try {  
    netInterfaces = NetworkInterface.getNetworkInterfaces();  
    while (netInterfaces.hasMoreElements()) {  
        NetworkInterface ni = netInterfaces.nextElement();  
        out.println("DisplayName:" + ni.getDisplayName()+"</br>");  
        out.println("Name:" + ni.getName()+"</br>");  
        Enumeration<InetAddress> ips = ni.getInetAddresses();  
        while (ips.hasMoreElements()) {  
            out.println("IP:" + ips.nextElement().getHostAddress()+"</br>");  
        }  
    }
} catch (Exception e) {
    e.printStackTrace();  
}  
%>
</body>

</html>

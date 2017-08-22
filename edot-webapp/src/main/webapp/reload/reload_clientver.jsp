<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.asiainfo.aigov.service.system.impl.SysDictManager"%>
<%@page import="com.asiainfo.aigov.service.edot.system.impl.ClientVersionManager"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>

<body>
<%
ClientVersionManager.getInstance().reload();
out.print("重新加载客户端成功！");
%>
</body>
</html>

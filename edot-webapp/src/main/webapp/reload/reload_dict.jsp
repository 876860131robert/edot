<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.asiainfo.aigov.service.system.impl.SysDictManager"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>

<body>
<%
SysDictManager.getInstance().reload();
out.print("重新加载字典成功！");
%>
</body>
</html>

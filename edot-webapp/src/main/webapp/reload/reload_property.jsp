<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.asiainfo.frame.utils.AppPropertyUtil"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>

<body>
<%
AppPropertyUtil.getInstance().reLoad();
out.print("重新加载property成功！");
%>
</body>
</html>

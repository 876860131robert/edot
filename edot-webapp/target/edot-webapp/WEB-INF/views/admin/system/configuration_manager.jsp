<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>系统信息</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
	<h2>  当前系统信息</h2>
	<hr>
</head>
<script>
</script>
<body>
	<div class="wrapper-md">
		<div class="panel panel-default">
		<br><br><br>
				<span style="margin-left: 400px">IP地址：</span><input type="text" id="key1" name="key1"  value="${IP}" readonly="readonly">
				<span style="margin-left: 60px ;position: initial;">主机名称：</span><input type="text" id="key2" name="key2" value="${hostName }" readonly="readonly" ><br><br><br>
				<span style="margin-left: 400px">MAC地址：</span><input type="text" id="key3" name="key3" value="${MAC }" readonly="readonly">
				<span style="margin-left: 42px;position: initial;">系统总内存：</span><input type="text" id="key4" name="key4" value="${totalSpace }" readonly="readonly"><br><br><br>
				<span style="margin-left: 400px">系统可用内存：</span><input type="text" id="key5" name="value5" value="${aviableSpace }" readonly="readonly" >
				<span style="margin-left: 42px">当前系统名称：</span><input type="text" id="key6" name="value6" value="${systemName }" readonly="readonly" ><br><br>
		</div>
	</div>
</body>

</html>

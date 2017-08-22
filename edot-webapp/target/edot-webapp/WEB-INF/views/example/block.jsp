<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta charset="utf-8">
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,minimum-scale=1.0, user-scalable=0" />
	<meta name="format-detection" content="telephone=no" />
	<meta name="format-detection" content="email=no" />
	<meta name="format-detection" content="address=no" />
	<meta name="apple-mobile-web-app-capable" content="yes" />

	<link rel="stylesheet" href="${ctx}/css/bootstrap.css">
	<!-- 小图标样式 -->
	<link rel="stylesheet" href="${ctx}/css/font-awesome.min.css">
	<!-- 表单验证 -->
	<link rel="stylesheet" href="${ctx}/static/jQuery-Validation-Engine-2.6.2-ciaoca/css/validationEngine.jquery.css">
	<!-- DataTables表格 -->
	<link rel="stylesheet" href="${ctx}/static/dataTables-1.10.11/css/dataTables.bootstrap.min.css">
	<link rel="stylesheet" href="${ctx}/static/czs/css/czsWebTool.css">
	<!-- 公共样式 -->
	<link rel="stylesheet" href="${ctx}/css/common.css">
	<!-- 自己模块的样式 -->
	<!-- <link rel="stylesheet" href="${ctx}/js/app/example/user.css"> -->
</head>

<body>

</body>

<script src="${ctx}/static/jquery-1.9.1.min.js"></script>
<script src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
<!-- 表单验证 -->
<script src="${ctx}/static/jQuery-Validation-Engine-2.6.2-ciaoca/js/jquery.validationEngine.js"></script>
<!-- 自定义的验证方法可以写在这里 -->
<script src="${ctx}/static/jQuery-Validation-Engine-2.6.2-ciaoca/js/jquery.validationEngine-zh_CN.js"></script>

<!-- DataTables表格 -->
<script src="${ctx}/static/dataTables-1.10.11/js/jquery.dataTables.js"></script>
<script src="${ctx}/static/dataTables-1.10.11/js/dataTables.bootstrap.js"></script>
<script src="${ctx}/static/czs/js/czsWebTool.js"></script>
<!-- 加载中样式 -->
<script src="${ctx}/static/spin/jquery.spin.merge.js"></script>
<!-- 公共JS -->
<script src="${ctx}/js/app/common.js"></script>
<!-- 自己模块的JS -->
<!-- <script src="${ctx}/js/app/example/user.js"></script> -->
<script type="text/javascript">
	var basePath = "${ctx}";
	// 加载中
	// $(obj).spinModal();
	// 加载完
	// $(obj).spinModal(false);
</script>
</html>

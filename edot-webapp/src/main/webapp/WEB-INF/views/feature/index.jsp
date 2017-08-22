<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html ng-app="app">
<head>
  <base href="${ctx}/">
  <meta charset="utf-8" />
  <title>功能设置</title>
  <%@ include file="/WEB-INF/views/common/head.inc"%>
  <link type="text/css" rel="stylesheet" href="${ctx}/js-plugs/swfupload/css/uploadify.css">
  <link type="text/css" rel="stylesheet" href="${ctx}/js-plugs/swfupload/css/uploadify.ext.css">
  <link rel="stylesheet" href="${ctx}/css/common.css" type="text/css" />
  <link rel="stylesheet" href="${ctx}/vendor/jquery/validation/jquery.validate.css" rel="stylesheet"/>  
</head>
<body>
  
  <div ui-butterbar></div>
  <div ui-jq="iframeResizer" ng-view="" id="ng-view"></div>
  <div class="main-loading" id="global-loading"><div class="loader"></div></div>
  
  <%@ include file="/WEB-INF/views/common/end.inc"%>
  <script src="${ctx}/js/log.js"></script>
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/jquery.uploadify.js" ></script>
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/jquery.uploadify.ext.js" ></script>
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/json2.js" ></script>
  <script src="${ctx}/vendor/jquery/validation/jquery.validate.js"></script>
  <script src="${ctx}/vendor/jquery/validation/messages_zh.js"></script>
  <script src="${ctx}/vendor/jquery/jquery.form.js"></script>
  
  <script type="text/javascript">
	var SiteVars = {
	    ApplicationRelativeWebRoot: '${ctx}/',
	    RelativeWebRoot: '${ctx}/',
	    SessionId: '<%=session.getId()%>'
	}
	var basePath = "${ctx}";
  </script>
  
  
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html ng-app="app">
<head>
  <base href="${ctx}/">
  <meta charset="utf-8" />
  <title></title>
  <%@ include file="/WEB-INF/views/common/head.inc"%>
  
</head>
<body>
  
	<div ui-butterbar></div>
  <div ui-jq="iframeResizer" ng-view="" id="ng-view">
  </div>
  
  <%@ include file="/WEB-INF/views/common/end.inc"%>

  <script type="text/javascript">
  	var basePath = "${ctx}";
  </script>
  
</body>
</html>
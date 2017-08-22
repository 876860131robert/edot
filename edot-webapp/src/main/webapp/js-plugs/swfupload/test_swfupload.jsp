<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>文件上传测试</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
    
	<link type="text/css" rel="stylesheet" href="${ctx}/js-plugs/swfupload/css/uploadify.css">
	<link type="text/css" rel="stylesheet" href="${ctx}/js-plugs/swfupload/css/uploadify.ext.css">
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/jquery.uploadify.js" ></script>
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/jquery.uploadify.ext.js" ></script>
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/json2.js" ></script>
<script>

$(function() {
	$('#file1').uploadifyExt({
			baseUrl:'${ctx}'
			,sessionId:'<%=session.getId()%>'
			,relationalTable:"test_table1"
			,relationalColumn:"test_column1"
			,initFileIds:"343,327"
			,addFileSuccess:function(data, fileIds){
				//alert("file1："+JSON.stringify(data));
				Logger.info(fileIds);
			}
			,removeFileSuccess: function(fileId, fileIds){
				//alert("file1："+fileId);
				Logger.info(fileIds);
			}
	    	,multi: true
	    	,fileMaxSize:'3MB'
	        //,fileTypeExts:'*.png;*.zip'
		});


	$('#file2').uploadifyExt({
		baseUrl:'${ctx}'
		,sessionId:'<%=session.getId()%>'
		,relationalTable:"test_table"
		,relationalColumn:"test_column"
		,initFileIds:"296"
		,addFileSuccess:function(data, fileIds){
			//alert("file1："+JSON.stringify(data));
			Logger.info(fileIds);
		}
		,removeFileSuccess: function(fileId, fileIds){
			//alert("file1："+fileId);
			Logger.info(fileIds);
		}
		,multi: false
		,fileMaxSize:'1MB'
	    //,fileTypeExts:'*.png;*.zip'
	});

});

function reset(){
	$('#file1').uploadifyExt("reset");
}
function printCache(){
	$('#file1').uploadifyExt('dataCache').printLog();
}
function load(){
	$('#file1').uploadifyExt("load","344,345");
}

</script>
</head>
<body>
	<input type="button" value="查看file1缓存" onclick="printCache()"/>
	<input type="button" value="重置file1" onclick="reset()"/>
	<input type="button" value="加载文件file1" onclick="load()"/>
	
	 <div style="margin: 100px 0 0 100px" id="file1"></div>
	 <br/>
	 <br/>
	 <br/>
	 <div style="margin: 100px 0 0 100px" id="file2"></div>
</body>
</html>

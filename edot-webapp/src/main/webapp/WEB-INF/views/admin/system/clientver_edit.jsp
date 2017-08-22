<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>客户端编辑</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
	
	<link type="text/css" rel="stylesheet" href="${ctx}/js-plugs/swfupload/css/uploadify.css">
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/jquery.uploadify.js" ></script>
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/jquery.uploadify.ext.js" ></script>
	<script type="text/javascript" src="${ctx}/js-plugs/swfupload/js/json2.js" ></script>
</head>
<script>
var _table;
$(function() {
	$('#file1').uploadifyExt({
		baseUrl:'${ctx}'
		,sessionId:'<%=session.getId()%>'
		,initFileIds:"${bean.sysFileId}"
    	,multi: false
    	,fileTypeExts:'*.apk;*.ipa;'
		,addFileSuccess:function(fileData){
			$("#downloadUrl").val(fileData.filePath);
    	}
    	,removeFileSuccess: function(fileId){
    		$("#sysFileId").val("");
    	}
    	,uploader:"${ctx}/admin/system/clientver/upload.do;jsessionid=<%=session.getId()%>"
    	,validateBefore: function(){
    		var success = true;
    		if($("#osName").val()==''){
    			success = false;
    			$("#osName").focus();
       			showTip("[操作系统名称]不能为空，保存的文件名将取[操作系统名称]！");
        	}
    		
    		return success;
        }
    	,getParams: function(){
    		var params = {osName: $("#osName").val()};
    		return params;
    	}
	});

});

function save(){
	var v1 = $("#latestVer").val();
	var v2 =$("#requiredMinimumVer").val();
	v1 = v1.replace(/\./g,"");
	v2 = v2.replace(/\./g,"");
	if(parseInt(v1) < parseInt(v2)){
		showTip("最新版本号不能低于要求的最低版本的版本号！");
	}else{
	ajaxSubmitForm($("#saveForm"), function(jsonData){
		parent._table.draw();
		closeDialogInIframe();
	});
	}
}
function downloadFile(url){
	window.open(basePath+url);
}
</script>
<body>
	
	<form id="saveForm" action="${ctx}/admin/system/clientver/save" method="post">
		<input type="hidden" name="isNew" value="${isNew}"/>
		<input type="hidden" name="removed" value="${bean.removed}"/>
		<input type="hidden" name="sysFileId" id="sysFileId" value="${bean.sysFileId}"/>
		
		<table class="table table-bordered table-striped">
			<tr>
				<th class="text-right" style="width:25%">操作系统名称</th>
				<td>
				<c:if test="${isNew}">
			      <input type="text" id="osName" name="osName" value="${bean.osName}"><span style="color:red">请使用字母加下划线</span>
		    	</c:if>
		    	<c:if test="${!isNew}">
		    	<input type="hidden" id="osName" name="osName" value="${bean.osName}"/>
		    	${bean.osName}
		    	</c:if>
				</td>
			</tr>
			<tr>
				<th class="text-right">最新版本号</th>
				<td><input type="text" id="latestVer" name="latestVer" value="${bean.latestVer}"></td>
			</tr>
			<tr>
				<th class="text-right">要求最低版本号</th>
				<td><input type="text" id="requiredMinimumVer" name="requiredMinimumVer" value="${bean.requiredMinimumVer}"></td>
			</tr>
			<tr>
				<th class="text-right">附件地址</th>
				<td>
					<input type="text" id="downloadUrl" name="downloadUrl" value="${bean.downloadUrl}" style="width:400px" readonly>
					<div style="padding-top: 5px" id="file1"></div>
				</td>
			</tr>
			<tr>
				<th class="text-right">备注</th>
				<td><textarea id="remark" name="remark" style="width:400px;height:80px">${bean.remark}</textarea> </td>
			</tr>
		</table>
		<div class="text-center">
        <button type="button" class="btn btn-danger" data-dismiss="modal" onclick="closeDialogInIframe()">关 闭</button>
		<button type="button" class="btn btn-success" onclick="save()">保 存</button>
	  	</div>	
	</form>
	

</body>

</html>

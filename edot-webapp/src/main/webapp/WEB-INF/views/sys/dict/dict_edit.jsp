<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>字典编辑</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
	<link rel="stylesheet" href="${ctx}/js/app/example/user.css">
	<script src="${ctx}/js/app/example/user.js"></script>
	<script>
	function save(){
		ajaxSubmitForm($("#saveForm"), function(jsonData){
			parent._table.draw();
			closeDialogInIframe();
		});
	}
	</script>
</head>

<body>
	
<form id="saveForm" action="${ctx}/sys/dict/update" method="post">
		
		<table class="table table-bordered table-striped">
			<input type="hidden" id="dictId" name="dictId" value="${bean.dictId}">
			<input type="hidden" id="dictType" name="dictType" value="${bean.dictType}">
			<input type="hidden" id="oldDictKey" name="oldDictKey" value="${bean.dictKey}">
			<c:if test="${bean.dictType=='1'}">
			<tr>
				<th class="text-right">排序</th>
				<td>
					<input type="text" id="orderNo" name="orderNo" value="${bean.orderNo}">
				</td>
			</tr>
			<tr>
				<th class="text-right">键</th>
				<td><input type="text" id="dictKey" name="dictKey" value="${bean.dictKey}"></td>
			</tr>
			</c:if>
			<c:if test="${bean.dictType=='1' || bean.dictType=='2'}">
			<tr>
				<th class="text-right">值</th>
				<td>
					<input type="text" id="dictValue" name="dictValue" value="${bean.dictValue}">
				</td>
			</tr>
			</c:if>
			<c:if test="${bean.dictType=='3' || bean.dictType=='4'}">
			<tr>
				<th class="text-right">自定义SQL</th>
				<td><textarea type="text" id="customSql" name="customSql" style="width:300px;height:200px">${bean.customSql}</textarea></td>
			</tr>
			</c:if>
		</table>
		<div class="text-center">
        <button type="button" class="btn btn-danger" data-dismiss="modal" onclick="closeDialogInIframe()">关 闭</button>
		<button type="button" class="btn btn-success" onclick="save()">保 存</button>
	  	</div>	
	</form>

</body>

</html>

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
	
<form id="saveForm" action="${ctx}/sys/dict/add" method="post">
		
		<table class="table table-bordered table-striped">
			<tr>
				<th class="text-right" style="width:25%">字典编号</th>
				<td>
					<input type="text" id="dictId" name="dictId" >
				</td>
			</tr>
			<tr>
				<th class="text-right">字典类型</th>
				<td>
					<select id="dictType" name="dictType">
						<option value="1">一般字典</option>
						<option value="2">JSON字典</option>
						<option value="3">SQL字典</option>
						<option value="4">SQL带参字典</option>
					</select>
				</td>
			</tr>
			<tr>
				<th class="text-right">排序</th>
				<td>
					<input type="text" id="orderNo" name="orderNo">
				</td>
			</tr>
			<tr>
				<th class="text-right">键</th>
				<td><input type="text" id="dictKey" name="dictKey"></td>
			</tr>
			<tr>
				<th class="text-right">值</th>
				<td>
					<input type="text" id="dictValue" name="dictValue">
				</td>
			</tr>
			<tr>
				<th class="text-right">自定义SQL</th>
				<td><textarea type="text" id="customSql" name="customSql" style="width:300px;height:200px"></textarea></td>
			</tr>
		</table>
		<div class="text-center">
        <button type="button" class="btn btn-danger" data-dismiss="modal" onclick="closeDialogInIframe()">关 闭</button>
		<button type="button" class="btn btn-success" onclick="save()">保 存</button>
	  	</div>	
	</form>

</body>

</html>

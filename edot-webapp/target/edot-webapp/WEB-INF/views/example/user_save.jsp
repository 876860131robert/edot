<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>添加用户</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
	<link rel="stylesheet" href="${ctx}/js/app/example/user.css">
	<script src="${ctx}/js/app/example/user.js"></script>
</head>

<body>
	<div class="modal-body">
		<form id="userForm" class="form-horizontal" action="${ctx}/example/save">
			<input type="hidden" name="id" id="userId" value="${user.id}"></input>
			<div class="form-group">
				<label class="col-sm-2 control-label">姓名</label>
				<div class="col-sm-10">
					<input value="${user.userName}" type="text" class="form-control validate[required,maxSize[10]]" id="userName" name="userName" placeholder="请输入姓名,长度不能超过10" data-prompt-position="topRight:-65,0"/>
				</div>
			</div>
			<div class="line line-dashed b-b line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-2 control-label">性别</label>
				<div class="col-sm-10">
					<select class="form-control" id="sex" name="sex">
						<option value="0">男</option>
						<option value="1">女</option>
					</select>
				</div>
			</div>
			<div class="line line-dashed b-b line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-2 control-label">手机号码</label>
				<div class="col-sm-10">
					<input value="${user.phone}" type="text" class="form-control validate[custom[phone]]" data-prompt-position="topRight:-65,0" id="phone" name="phone" placeholder="请输入手机号码" />
				</div>
			</div>
			<div class="line line-dashed b-b line-lg pull-in"></div>
			<div class="form-group">
				<label class="col-sm-2 control-label">地址</label>
				<div class="col-sm-10">
					<input value="${user.addr}" type="text" class="form-control" id="addr" name="addr" placeholder="请输入地址" />
				</div>
			</div>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-danger" data-dismiss="modal" onclick="closeDialogInIframe()">关 闭</button>
		<button type="button" class="btn btn-success" onclick="saveUser()">保 存</button>
	</div>

</body>

</html>

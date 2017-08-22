<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>用户管理</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
	<link rel="stylesheet" href="${ctx}/js/app/example/user.css">
	<script src="${ctx}/js/app/example/user.js"></script>
</head>

<body>

	<div class="wrapper-md">
		<div class="panel panel-default">
			<!-- <div class="panel-heading">
				标题
			</div> -->
			<!-- 内容 -->
			<div class="table-responsive">
				<!-- 表格顶部按钮等工具 -->
				<div class="tableTotal auto95 mt10 mb10">
					<div class="pull-right w300p">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="姓名" id="userNameSearch" name="example.userName">
							<span class="input-group-btn">
								<button type="button" class="btn btn-default" id="searchBtn"><i class="fa fa-search"></i></button>
							</span>
						</div>
					</div>
					<button type="button" class="btn btn-success btn-addon" onclick="testShowTip()"> 信息提示框</button>
					<button type="button" class="btn btn-success btn-addon" onclick="testShowConfirm()"> 确认选择提示框</button>
					<button type="button" class="btn btn-success btn-addon" onclick="loading(true)"> 等待层</button>
					<button type="button" class="btn btn-success btn-addon" onclick="testOpenDialogInIframe()"> iframe对话框</button>
					</br></br> 
					<button type="button" class="btn btn-success btn-addon" data-toggle="modal" onclick="toAdd()"><i class="fa fa-plus"></i> 添加</button>
					<button type="button" class="btn btn-warning btn-addon" onclick="toUpdate()"><i class="fa fa-cog"></i> 修改</button>
					<button type="button" class="btn btn-danger btn-addon" onclick="deleteBean()"><i class="fa fa-trash-o"></i> 删除</button>
				</div>
				<!-- 用户列表 -->
				<div id="tableArea" class="auto95"></div>

			</div>
		</div>
	</div>

</body>

</html>

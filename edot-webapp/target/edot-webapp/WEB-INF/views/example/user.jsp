<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>用户管理</title>
	<meta charset="utf-8">
	<meta name="description" content="">
	<meta name="keywords" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,minimum-scale=1.0, user-scalable=0" />
	<meta name="format-detection" content="telephone=no" />
	<meta name="format-detection" content="email=no" />
	<meta name="format-detection" content="address=no" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<link rel="stylesheet" href="${ctx}/css/bootstrap.css">
	<link rel="stylesheet" href="${ctx}/css/app.css">
	<link rel="stylesheet" href="${ctx}/css/font-awesome.min.css">
	<link rel="stylesheet" href="${ctx}/static/jQuery-Validation-Engine-2.6.2-ciaoca/css/validationEngine.jquery.css">
	<link rel="stylesheet" href="${ctx}/static/dataTables-1.10.11/css/dataTables.bootstrap.min.css">
	<link rel="stylesheet" href="${ctx}/static/czs/css/czsWebTool.css">
	<link rel="stylesheet" href="${ctx}/css/common.css">
	<link rel="stylesheet" href="${ctx}/js/app/example/user.css">
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
					<button type="button" class="btn btn-success btn-addon" id="addBtn" data-toggle="modal" data-target="#userModal"><i class="fa fa-plus"></i> 添加</button>
					<button type="button" class="btn btn-warning btn-addon" id="updateBtn"><i class="fa fa-cog"></i> 修改</button>
					<button type="button" class="btn btn-danger btn-addon" id="delBtn"><i class="fa fa-trash-o"></i> 删除</button>
				</div>
				<!-- 用户列表 -->
				<div id="tableArea" class="auto95"></div>

				<!-- 弹出框 -->
				<div class="modal fade" id="userModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title" id="myModalLabel">添加用户</h4>
							</div>
							<div class="modal-body">
								<form id="userForm" class="form-horizontal">
									<input type="hidden" name="id" id="userId"></input>
									<div class="form-group">
										<label class="col-sm-2 control-label">姓名</label>
										<div class="col-sm-10">
											<input type="text" class="form-control validate[required,maxSize[10]]" id="userName" name="userName" placeholder="请输入姓名,长度不能超过10" data-prompt-position="topRight:-65,0"/>
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
											<input type="text" class="form-control validate[custom[phone]]" data-prompt-position="topRight:-65,0" id="phone" name="phone" placeholder="请输入手机号码" />
										</div>
									</div>
									<div class="line line-dashed b-b line-lg pull-in"></div>
									<div class="form-group">
										<label class="col-sm-2 control-label">地址</label>
										<div class="col-sm-10">
											<input type="text" class="form-control" id="addr" name="addr" placeholder="请输入地址" />
										</div>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-danger" data-dismiss="modal">关 闭</button>
								<button type="button" class="btn btn-success" id="saveBtn">保 存</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

<script src="${ctx}/static/jquery-1.9.1.min.js"></script>
<script src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
<script src="${ctx}/static/dataTables-1.10.11/js/jquery.dataTables.js"></script>
<script src="${ctx}/static/dataTables-1.10.11/js/dataTables.bootstrap.js"></script>
<script src="${ctx}/static/jQuery-Validation-Engine-2.6.2-ciaoca/js/jquery.validationEngine.js"></script>
<script src="${ctx}/static/jQuery-Validation-Engine-2.6.2-ciaoca/js/jquery.validationEngine-zh_CN.js"></script>
<script src="${ctx}/static/spin/jquery.spin.merge.js"></script>
<script src="${ctx}/static/czs/js/czsWebTool.js?1"></script>
<script src="${ctx}/js/app/example/user.js"></script>
<script src="${ctx}/js/app/common.js"></script>
<script type="text/javascript">
var basePath = "${ctx}";
</script>
</html>

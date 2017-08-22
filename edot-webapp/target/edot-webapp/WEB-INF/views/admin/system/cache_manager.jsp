<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>缓存管理</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
</head>
<script>
function clearCache(type){
	showConfirm("确定清除？",function() {
		ajaxExecute(basePath+"/admin/system/cache/clear", {type:type}, function(jsonData){
			showTip("清除成功！");
		});
	});
}


</script>
<body>
	<div class="wrapper-md">
		<div class="panel panel-default">
			<!-- 表格顶部按钮等工具 -->
			<div class="tableTotal panel-heading font-bold">
				<div class="pull-right w300p">
					<div class="input-group">
						<span class="input-group-btn">
						</span>
					</div>
				</div>
				<button type="button" class="btn btn-success" onclick="clearCache('news')">【咨询】缓存清除</button>
			</div>
		</div>
	</div>
</body>

</html>

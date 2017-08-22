<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>城市声音评论列表</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
</head>
<script>
var _table;
$(function() {

	_table = select();
	
	/*查询*/
	$("#searchBtn").click(function(){
        _table.draw();
    });

});

function select(){
	var params = {
		id:"searchTable",
		url:basePath + '/admin/hotLine/cityVoiceReviewSelect?id=${id}',
		checkbox: false,	//是否需要添加多选框，默认不添加
		cols:[
			{
				label: "姓名",
				name: "createName"
			}
			,{
				label: "创建时间",
				name: "createDate"
			}
			,{
				label: "评论内容",
				name: "factContent"
			}
			,{
				label: "操作",
				name: "replyState",
				render:function(data, type, row, meta) {
					var html = '<a href="javascript:void(0);" onclick=deleteBean("'+row.cityVoiceId+'")><span class="label bg-success">删除</span></a>'; 
					return html;
                }
			}
			
		]
	};
	var tableHead = createTableHead(params);
	$('#tableArea').html(tableHead);
	return createTableBody(params);
}

function deleteBean(id){
	showConfirm("确定删除？",function() {
		alert(id);
		ajaxExecute(basePath+"/admin/hotLine/cityVoiceDelete", {ids:id}, function(jsonData){
			_table.draw();
		});
	});
}
</script>
<body>
		<div class="panel panel-default" style="border:0">
			<!-- 列表 -->
			<div id="tableArea"></div>
		</div>

</body>

</html>

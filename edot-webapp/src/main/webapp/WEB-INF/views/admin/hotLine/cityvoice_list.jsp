<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>城市声音管理</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
</head>
<script>
var _table;
$(function() {

	//表单验证注册
	$('#userForm').validationEngine();

	_table = select();
	
	/*查询*/
	$("#searchBtn").click(function(){
        _table.draw();
    });

});

function select(){
	var params = {
		id:"searchTable",
		url:basePath + '/admin/hotLine/cityVoiceSelect',
		checkbox: true,	//是否需要添加多选框，默认不添加
		cols:[
			{
				label: "编码",
				name: "cityVoiceId",
				hide:true
			}
			,{
				label: "姓名",
				name: "createName"
			}
			,{
				label: "创建时间",
				name: "createDate"
			}
			,{
				label: "地址定位",
				name: "address"
			}
<%--			,{--%>
<%--				label: "点赞数",--%>
<%--				name: "likeNum"--%>
<%--			}--%>
			,{
				label: "操作",
				name: "replyState",
				render:function(data, type, row, meta) {
					var html = '<a href="javascript:void(0);" onclick=detail("'+row.cityVoiceId+'")><span class="label bg-success">详情</span></a>'; 
					html += "&nbsp;";
					html += '<a href="javascript:void(0);" onclick=reviewDetail("'+row.cityVoiceId+'")><span class="label bg-success">评论详情</span></a>';
					return html;
                }
			}
			
		]
	};
	var tableHead = createTableHead(params);
	$('#tableArea').html(tableHead);
	return createTableBody(params);
}

function detail(id){
	openDialogInIframe(basePath+"/admin/hotLine/cityVoiceDetail?id="+id, "城市声音详情", 450, 600);
}
function reviewDetail(id){
	openDialogInIframe(basePath+"/admin/hotLine/toCityVoiceReviewDetail?id="+id, "城市声音评论详情", 450, 800);
}
function deleteBean(){
	var selCheckNum = $('tbody :checkbox:checked',$('#searchTable')).size();
	if(selCheckNum == 0){
		showTip("请选择要的删除的项");
	}else{
		showConfirm("确定删除？",function() {
			var ids = '';
			$('tbody :checkbox:checked',$('#searchTable')).each(function(i){
				var item = _table.row($(this).closest('tr')).data();
				ids += item.cityVoiceId + ',';
			});
			ids = ids.substring(0, ids.length - 1);
			ajaxExecute(basePath+"/admin/hotLine/cityVoiceDelete", {ids:ids}, function(jsonData){
				_table.draw();
			});
		});
	} 
}
</script>
<body>

	<div class="bg-light lter b-b wrapper-md ng-scope">
		<h1 class="m-n font-thin h3">城市声音管理</h1>
	</div>

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
				<button type="button" class="btn m-b-xs btn-sm btn-danger btn-addon" onclick="deleteBean()"><i class="fa fa-trash-o"></i> 删除</button>
			</div>
			<!-- 列表 -->
			<div id="tableArea"></div>
		</div>
	</div>

</body>

</html>

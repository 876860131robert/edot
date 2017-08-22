<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>客户端管理</title>
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
		url:basePath + '/admin/system/clientver/select',
		checkbox: true,	//是否需要添加多选框，默认不添加
		cols:[
			{
				label: "操作系统名",
				name: "osName"
			}
			,{
				label: "最新版本号",
				name: "latestVer"
			}
			,{
				label: "要求最低版本号",
				name: "requiredMinimumVer"
			}
			,{
				label: "备注",
				name: "remark"
			}
			,{
				label: "状态",
				name: "removed",
				render:function(data, type, row, meta) {
					return data==1 ? "已废除" : "已激活";
				}
			}
			,{
				label: "操作",
				name: "osName",
				render:function(data, type, row, meta) {
					var html = "";
					if(row.removed=="1"){
						//html = '<button type="button" class="btn btn-info" onclick=enable("'+row.osName+'")>激活</button>';
						html = '<a href="javascript:;" class="mr10" onclick=enable("'+row.osName+'")><span class="label bg-success">激活</span></a>'; 
					}else{
						//html = '<button type="button" class="btn btn-info" onclick=disable("'+row.osName+'")>废除</button>';
						html = '<a href="javascript:;" class="mr10" onclick=disable("'+row.osName+'")><span class="label bg-success">废除</span></a>'; 
					}
					//html = '<button type="button" class="btn btn-info" onclick=del("'+row.osName+'")>删除</button>';
					//html += '<button style="margin-left:10px" type="button" class="btn btn-info" onclick=toEdit("'+row.osName+'")>修改</button>';
					html = "";
					if(row.osName!='android' && row.osName!='ios'){
						html += '<a href="javascript:;" class="mr10" onclick=del("'+row.osName+'")><span class="label bg-success">删除</span></a>'; 
					}
					html += '<a href="javascript:;" onclick=toEdit("'+row.osName+'")><span class="label bg-success">修改</span></a>'; 

					return html;
				}
			}
			
		],
		search:[
			//id表示页面上查询值的ID属性，name表示后台取值的key，若两个值相同，则填一个即可
			{
				"id":"createNameSearch",
				"name":"createName"
			}
		]
	};
	var tableHead = createTableHead(params);
	$('#tableArea').html(tableHead);
	return createTableBody(params);
}

function dels(){
	var selCheckNum = $('tbody :checkbox:checked',$('#searchTable')).size();
	if(selCheckNum == 0){
		showTip("请选择要的废除的项");
	}else{
		showConfirm("确定废除？",function() {
			var ids = '';
			$('tbody :checkbox:checked',$('#searchTable')).each(function(i){
				var item = _table.row($(this).closest('tr')).data();
				ids += item.cityVoiceId + ',';
			});
			ids = ids.substring(0, ids.length - 1);
			ajaxExecute(basePath+"/admin/system/clientver/delete", {ids:ids}, function(jsonData){
				_table.draw();
			});
		});
	} 
}
function disable(id){
	showConfirm("确定废除？",function() {
		ajaxExecute(basePath+"/admin/system/clientver/disable", {ids:id}, function(jsonData){
			_table.draw();
		});
	});
	
}
function enable(id){
	showConfirm("确定激活？",function() {
		ajaxExecute(basePath+"/admin/system/clientver/enable", {ids:id}, function(jsonData){
			_table.draw();
		});
	});
}
function del(id){
	showConfirm("确定删除？",function() {
		ajaxExecute(basePath+"/admin/system/clientver/delete", {ids:id}, function(jsonData){
			_table.draw();
		});
	});
	
}
function toEdit(id){
	openDialogInIframe(basePath+"/admin/system/clientver/toEdit?id="+id, "客户端编辑", 450, 600);
}
function toAdd(){
	openDialogInIframe(basePath+"/admin/system/clientver/toEdit", "客户端新增", 450, 600);
}
</script>
<body>

	<div class="bg-light lter b-b wrapper-md ng-scope">
		<h1 class="m-n font-thin h3">客户端管理</h1>
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
				<button type="button" class="btn btn-success btn-addon" data-toggle="modal" onclick="toAdd()"><i class="fa fa-plus"></i> 添加</button>
			</div>
			<!-- 列表 -->
			<div id="tableArea"></div>
		</div>
	</div>

</body>

</html>

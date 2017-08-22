<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>信箱管理</title>
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
		url:basePath + '/admin/hotLine/hotMailSelect',
		checkbox: true,	//是否需要添加多选框，默认不添加
		cols:[
			{
				label: "编码",
				name: "hotMailId",
				hide:true
			}
			,{
				label: "标题",
				name: "hotMailTitle"
			}
			,{
				label: "信箱类型",
				name: "modelId_name"
			}
			,{
				label: "意见类型",
				name: "hotMailAim_name"
			}
			,{
				label: "操作",
				name: "replyState",
				render:function(data, type, row, meta) {
					var html = '<a href="javascript:void(0);" onclick=detail("'+row.hotMailId+'")><span class="label bg-success">详情</span></a>'; 
					if(data=="0"){
						//var html = '<button type="button" class="btn btn-sm btn-success btn-addon" onclick=reply("'+row.hotMailId+'")>回复</button>'
						html += "&nbsp;";
						html += '<a href="javascript:void(0);" onclick=toReply("'+row.hotMailId+'")><span class="label bg-success">回复</span></a>'; 
					}
					return html;
                }
			}
			
		],
		search:[
			//id表示页面上查询值的ID属性，name表示后台取值的key，若两个值相同，则填一个即可
			{
				"id":"modelId",
				"name":"modelId"
			}
			,{
				"id":"hotMailAim",
				"name":"hotMailAim"
			}
		]
	};
	var tableHead = createTableHead(params);
	$('#tableArea').html(tableHead);
	return createTableBody(params);
}

function detail(id){
	openDialogInIframe(basePath+"/admin/hotLine/hotMailDetail?id="+id, "信箱详情", 450, 600);
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
				ids += item.hotMailId + ',';
			});
			ids = ids.substring(0, ids.length - 1);
			ajaxExecute(basePath+"/admin/hotLine/hotMailDelete", {ids:ids}, function(jsonData){
				_table.draw();
			});
		});
	} 
}
var replyId;
function reply(id){
	replyId = id;
	showPromptMessage("回复",function(content){
		$("#replyId").val(replyId);
		$("#content").val(content);
		ajaxSubmitForm($("#replyForm"), function(data){
			_table.draw();
			closePromptMessage();
		});
	});
}
function toReply(id){
	openDialogInIframe(basePath+"/admin/hotLine/toHotMailReply?id="+id, "信箱回复", 385, 600);
}
</script>
<body>
	<div class="bg-light lter b-b wrapper-md ng-scope">
		<h1 class="m-n font-thin h3">信箱管理</h1>
	</div>

	<div class="wrapper-md">
		<div class="panel panel-default">
			<!-- 内容 -->
			<!-- <div class="table-responsive"> -->
				<!-- 表格顶部按钮等工具 -->
				<div class="tableTotal panel-heading font-bold">
					<div class="fl">
						<button type="button" class="btn btn-sm btn-danger btn-addon" onclick="deleteBean()"><i class="fa fa-trash-o"></i> 删除</button>
					</div>
					<div class="form-inline fr">
						  <div class="form-group">
						    <label for="exampleInputName2">信箱类型:</label>
						    <ai:dictSelect dictId="HOT_MAIL-MODEL_ID" styleClass="form-control" id="modelId" nullOption="true" defaultValue="" />
						  </div>
						  <div class="form-group">
						    <label for="exampleInputEmail2">意见类型:</label>
						    <ai:dictSelect dictId="HOT_MAIL_AIM" styleClass="form-control" id="hotMailAim" nullOption="true" defaultValue="" />
						  </div>
						  <div class="form-group" style>
							<button type="button" class="btn btn-default" id="searchBtn"><i class="fa fa-search"></i></button>
						  </div>
					</div>
					<div class="clear"></div>
				</div>
				<!-- 列表 -->
				<div id="tableArea"></div>
			<!-- </div> -->
		</div>
	</div>
	<form id="replyForm" action="${ctx}/admin/hotLine/hotMailReply" method="post">
		<input type="hidden" id="replyId" name="id"/>
		<input type="hidden" id="content" name="content"/>
	</form>
</body>

</html>

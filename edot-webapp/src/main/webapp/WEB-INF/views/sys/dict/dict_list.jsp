<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>字典管理</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
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
			url:basePath + '/sys/dict/select',
			checkbox: true,	//是否需要添加多选框，默认不添加
			cols:[
				{
					label: "编号",
					name: "dictId"
				}
				,{
					label: "名称",
					name: "dictName",
					hide:true
				}
				,{
					label: "类型",
					name: "dictType",
					render:function(data, type, row, meta) {
						if(data=="1"){
							return "一般字典";
						}
						else if(data=="2"){
							return "JSON字典";
						}
						if(data=="3"){
							return "SQL字典";
						}
						if(data=="4"){
							return "SQL带参字典";
						}
	                }
				}
				,{
					label: "键",
					name: "dictKey"
				}
				,{
					label: "值",
					name: "dictValue"
				}
				,{
					label: "排序",
					name: "orderNo"
				}
				,{
					label: "操作",
					render:function(data, type, row, meta) {
						var dictId = row.dictId;
						var dictType = row.dictType;
						var dictKey = row.dictKey;
						
						var html = '<button type="button" class="btn btn-info" onclick=toEdit("'+dictId+'","'+dictType+'","'+dictKey+'")>修改</button>';
						html += '<button type="button" style="margin-left:10px" class="btn btn-info" onclick=delBean("'+dictId+'","'+dictType+'","'+dictKey+'")>删除</button>'
						return html;
	                }
				}
				
			],
			search:[
				//id表示页面上查询值的ID属性，name表示后台取值的key，若两个值相同，则填一个即可
				{
					"id":"dictId",
					"name":"dictId"
				}
				,{
					"id":"dictType",
					"name":"dictType"
				}
			]
		};
		var tableHead = createTableHead(params);
		$('#tableArea').html(tableHead);
		return createTableBody(params);
	}

	function deleteBatch(){
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

	function delBean(dictId, dictType, dictKey){
		showConfirm("确定删除？",function() {
			ajaxExecute(basePath+"/sys/dict/delete", {dictId:dictId, dictType:dictType, dictKey:dictKey}, function(jsonData){
				_table.draw();
			});
		});
		
	}

	function toEdit(dictId, dictType, dictKey){
		var title = "修改字典";
		var url = basePath+"/sys/dict/toEdit";
		url += "?dictId="+dictId;
		url += "&dictType="+dictType;
		url += "&dictKey="+dictKey;
		openDialogInIframe(url, title, 400, 600);
	}
	function toAdd(){
		var title = "新增字典";
		var url = basePath+"/sys/dict/toAdd";
		openDialogInIframe(url, title, 500, 600);
	}
	
	</script>
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
							<input type="text" class="form-control" placeholder="字典编号" id="dictId" name="dictId">
							<select id="dictType" name="dictType" class="form-control">
								<option value="1">一般字典</option>
								<option value="2">JSON字典</option>
								<option value="3">SQL字典</option>
								<option value="4">SQL带参字典</option>
							</select>
							<span class="input-group-btn">
								<button type="button" class="btn btn-default" id="searchBtn"><i class="fa fa-search"></i></button>
							</span>
						</div>
					</div>
					<button type="button" class="btn btn-success btn-addon" data-toggle="modal" onclick="toAdd()"><i class="fa fa-plus"></i> 添加</button>
				</div>
				<!-- 列表 -->
				<div id="tableArea" class="auto95"></div>

			</div>
		</div>
	</div>

</body>

</html>

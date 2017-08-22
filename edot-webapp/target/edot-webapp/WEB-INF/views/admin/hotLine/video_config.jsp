<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>视频地址管理</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
</head>
<script>

var SiteVars = {
	    ApplicationRelativeWebRoot: '${ctx}/',
	    RelativeWebRoot: '${ctx}/',
	    SessionId: '<%=session.getId()%>'
	}
var basePath = "${ctx}";
var _table;
$(function() {
	
	uploadFile(true);
	_table = select();
	initBtnEvn();
	
	/*查询*/
	$("#searchBtn").click(function(){
        _table.draw();
    });

});

function initBtnEvn(){
	$("#addBtn").click(function(){
		showAddModal();
	});
	
	$("#updateBtn").click(function(){
		var selCheckNum = $('tbody :checkbox:checked',$('#videoConfigTable')).size();
		if(selCheckNum != 1){
			showTip("请选择一个要修改的项");
		}else {
			var id;
			$('tbody :checkbox:checked',$('#videoConfigTable')).each(function(i){
				var item = _table.row($(this).closest('tr')).data();
				id = item.id;
				$("#edit_id").val(item.id);
				$("#edit_title").val(item.title);
				$("#edit_url").val(item.url);
				load_edit_item(item);
// 				$("#edit_img").val(item.img);
// 				$("#edit_mapImg").val(item.mapImg);
				showEditModal();
			});
// 			openDialogInIframe(basePath+"/example/toUserSave?id="+id, "修改用户", 450, 600);
		}
	});
	
	$("#deleteBtn").click(function(){
		var selCheckNum = $('tbody :checkbox:checked',$('#videoConfigTable')).size();
		if(selCheckNum == 0){
			showTip("请选择要的删除的项");
		}else{
			showConfirm("确定删除？",function() {
				var ids = '';
				$('tbody :checkbox:checked',$('#videoConfigTable')).each(function(i){
					var item = _table.row($(this).closest('tr')).data();
					ids += item.id + ',';
				});
				ids = ids.substring(0, ids.length - 1);
				ajaxExecute(basePath+"/videoConfig/deleteVideoConfig", {ids:ids}, function(jsonData){
					_table.draw();
				});
			});
		} 
	});
	
	$("#add_save").click(function(){
		test();
	});
}

function select(){
	var params = {
		id:"videoConfigTable",
		url:basePath + '/videoConfig/getPageVideoConfig',
		checkbox: true,	//是否需要添加多选框，默认不添加
		cols:[
			{
				label: "编码",
				name: "id",
				hide:true
			}
			,{
				label: "标题",
				name: "title"
			}
			,{
				label: "视频网址",
				name: "url"
			}
			,{
				label: "视频截图",
				name: "img"
			},{
				label: "摄像头位置图片",
				name: "mapImg"
			}
		],
		search:[
			//id表示页面上查询值的ID属性，name表示后台取值的key，若两个值相同，则填一个即可
			{
				"id":"title",
				"name":"title"
			}
		]
	};
	var tableHead = createTableHead(params);
	$('#tableArea').html(tableHead);
	return createTableBody(params);
}

function deleteBean(){
	
}
function showAddModal(){
	$("#add_From")[0].reset();
	$("#modal-video-add").modal('show');
}
function hideAddModal(){
	$("#modal-video-add").modal('hide');
	$("#add_From")[0].reset();
}

function showEditModal(){
	$("#modal-video-edit").modal('show');
}
function hideEditModal(){
	$("#modal-video-edit").modal('hide');
	$("#edit_From")[0].reset();
}

// function saveVideo(){
// 	//表单验证结果
// 	var result = $('#add_From').validationEngine('validate');
// 	if (result) {
// 		ajaxSubmitForm($("#add_From"), function(jsonObj){
// 			//parent._table.draw();
// 			//closeDialogInIframe();
// 			hideAddModal();
// 		});
// 	}
// }

function test(){
	var result = $('#add_From').validationEngine('validate');
	if(!result){
		return;
	}
    var form = new FormData(document.getElementById("add_From"));
    loading();
    $.ajax({
        url:basePath+"/videoConfig/saveVideoConfig",
        type:"post",
        data:form,
        processData:false,
        contentType:false,
        success:function(data){
        	loading(false);
        	hideAddModal();	
        	_table.draw();
        },
        error:function(e){
        	loading(false);
        	hideAddModal();
        }
    });        
    //get();//此处为上传文件的进度条
}

function uploadFile(isFirst) {
	editItem = {};
	isNewItem = true;
	editItem = { // 初始化界面默认值。
		status: '1',
    	type : '0',
    	originalId : null
    };
// 	$("#txtParentName").attr("placeholder", "");
	if(isFirst){
		$('#file1').uploadifyExt({
			baseUrl:SiteVars.ApplicationRelativeWebRoot
			,sessionId:SiteVars.SessionId
			,relationalTable:"ed_feature"
			,relationalColumn:"icon"
			,initFileIds:""
	    	,multi: false
	    	,fileTypeExts:'*.bmp;*.jpg;*.jpeg;*.png;*.gif;'
	    	,fileMaxSize:'300KB'
			,addFileSuccess:function(fileData, fileIds){
				editItem.icon = fileData.id;
	    	}
	    	,removeFileSuccess: function(){
	    		editItem.icon = "";
	    	}
		});
		$('#file2').uploadifyExt({
			baseUrl:SiteVars.ApplicationRelativeWebRoot
			,sessionId:SiteVars.SessionId
			,relationalTable:"ed_feature"
			,relationalColumn:"icon"
			,initFileIds:""
	    	,multi: false
	    	,fileTypeExts:'*.bmp;*.jpg;*.jpeg;*.png;*.gif;'
	    	,fileMaxSize:'300KB'
	    	,params: {"isUploadWww": true}
			,addFileSuccess:function(fileData, fileIds){
				editItem.icon = fileData.id;
				$("#txtIcon").val(fileData.id);
	    	}
	    	,removeFileSuccess: function(){
	    		editItem.icon = "";
	    	}
		});
		$('#file1').show();
		$('#file2').hide();
	} else {
		$('#file1').uploadifyExt("reset");
		$('#file2').uploadifyExt("reset");
		$('#file1').show();
		$('#file2').hide();
	}
// 	resetSelect();
//     dataService.getItems('/admin/feature/features', { kind: "02" })
//     .success(function (data) {
//         var treeObj = $.fn.zTree.getZTreeObj("tree");
//         var nodes = treeObj.transformTozTreeNodes(data.results);
//         $scope.zNodes = nodes;
//         tree.reflash();
//     })
//     .error(function () {
//         toastr.error('加载资源异常！');
//     });
}

 function load_edit_item (b) {
	
	editItem = {};
	var originalId = null;
	if(b.id){
		isNewItem = false;
		originalId = b.id;//记录原来的ID
		$('#file1').uploadifyExt("reset");
		$('#file2').uploadifyExt("reset");
		if(b.parentId == "02_00"){
			$('#file2').uploadifyExt("load", b.img);
			$('#file1').hide();
			$('#file2').show();
		} else {
			$('#file1').uploadifyExt("load", b.img);
			$('#file1').show();
			$('#file2').hide();
		}
	}else{
		$scope.isNewItem = true;
		$('#file1').uploadifyExt("reset");
		$('#file2').uploadifyExt("reset");
		if(b.parentId == "02_00"){
			$('#file1').hide();
			$('#file2').show();
		} else {
			$('#file1').show();
			$('#file2').hide();
		}
	}
	$("#msg").html("上传的首页中间广告图标尺寸为720*138，大小不超过300KB");
    var editItem = {
        id: 		b.id,
        name: 		b.name,
        icon:  		b.icon,
        status:     b.status,
        type: 		b.type,
        content: 	b.content,
        param: 		b.param,
        orderNo:	b.orderNo,
        levelNo:	b.levelNo,
        originalId: originalId
    };
   editItem = editItem;
};

</script>
<body>
	<div class="bg-light lter b-b wrapper-md ng-scope">
		<h1 class="m-n font-thin h3">视频地址管理</h1>
	</div>

	<div class="wrapper-md">
		<div class="panel panel-default">
			<!-- 内容 -->
			<!-- <div class="table-responsive"> -->
				<!-- 表格顶部按钮等工具 -->
				<div class="tableTotal panel-heading font-bold">
					<div class="fl">
						<button type="button" class="btn btn-sm btn-success btn-addon" id="addBtn"><i class="fa fa-plus"></i> 新增</button>
<!-- 						<button type="button" class="btn btn-sm btn-warning btn-addon" id="updateBtn"><i class="fa fa-trash-o"></i> 修改</button> -->
						<button type="button" class="btn btn-sm btn-danger btn-addon" id="deleteBtn"><i class="fa fa-trash-o"></i> 删除</button>
					</div>

					<div class="pull-right w300p">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="search" id="title" name="example.title">
							<span class="input-group-btn">
								<button type="button" class="btn btn-default" style="height:34px" id="searchBtn"><i class="fa fa-search"></i></button>
							</span>
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<!-- 列表 -->
				<div id="tableArea"></div>
			<!-- </div> -->
		</div>
	</div>
	<div id="modal-video-add" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" ng-click="focusInput=false"><i class="fa fa-times"></i></button>
                        <h4 class="modal-title">新增视频地址</h4>
                    </div>
                    <div class="modal-body">
                    	<form id="add_From" action="" method="post">
                        <div id="frm-user-add">
                            <div class="form-group">
                                <label for="txtVideoTitle">标题</label>
                                <input type="text" id="add_title" name="title" class="form-control validate[required,maxSize[50]]" placeholder="请输入标题,长度不能超过50" data-prompt-position="topRight:-65,0" focus-me="focusInput" />
                            </div>
                            <div class="form-group">
                                <label for="txtVideoUrl">视频网址</label>
                                <input type="text" id="add_url" name="url" class="form-control validate[required,maxSize[2000]]" placeholder="请输入视频网址" data-prompt-position="topRight:-65,0"/>
                            </div>
                            <div class="form-group">
                                <label for="txtVideoImg">视频截图</label>
                                <input type="file" id="add_img" name="file" class="form-control ltr-dir" />
                            </div>
                            <div class="form-group" data-ng-if="isNewItem">
                                <label for="txtMapImg">摄像位置图</label>
                                <input type="file" class="form-control ltr-dir" id="add_mapImg" name="file"  />
                            </div>
                        </div>
                        <div class="modal-buttons">
                            <button type="button" id="add_save" class="btn btn-success">保存</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="modal-video-edit" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" ng-click="focusInput=false"><i class="fa fa-times"></i></button>
                        <h4 class="modal-title">修改视频地址</h4>
                    </div>
                    <div class="modal-body">
                    <form id="edit_From" action="" method="post">
                        <div id="frm-user-add">
                            <div class="form-group">
                                <label for="txtVideoTitle">标题</label>
                                <input type="text" id="edit_title" name="title" class="form-control validate[required,maxSize[50]]" placeholder="请输入标题,长度不能超过50" data-prompt-position="topRight:-65,0" focus-me="focusInput" />
                            </div>
                            <div class="form-group">
                                <label for="txtVideoUrl">视频网址</label>
                                <input type="text" id="edit_url" name="url" class="form-control validate[required,maxSize[2000]]" placeholder="请输入视频网址" data-prompt-position="topRight:-65,0"/>
                            </div>
                            <div class="form-group">
                                <label for="txtVideoImg">视频截图</label>
<!--                                 <input type="file" id="edit_img" name="file" class="form-control ltr-dir" /> -->
								 <div class="col-sm-10">
							            <div id="file1"></div>
							            <div id="file2"></div>
							            <span style="font-size:12px;color:red;" id="msg">
							            <!-- (上传的首页头图标尺寸为720*260，广告资源图标尺寸为720*138，大小不超过300KB) -->
							            </span>
							            <input type="hidden" id="txtIcon" name="txtIcon" />
							    </div>
                            </div>
                            <div class="form-group" data-ng-if="isNewItem">
                                <label for="txtMapImg">摄像位置图</label>
                                <input type="file" class="form-control ltr-dir" id="edit_mapImg" name="file"  />
                            </div>
                        </div>
                        <div class="modal-buttons">
                            <button type="button" id="edit_save" class="btn btn-success">保存</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal" >取消</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
</body>

</html>

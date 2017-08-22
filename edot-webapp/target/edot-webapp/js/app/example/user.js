
"use strict";

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
		id:"userTable",
		url:basePath + '/example/select',
		checkbox:true,	//是否需要添加多选框，默认不添加
		cols:[
			{
				label: "编码",
				name: "id",
				hide:true
			},{
				label: "姓名",
				name: "userName"
			},{
				label: "性别",
				name: "sex",
				render:function(data,type, row, meta) {
					//替换显示值
					if (data == "0") {
						return "男";
					}else if(data == "1") {
						return "女";
					}else {
                    	return "";
					}
                }
			},{
				label: "手机号码",
				name: "phone"
			},{
				label: "地址",
				name: "addr"
			},{
				label: "创建时间",
				name: "createDate"
			}
		],
		search:[
			//id表示页面上查询值的ID属性，name表示后台取值的key，若两个值相同，则填一个即可
			{
				"id":"userNameSearch",
				"name":"userName"
			}
		]
	};
	var tableHead = createTableHead(params);
	$('#tableArea').html(tableHead);
	return createTableBody(params);
}

function toAdd(){
	openDialogInIframe(basePath+"/example/toUserSave", "新增用户", 450, 600);
}
function toUpdate(){
	var selCheckNum = $('tbody :checkbox:checked',$('#userTable')).size();
	if(selCheckNum != 1){
		showTip("请选择一个要修改的项");
	}else {
		var id;
		$('tbody :checkbox:checked',$('#userTable')).each(function(i){
			var item = _table.row($(this).closest('tr')).data();
			id = item.id;
		});
		openDialogInIframe(basePath+"/example/toUserSave?id="+id, "修改用户", 450, 600);
	}
}
function deleteBean(){
	var selCheckNum = $('tbody :checkbox:checked',$('#userTable')).size();
	if(selCheckNum == 0){
		showTip("请选择要的删除的项");
	}else{
		showConfirm("确定删除？",function() {
			var ids = '';
			$('tbody :checkbox:checked',$('#userTable')).each(function(i){
				var item = _table.row($(this).closest('tr')).data();
				ids += item.id + ',';
			});
			ids = ids.substring(0, ids.length - 1);
			ajaxExecute(basePath+"/example/delete", {ids:ids}, function(jsonData){
				_table.draw();
			});
		});
	} 
}
function saveUser(){
	//表单验证结果
	var result = $('#userForm').validationEngine('validate');
	if (result) {
		ajaxSubmitForm($("#userForm"), function(jsonObj){
			parent._table.draw();
			closeDialogInIframe();
		});
	}
}
/**  js公用方法示例  **/
//信息提示
function testShowTip(){
	showTip("用户名或密码错误！");
}
//确认选择提示框
function testShowConfirm(){
	showConfirm("确认提交？", function(){
		showTip("提交成功！");
	});
}
//在iframe里弹出对话框
function testOpenDialogInIframe(){
	openDialogInIframe(basePath+"/example/toUserSave", "新增用户", 450, 600);
}



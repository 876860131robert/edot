
(function($) {
	$.fn.iframeResizer = function() {
		var url = window.location.href;
		$(parent.document).find('iframe').each(function() {
			var src = $(this).attr("src");
			var h = $(document).height();
			var ph = $(parent.document).height();
			
			if (url.search(src + "$") > -1) {
				$(this).height(h < ph ? ph : h);
			}else if(url.indexOf(src) != -1){
				$(this).height(h < ph ? ph : h);
			}
		});
	};
})(jQuery);


$(document).ready(function () {
	if (!$('#dialogInIframe')) {
		$(window).iframeResizer();
	}
});

function spinOn() {
    $("#ng-view").hide();
    $("#global-loading").show();
}

function spinOff() {
    $("#ng-view").show();
    $("#global-loading").hide();
}

function webRoot(url) {
    var result = SiteVars.ApplicationRelativeWebRoot;
    if (url.substring(0, 1) === "/") {
        return result + url.substring(1);
    }
    else {
        return result + url;
    }
}

function processChecked(url, action, scope, dataService) {
//    spinOn();
    var i = scope.items.length;
    var checked = [];
    while (i--) {
        var item = scope.items[i];
        if (item.IsChecked === true) {
        	checked.push(item);
        }
    }
    if (checked.length < 1) {
    	toastr.error("至少选择一项");
        return false;
    }	
    dataService.processChecked(url + action, checked)
    .success(function (data) {
    	if(data.code != '0'){
    		toastr.error(data.message);
    		spinOff();
    	}
    	else{
	        scope.load();
	        toastr.success("已完成");
	        if ($('#chkAll')) {
	            $('#chkAll').prop('checked', false);
	        }
	        spinOff();
    	}
    })
    .error(function (data) {
        toastr.error("失败");
        spinOff();
    	});
	
}

function preChecked(items) {
  var i = items.length;
  var checked = [];
  while (i--) {
      var item = items[i];
      if (item.IsChecked === true) {
      	checked.push(item);
      }
  }
  return checked;
}

function addDiyDom(treeId, treeNode) {
    var spaceWidth = 15;
    var switchObj = $("#" + treeNode.tId + "_switch"),
    icoObj = $("#" + treeNode.tId + "_ico");
    switchObj.remove();
    icoObj.before(switchObj);

    //if (treeNode.level > 1) {
    var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level) + "px'></span>";
    /*if (!treeNode.isParent) {
      spaceStr += '<i class="fa fa-file-o" style="margin-left:5px;"></i> ';
    }*/
    switchObj.before(spaceStr);
    //}
}

/*************************************** 外部调用方法 ***************************************/

/**
 * 加载中
 * flag:空或true表示显示加载框; false隐藏加载框
 */
function loading(flag) {
	if ($('#czsMash').length == 0) createMashCZS();
	var $czsMash = $('#czsMash');
	if (flag == null || flag) {
		$czsMash.css("height",$('body').height());
		$czsMash.show();
		$('body').spinModal();
	}else {
		$czsMash.hide();
		$('body').spinModal(false);
	}
}

/**
 * 弹出提示框
 * msg:消息内容
 * time:持续事件(毫秒),若为空，表示一直存在
 * title:标题，若为空，则为“提示”
 */
function showTip(msg,time,title) {
	if ($('#czsTipModal').length == 0) createAlertCZS();
	var $modal = $('#czsTipModal');
	$modal.find("#czsTipModalContent").html(msg);
	title = " " + title ? "提示" : title;
	$modal.find("#myModalLabel").html(title);
	if (time) {
		//$modal.find(".")
		setTimeout(function() {
			$modal.modal('hide');
		},time);
	}
	$modal.modal('show');
}

/**
 * 弹出确认框
 * msg:消息内容
 * trueCallBack:确定后运行的方法
 * falseCallBack:取消后运行的方法，为空则直接关闭对话框，不做任何处理
 * sureText:确定的文字描述，为空则默认为“确 定”
 * cancelText:取消的文字描述，为空则默认为“取 消”
 */
function showConfirm(msg, trueCallBack, falseCallBack, sureText, cancelText) {
	if ($('#czsTipModal2').length == 0) createConfirmCZS();
	var $modal = $('#czsTipModal2');
	$modal.find("#czsTipModalContent2").html(msg);
	$modal.modal('show');

	var $czsSureBtn = $modal.find(".czsSureBtn");
	$czsSureBtn.unbind("click");//防止多个click事件
	$czsSureBtn.click(function(event) {
		trueCallBack();
	});
	$czsSureBtn.html(sureText ? sureText : "确 定");

	var $czsCancelBtn = $modal.find(".czsCancelBtn");
	$czsCancelBtn.unbind("click");//防止多个click事件
	$czsCancelBtn.click(function(event) {
		if (falseCallBack) {
			falseCallBack();
		}else {
			$modal.modal('hide');
		}
	});
	$czsCancelBtn.html(cancelText ? cancelText : "取 消");
}


/*************************************** 常量 ***************************************/

var CONSTANT = {
        DATA_TABLES : {
            DEFAULT_OPTION : { //DataTables初始化选项
                language: {
                    "sProcessing":   "处理中...",
                    "sLengthMenu":   "每页 _MENU_ 项",
                    "sZeroRecords":  "没有匹配结果",
                    "sInfo":         "当前显示第 _START_ 至 _END_ 项，共 _TOTAL_ 项。",
                    "sInfoEmpty":    "当前显示第 0 至 0 项，共 0 项",
                    "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
                    "sInfoPostFix":  "",
                    "sSearch":       "搜索:",
                    "sUrl":          "",
                    "sEmptyTable":     "表中数据为空",
                    "sLoadingRecords": "载入中...",
                    "sInfoThousands":  ",",
                    "oPaginate": {
                        "sFirst":    "首页",
                        "sPrevious": "上页",
                        "sNext":     "下页",
                        "sLast":     "末页",
                        "sJump":     "跳转"
                    },
                    "oAria": {
                        "sSortAscending":  ": 以升序排列此列",
                        "sSortDescending": ": 以降序排列此列"
                    }
                },
                autoWidth: false,   //禁用自动调整列宽
                stripeClasses: ["odd", "even"],//为奇偶行加上样式，兼容不支持CSS伪类的场合
                order: [],          //取消默认排序查询,否则复选框一列会出现小箭头
                processing: false,  //隐藏加载提示,自行处理
                serverSide: true,   //启用服务器端分页
                searching: false    //禁用原生搜索
            },
            COLUMN: {
                CHECKBOX: { //复选框单元格
                    className: "td-checkbox",
                    orderable: false,
                    width: "30px",
                    data: null,
                    render: function (data, type, row, meta) {
                        return '<input type="checkbox" class="iCheck">';
                    }
                }
            },
            RENDER: {   //常用render可以抽取出来，如日期时间、头像等
                ELLIPSIS: function (data, type, row, meta) {
                    data = data||"";
                    return '<span title="' + data + '">' + data + '</span>';
                }
            }
        }
};

/*************************************** 弹出框start ***************************************/

//生成提示框模板
function createAlertCZS() {
	var xHtml = '';
	xHtml += '<div class="modal fade" id="czsTipModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">';
	xHtml += '<div class="modal-dialog" role="document">';
	xHtml += '<div class="modal-content">';
	xHtml += '<div class="modal-header">';
	xHtml += '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>';
	xHtml += '<h4 class="modal-title" id="myModalLabel"> 提示</h4>';
	xHtml += '</div>';
	xHtml += '<div class="modal-body" id="czsTipModalContent"></div>';
	xHtml += '<div class="modal-footer">';
	xHtml += '<button type="button" class="btn btn-danger" data-dismiss="modal">关 闭</button>';
	xHtml += '</div>';
	xHtml += '</div>';
	xHtml += '</div>';
	xHtml += '</div>';
	$('body').append(xHtml);
}

//生成确认框模板
function createConfirmCZS() {
	var xHtml = '';
	xHtml += '<div class="modal fade" id="czsTipModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel2">';
	xHtml += '<div class="modal-dialog" role="document">';
	xHtml += '<div class="modal-content">';
	xHtml += '<div class="modal-header">';
	xHtml += '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>';
	xHtml += '<h4 class="modal-title" id="myModalLabel2"> 提示</h4>';
	xHtml += '</div>';
	xHtml += '<div class="modal-body" id="czsTipModalContent2"></div>';
	xHtml += '<div class="modal-footer">';
	xHtml += '<button type="button" class="btn btn-default czsCancelBtn" data-dismiss="modal">取 消</button>';
	xHtml += '<button type="button" class="btn btn-success czsSureBtn" data-dismiss="modal">确 定</button>';
	xHtml += '</div>';
	xHtml += '</div>';
	xHtml += '</div>';
	xHtml += '</div>';
	$('body').append(xHtml);
}

//生成遮罩层
function createMashCZS() {
	var xHtml = '<div class="mash-czs" id="czsMash"></div>';
	$('body').append(xHtml);
}
/**
 * 弹出IFrame窗口
 * url:iframe对于的src地址
 * title:标题
 * height:iframe的高度，为空的话默认为100%
 * width:iframe的宽度，为空的话默认为100%
 * scroll：是否滚动条
 */
//生成IFrame弹出框
function openDialogInIframe(url, title, height, width, scroll) {
	if ($('#czsTipModal3').length == 0) {
		height = height ? height : "400";
		width = width ? width : "600";
		var xHtml = '';
		xHtml += '<div class="modal fade" id="czsTipModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel3">';
		xHtml += 	'<div class="modal-dialog" role="document">';
		xHtml += 		'<div class="modal-content">';
		xHtml += 			'<div class="modal-header">';
		xHtml += 				'<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>';
		xHtml += 				'<h4 class="modal-title" id="myModalLabel">'+title+'</h4>';
		xHtml += 			'</div>'
		xHtml += 			'<div class="modal-body" id="czsTipModalContent3">';
		xHtml += 			'<iframe id="dialogInIframe" height="100%" width="100%" src="'+url+'" frameborder="0"></iframe>';
		xHtml += 			'</div>';
		xHtml += 		'</div>';
		xHtml += 	'</div>';
		xHtml += '</div>';
		$('body').append(xHtml);
	}else {
		$(".modal-dialog").width(width);
		$(".modal-body").height(height);
		$('#czsTipModal3 #myModalLabel').html(title);
		$("#dialogInIframe")[0].contentWindow.document.body.innerText = "";
		$('#dialogInIframe').attr("src",url);
	}
	$('#czsTipModal3').modal('show');
}

function closeDialogInIframe(){
	parent.$('#czsTipModal3').modal('hide');
}

/**
 * 用JQuery UI中的Dialog，仿弹出信息输入窗口（Prompt）
 * 
 * @param message
 *            提示消息
 * @param callback
 *            回调函数名称
 * @param showCancelButton
 *            显示“取消”按钮 true or fasle
 * @returns
 */
function showPromptMessage(message, callback, height, defValue) {
	if ($('#PromptMessage').length == 0) {
		if(!defValue) defValue = "";
		if(!height) height = 80;
		
		var xHtml = '';
		var xHtml = '';
		xHtml += '<div class="modal fade" id="PromptMessage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel2">';
		xHtml += '<div class="modal-dialog" role="document">';
		xHtml += '<div class="modal-content">';
		xHtml += '<div class="modal-header">';
		xHtml += '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>';
		xHtml += '<h4 class="modal-title" id="myModalLabel2"> '+message+'</h4>';
		xHtml += '</div>';
		xHtml += '<div class="modal-body" id="czsTipModalContent2">';
		xHtml += '<textArea id="_temp_promptId" name="_temp_promptName" style="width:100%; height:'+height+'px; line-height:18px; ">'+defValue+'</textArea>';
		xHtml += '</div>';
		xHtml += '<div class="modal-footer">';
		xHtml += '<button type="button" class="btn btn-default czsCancelBtn" data-dismiss="modal" id="_cancel">取 消</button>';
		xHtml += '<button type="button" class="btn btn-success czsSureBtn" id="_submit">确 定</button>';
		xHtml += '</div>';
		xHtml += '</div>';
		xHtml += '</div>';
		xHtml += '</div>';
		
		$('body').append(xHtml);
		$("#PromptMessage").find("#_cancel").click(function(){
			$("#PromptMessage").find("#_temp_promptId").val('');
		});
		$("#PromptMessage").find("#_submit").click(function(){
			callback($("#PromptMessage").find("#_temp_promptId").val());
		});
	}else{
		$("#PromptMessage").find("#_temp_promptId").val("");
	}
	
	$('#PromptMessage').modal('show');
}

function closePromptMessage(){
	$('#PromptMessage').modal('hide');
}
/*************************************** 弹出框end ***************************************/


/*************************************** 表格start ***************************************/
//创建表格头部
function createTableHead(params) {
	var xHtml = '';
	var tableId = params.id;
	var cols = params.cols;
	if(cols){
		xHtml += '<div class="box-body" id="'+tableId+'DIV">';
		xHtml += '<table id="'+tableId+'" class="table table-bordered table-striped">';
		xHtml += '<thead>';
		xHtml += '<tr>';

		/*是否添加复选框*/
		if (params.checkbox) {
			xHtml += '<th class="center"><input type="checkbox" name="czs-check-all"></th>';
		}

		var col;
		for (var i = 0; i < cols.length; i++) {
			col = cols[i];
			xHtml += '<th>'+col.label+'</th>';
		}
		xHtml += '</tr>';
		xHtml += '</thead>';
		xHtml += '</table>';
		xHtml += '</div>';
	}
	return xHtml;
}

//创建表格内容
function createTableBody(params){
	var id = params.id;
	var cols = params.cols;
	var columns = [];
	var columnDefs = [];
	var col;

	/*是否添加复选框*/
	var k = 0;
	if (params.checkbox) {
		columns[k] = CONSTANT.DATA_TABLES.COLUMN.CHECKBOX;
		k++;
	}

	for (var i = 0, j = 0; i < cols.length; i++) {
		col = cols[i];
		columns[i+k] = { data: col.name};
		if(col.hide) {
			columnDefs[j] = { targets: i+k, visible: false };
			j++;
		}
		if(col.render) {
			columnDefs[j] = { targets: i+k, render:col.render };
			j++;
		}
	}

	var $wrapper = $("#"+id+"DIV");
	var $czsTable = $("#"+id);
	var czs_table = $czsTable.dataTable($.extend(true,{},CONSTANT.DATA_TABLES.DEFAULT_OPTION, {
		columns: columns,
		columnDefs:columnDefs,
		bLengthChange:false,
		ajax : function(data, callback, settings) {
			//手动控制遮罩
            $wrapper.spinModal();
            //封装请求参数
            var param = czsManage.getTableQueryParam(data,params);

            $.ajax({
				type: "POST",
				data: param,
				url: params.url,
				success: function(data){
					//console.log("this is ajax success data="+data);
					var returnData = {};
					returnData.draw = data.draw;//这里直接自行返回了draw计数器,应该由后台返回
					returnData.recordsTotal = data.data.page.rowCount;
					returnData.recordsFiltered = data.data.page.rowCount;//后台不实现过滤功能，每次查询均视作全部结果
					returnData.data = data.data.results;
					//关闭遮罩
					$wrapper.spinModal(false);
					//调用DataTables提供的callback方法，代表数据已封装完成并传回DataTables进行渲染
					//此时的数据需确保正确无误，异常判断应在执行此回调前自行处理完毕
					callback(returnData);
				},
				error: function() {
					console.log("加载数据失败");
					$wrapper.spinModal(false);
				}
			});
		},
		"drawCallback": function( settings ) {
			//渲染完毕后的回调
			//console.log("this is drawCallback settings="+settings);
			//重新设置iframe高度
			$(window).iframeResizer();
			//清空全选状态
			//$(":checkbox[name='czs-check-all']",$wrapper).prop('checked', false);
		}
	})).api();

	$czsTable.on("change",":checkbox",function(event) {
		if ($(this).is("[name='czs-check-all']")) {
			//全选
			var flag = $(this).prop("checked");
			$(":checkbox",$czsTable).prop("checked",flag);
			var $tr = $czsTable.find("tbody tr");
			if (flag) {
				$tr.addClass('table_tr_sel_color');
			}else {
				$tr.removeClass('table_tr_sel_color');
			}
		}else{
			//一般复选
			var flag = event.target.checked;
			var $tr = $(event.target).parents("tr");
			if (flag) {
				$tr.addClass('table_tr_sel_color');
			}else {
				$tr.removeClass('table_tr_sel_color');
			}
		}
	}).on("click","td",function(event) {
		//点击单元格即点击复选框
		var $checkbox = $(event.target).parent("tr").find(".td-checkbox");
		!$checkbox.is(":checkbox") && $(":checkbox",$checkbox).trigger("click");
	});

	//查询框回车事件
	if (params.search) {
		for (var i = 0; i < params.search.length; i++) {
			var _s = params.search[i];
			var _k = _s.id ? _s.id : _s.name;
			if (_s.id) {
				$('body').on('keypress', '#'+_s.id, function(event) {
					if(event.which == 13) {
						czs_table.draw();
					}
				});
			}else {
				$('body').on("keypress", "input[name='"+_s.name+"']", function(event) {
					if(event.which == 13) {
						czs_table.draw();
					}
				});
			}

		}
	}

	return czs_table;
}

var czsManage = {
	currentItem : null,
	fuzzySearch : true,
	getTableQueryParam : function(data,paramsSource) {
		var param = {};
		var cols = paramsSource.cols;
		var cb = paramsSource.checkbox;

		//组装排序参数
		if (data.order&&data.order.length&&data.order[0]) {
			var j = 0;
			if (cb) j++;
			for (var i = 0; i < cols.length; i++) {
				if (!cols[i].hide) {
					if (++j == data.order[0].column) {
						//param.orderColumn = cols[i].name;
						//param.orderType = data.order[0].dir;
						param.orderBy = cols[i].name + " " + data.order[0].dir;
						break;
					}
				}
			}
		}

		//组装查询参数
		if(paramsSource.search) {
			for (var i = 0; i < paramsSource.search.length; i++) {
				var _s = paramsSource.search[i];
				if (!_s.id) {
					eval("param."+_s.name+"='"+$('#'+_s.name).val()+"'");
				}else if(!_s.name) {
					eval("param."+_s.id+"='"+$('#'+_s.id).val()+"'");
				}else {
					eval("param."+_s.name+"='"+$('#'+_s.id).val()+"'");
				}
			}
		}

		//组装分页参数
		param.pageIndex = data.start / data.length + 1;
		param.pageSize = data.length;
		return param;
	}
}



/*************************************** 表格end ***************************************/


/*************************************** ajax提交start ***************************************/

/**
 * ajax方式提交表单
 *
 * @param formObj
 *            Jquery的单表对象，例如：$('#form1')
 * @param callback
 *            回调函数名称
 * @return
 */
function ajaxSubmitForm(formObj, callback) {
	var ajaxOptions = {
		beforeSubmit : function(){
			setButtonDisabled(true);
			loading();
			return true;
		},
        dataType: 'html',
        type: "POST",
		success : function(responseText) {
			// 隐藏“覆盖层”
			setButtonDisabled(false);
			loading(false);
			var jo = eval("("+responseText+")");
			if(jo.code!=0){
				showTip(jo.message);
				return;
			}else{
				if(callback){
					callback(jo.data);
				}else{
					showTip("操作成功！");
				}
			}
		},
		error : function(XMLResponse) {
			showTip(XMLResponse.responseText);
		}
	};

	formObj.ajaxSubmit(ajaxOptions);
}

/**
 * 设置页面中所有Button的有效性
 *
 * @param flag
 *            true or false
 * @returns
 */
function setButtonDisabled(flag){
	$('input[type=button]').attr('disabled', flag);
	$('input[type=submit]').attr('disabled', flag);
	$('input[type=reset]').attr('disabled', flag);
	$('button').attr('disabled', flag);
}
/**
 * ajax post提交数据
 *
 * @param url
 * @param data
 * @param callback 	回调函数名称
 * @param showLoading 是否弹出覆盖层
 * @return
 */
function ajaxExecute(url, data, callback, showLoading) {
	if(showLoading){
		loading();
	}
	$.ajax({
	    type: "POST",
	    returnType:"json",
	    url: url,
	    data: data,
	    dataType: "json",
	    error : function(XMLResponse) {
			showTip(XMLResponse.responseText);
		},
	    success : function(jsonData) {
			if(showLoading){
				loading(false);
			}
			if(jsonData.code!=0){
//				var errorMessage = '操作失败，由于以下原因造成：\n\n' + jsonData.message;
				showTip(jsonData.message);
			}
			else if(callback){
				callback(jsonData.data);
			}
		}
	});
}
/*************************************** ajax提交end ***************************************/

//isNew 为true时，打开一个新的选项卡；为false时，如果选项卡不存在，打开一个新的选项卡，如果已经存在，使已经存在的选项卡变为活跃状态。
function openTab(url,title, isNew){
	parent.openTab(url,title, isNew);
}

/*************************************** 工具start ***************************************/
/**
 * 字符串函数，以“str”开始
 * 
 * @param str
 * @returns {Boolean}
 */
String.prototype.startsWith = function(str) {
	if (str == null || str == "" || this.length == 0
			|| str.length > this.length)
		return false;
	if (this.substr(0, str.length) == str)
		return true;
	else
		return false;
	return true;
};

/**
 * 字符串函数，以“str”结尾
 * 
 * @param str
 * @returns {Boolean}
 */
String.prototype.endsWith = function(str) {
	if (str == null || str == "" || this.length == 0
			|| str.length > this.length)
		return false;
	if (this.substring(this.length - str.length) == str)
		return true;
	else
		return false;
	return true;
};

String.prototype.replaceAll = function(reallyDo, replaceWith, ignoreCase) {  
    if (!RegExp.prototype.isPrototypeOf(reallyDo)) {  
        return this.replace(new RegExp(reallyDo, (ignoreCase ? "gi": "g")), replaceWith);  
    } else {  
        return this.replace(reallyDo, replaceWith);  
    }  
};

//拼接路径、url等
function joinPath(prePath, postPath){
	var path = prePath;
	if(path.lastIndexOf('/')!=path.length-1){
		path += '/';
	}
	if(postPath.indexOf('/')==0){
		postPath = postPath.substring(1);
	}
	path += postPath;

	return path;
}
//给url添加参数
function joinParam(url, paramName, paramValue){
	if (url.indexOf("?") != -1) {
		url = url + "&" + paramName + "=" + paramValue;
	} 
	else {
		url = url + "?" + paramName + "=" + paramValue;
	}
	
	return url;
}	
//设置cookies值(time:保存时间，单位秒)
function setCookie(name,value,time){
    var Days = 1; //此cookie将被保存1天 
    var exp = new Date(); //new Date("December 31,9998");
    if(time == null){
        exp.setTime(exp.getTime() + Days*24*60*60*1000); 
    }else{
        exp.setTime(exp.getTime() + time*1000);
    }
    document.cookie = name + "= "+ escape(value) + ";expires= "+ exp.toGMTString(); 
}

//获取cookies值
function getCookie(name){ 
    var arr = document.cookie.match(new RegExp("(^|)"+name+"=([^;]*)(;|$)")); 
    if(arr!= null){
        return unescape(arr[2]);
    }
    return null; 
}

//删除cookies值
function delCookie(name){ 
    var exp = new Date(); 
    exp.setTime(exp.getTime() - 1); 
    var cval=getCookie(name); 
    if(cval!=null){
        document.cookie=name + "= "+cval+ ";expires= "+exp.toGMTString();
    } 
}

function formatDateStr(dateStr, fromFmt, toFmt){
	if(dateStr && dateStr!=''){
		var dateFmt = new DateFormat();	//date.js
		return dateFmt.formatDateStr(dateStr, fromFmt, toFmt);
	}
	return "";
}
//普通字符转换成转意符
function html2Escape(sHtml) {
	 return sHtml.replace(/[<>&"]/g,function(c){return {'<':'&lt;','>':'&gt;','&':'&amp;','"':'&quot;'}[c];});
}
//转意符换成普通字符
function escape2Html(str) {
	 var arrEntities={'lt':'<','gt':'>','nbsp':' ','amp':'&','quot':'"'};
	 return str.replace(/&(lt|gt|nbsp|amp|quot);/ig,function(all,t){return arrEntities[t];});
}
//全选/反选
var isCheckedAll = true;
function checkedByName(name){
    if(isCheckedAll){
       checkedCtrl(name,true);
       isCheckedAll = false;
    }else{
       checkedCtrl(name,false);
       isCheckedAll = true;
    }
}
function checkedCtrl(name, isNeedChecked){
    if(isNeedChecked){
       //给name=name的input添加属性checked=true
       $("input[name='"+name+"']").attr('checked','true');
    }else{
       //给name=name的input去除属性checked
       $("input[name='"+name+"']").removeAttr('checked');
    }
}
function HashMap(){   
	/** Map 大小 **/  
    var size = 0;   
    /** 对象 **/  
    var entry = new Object();   
        
    /** 存 **/  
    this.put = function (key , value){   
        if(!this.containsKey(key)){   
            size ++ ;   
        }   
        entry[key] = value;   
    };
        
    /** 取 **/  
    this.get = function (key){   
        return this.containsKey(key) ? entry[key] : null;   
    };
        
    /** 删除 **/  
    this.remove = function ( key ){   
        if( this.containsKey(key) && ( delete entry[key] ) ){   
            size --;   
        }   
    };
        
    /** 是否包含 Key **/  
    this.containsKey = function ( key ){   
        return (key in entry);   
    };
        
    /** 是否包含 Value **/  
    this.containsValue = function ( value ){   
        for(var prop in entry){   
            if(entry[prop] == value){   
                return true;   
            }   
        }   
        return false;   
    };
        
    /** 所有 Value **/  
    this.values = function (){   
        var values = new Array();   
        for(var prop in entry){   
            values.push(entry[prop]);   
        }   
        return values;   
    };
        
    /** 所有 Key **/  
    this.keys = function (){   
        var keys = new Array();   
        for(var prop in entry){   
            keys.push(prop);   
        }   
        return keys;   
    };
        
    /** Map Size **/  
    this.size = function (){   
        return size;   
    }; 
        
    /* 清空 */  
    this.clear = function (){   
        size = 0;   
        entry = new Object();   
    }; 
}
/*************************************** 工具end ***************************************/
//下载文件
function downloadSysFile(id){
	window.open(basePath+"/sys/file/download?id="+id);
}

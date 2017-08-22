
/**
 * WEB端通用模块
 */

var czsHidden = 'hidden';
var czsShow = '';

$(function(){

	/*************************************************跳转页面(分页)start*************************************************/
	$("body").on('click', '#gotoCZSPage', function(event) {
		var _o = $(this).prev("input");
		var _p = _o.val();
		var callback = _o.data("czs-callback");
		var _t = Number(_o.data("czs-total"));

		if(_p.search("^[0-9]*$") > -1){
			_p = Number(_p);
			if(_p < 1) _p = 1;
			if(_p > _t) _p = _t;
			eval(callback+"("+_p+")");
		}
	});

	//全选/取消
	$('body').on('click', '#czs_checkbox_all', function(event) {
		$("input[name='czs_table_checkbox_name']").not(this).prop('checked', this.checked);
	});
	/*************************************************跳转页面(分页)end*************************************************/

	/*************************************************向导组件(步骤)start*************************************************/
	//上一步
	//$(".czs-wizard-prev").click(function(event) {
	$("body").on("click",".czs-wizard-prev",function(){
		var $active = $(".czs-wizard-steps").find(".active");
		if($active != null){
			var $prev = $active.prev("li");
			if($prev.length > 0){
				var step = $prev.data("step");
				$active.removeClass('active');
				$prev.removeClass('complete').addClass('active');
				$(".czs-step-pane").removeClass('active');
				$(".czs-step-pane").each(function() {
					if($(this).data("step") == step){
						$(this).addClass('active').removeClass('am-animation-slide-right').addClass('am-animation-slide-left');
					}
				});
			}
			if($(".czs-wizard-next").is(":hidden")){
				$(".czs-wizard-next").removeClass(czsHidden).addClass(czsShow);
				$(".czs-wizard-finish").removeClass(czsShow).addClass(czsHidden);
			}
			if($(".czs-wizard-steps li.complete").length == 0){
				$(this).addClass('am-disabled');
			}
		}
	});
	//下一步
	//$(".czs-wizard-next").click(function(event) {
	$("body").on("click",".czs-wizard-next",function(){
		var $active = $(".czs-wizard-steps").find(".active");
		if($active == null){
			$active = $(".czs-wizard-steps").find("li").first();
		}
		var $next = $active.next("li");
		if($next.length > 0){

			//验证
			var validFun = $(this).data("czs-valid");
			if(validFun != null){
				var flag = eval(validFun+"("+$active.data("step")+")");
				if(!flag) return;
			}

			var step = $next.data("step");
			$active.removeClass('active').addClass('complete');
			$next.addClass('active');
			$(".czs-step-pane").removeClass('active');
			$(".czs-step-pane").each(function() {
				if($(this).data("step") == step){
					$(this).addClass('active').removeClass('am-animation-slide-left').addClass('am-animation-slide-right');
				}
			});
			if($next.next("li").length == 0){
				$(this).removeClass(czsShow).addClass(czsHidden);
				$(".czs-wizard-finish").removeClass(czsHidden).addClass(czsShow);
			}
		}
		$(".czs-wizard-prev").removeClass('am-disabled');

	});
	//完成
	/*$(".czs-wizard-finish").click(function(event) {

	});*/
	//跳到前N步
	$("body").on('click', '.czs-wizard-steps li.complete', function(event) {
		var curStep = Number($(this).data("step"));
		gotoCZSWizardStep(curStep);
	});
	/*************************************************向导组件(步骤)end*************************************************/

	/*************************************************表单验证start*************************************************/
	
	
	

	/*************************************************表单验证end*************************************************/

});


/*************************************************表格和跳转页面(分页)start*************************************************/

//创建表格头部
function createTableTheadCZS(params) {
	var xHtml = '';
	var tableId = params.id;
	var cols = params.cols;
	if(cols){
		xHtml += '<div class="box-body">';
		xHtml += '<table id="'+tableId+'" class="table table-bordered table-striped">';
		xHtml += '<thead>';
		xHtml += '<tr>';
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
function createTableDataCZS(params,data){
	var id = params.id;
	var cols = params.cols;
	var columns = [];
	var columnDefs = [];
	var col;
	for (var i = 0,j = 0; i < cols.length; i++) {
		col = cols[i];
		columns[i] = { data: col.name};
		if(col.hide) {
			columnDefs[j] = { targets: i, visible: false };
			j++;
		}
		if(col.render) {
			columnDefs[j] = { targets: i, render:col.render };
			j++;
		}
	}
	return $("#"+id).DataTable({
		columns: columns,
		columnDefs:columnDefs,
		/*serverSide: true,*/
		//data: data,
		ajax: {
			//url: '../data/user.json',
			url: '../admin/users/pager.json',
			type: 'POST',
			data: function(d){
				d.search_name_like = $('#search_name_like').val();
			}
		},
		pageLength: 10,
		lengthChange: true,
		order: [[ 1, 'asc' ]],
		searching: false,
		language: {
			'lengthMenu': '显示 _MENU_ 条',
			'zeroRecords': '没有找到记录',
			'info': '第 _PAGE_ 页 ( 共 _PAGES_ 页 _MAX_ 条)',
			'infoEmpty': ' ',
			'paginate': {
				'previous': '上一页',
				'next': '下一页'
			}
		},
		initComplete: function(){
			var topbar = $('#'+id+'_length');

			topbar.append('&nbsp;&nbsp;<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-sm">新增</button>');
		}
	});
}

/**
 * 生成分页工具栏
 * page 		当前页
 * total 		总页数
 * callback 	回调方法默认参数为page
 * showPage 	工具栏上显示的页数,值为单数(若为空，则默认显示5页)
 */
function createCZSPageTool(page,total,callback,showPage){
	page = Number(page);
	total = Number(total);
	if(page < 1) page = 1;
	if(page > total) page = total;
	if(showPage == null || showPage == '') showPage = 5;	//工具栏上显示的页数

	var xHtml = '<ul class="am-pagination am-pagination-centered">';
	if(page > 1){

		xHtml += '<li><a href="javascript:'+callback+'('+1+')"><i class="am-icon-angle-double-left"></i></a></li>';
		xHtml += '<li><a href="javascript:'+callback+'('+(page-1)+')"><i class="am-icon-angle-left"></i></a></li>';
	}
	
	var middle = (showPage-1) / 2;
	//从第几页开始
	var outPage = page - middle;
	if((page + middle) > total) outPage = total - showPage + 1;
	if(outPage < 1 ) outPage = 1;
	for (var i = 0; i < showPage; i++,outPage++) {
		if(outPage <= total){
			var pageClass = outPage == page ? ' class="am-active"' : '';
			xHtml += '<li'+pageClass+'><a href="javascript:'+callback+'('+outPage+')">'+outPage+'</a></li>';
		}
	}
	if(page < total){
		xHtml += '<li><a href="javascript:'+callback+'('+(page+1)+')"><i class="am-icon-angle-right"></i></a></li>';
		xHtml += '<li><a href="javascript:'+callback+'('+total+')"><i class="am-icon-angle-double-right"></i></a></li>';
	}
	xHtml += '<li>';
	xHtml += '<input type="text" data-czs-callback="'+callback+'" data-czs-total="'+total+'"></input>';
	xHtml += '<button type="button" class="am-btn am-btn-default" id="gotoCZSPage">跳转</button>';
	xHtml += '</li>';
	xHtml += '</ul>';
	$(".am-czs-w-page").html(xHtml);
}

//表格属性参数
var czs_table_params = {
	height:null,		//整体高度
	width:null,			//整体宽度
	isPageTool:false,	//是否显示分页工具栏: true显示;false不显示;默认不显示
    czsLimit:10,    	//每页显示记录数,默认10条(主要分页栏使用)
    czsLoadData:"",		//加载数据的方法名称(分页需要)
    checkbox:true,		//是否需要加入多选框,默认false
    cols:null,			//单元格
    buttons:null		//按钮
}

/**
 * 加载表格列表数据
 * id		表格的ID
 * params	参数，格式如：{cols:[]}
 * result	结果集，格式如：{"page":1,"rows":[{"cell":{"ID":"101","NAME":"凌云"}},{"cell":{"ID":"102","NAME":"飘影"}}],"total":2}
 */
function loadCZSTableData(id,params,result){
	
	for (var _p in params) {
		czs_table_params[_p] = params[_p];
	}

	var xHtml = '';
	
	if(czs_table_params.height){
		$("#"+id).css({"height":czs_table_params.height,"overflow":"auto"});
	}
	if(czs_table_params.width){
		$("#"+id).css("width",czs_table_params.width);
	}

	//按钮组
	var btnHtml = '';			//按钮组
	if(czs_table_params.buttons){
		var btn = {};
		var btnClass = '';
		var onclick_fun;
		btnHtml += '<div style="margin:10px 0;">';
		for (var i = 0; i < czs_table_params.buttons.length; i++) {
			btn = czs_table_params.buttons[i];
			if(btn.class) {
				btnClass = btn.class;
			}else{
				btnClass = 'am-btn-secondary';
			}
			btnHtml += '<button type="button" class="am-btn am-btn-sm am-margin-right-sm '+btnClass+'" onclick=czsTableBtnClick("'+btn.onclick+'")>'+btn.name+'</button>';
		}
		btnHtml += '</div>';
	}

	//表格
	var theadHtml = '';			//表格头部
	var tbodyHtml = '';			//表格内容
	var tableHtml = '';			//表格
	var tdWidth = '';			//单元格宽度
	var tdHide = '';			//是否隐藏
	var isCheckbox = false;		//是否需要加入多选框
	var trId = '';
	if(czs_table_params.checkbox) isCheckbox = czs_table_params.checkbox;
	if(czs_table_params.cols){
		theadHtml += '<thead><tr>';
		if(isCheckbox){
			theadHtml += '<th width="20px" style="vertical-align: middle;"><input type="checkbox" id="czs_checkbox_all" /></th>';
		}
		for (var i = 0; i < czs_table_params.cols.length; i++) {
			var cols = czs_table_params.cols[i];
			tdWidth = cols.width ? ' width="' + cols.width + '"' : '';
			tdHide = cols.hide ? 'display:none;' : '';
			theadHtml += '<th'+tdWidth+' style="vertical-align: middle;'+tdHide+'">'+cols.display+'</th>';
		}
		theadHtml += '</tr></thead>';
	}

	if(result.rows && czs_table_params.cols){
		tbodyHtml = '<tbody>';
		for (var i = 0; i < result.rows.length; i++) {
			var cell = result.rows[i].cell;
			var curId = result.rows[i].id;
			tbodyHtml += '<tr>';
			for (var j = 0; j < czs_table_params.cols.length; j++) {
				var cols = czs_table_params.cols[j];
				tdHide = cols.hide ? 'display:none;' : '';
				if(isCheckbox && j == 0){
					if(curId) {
						trId = ' data-id="'+curId+'"';
					}else{
						trId = '';
					}
					tbodyHtml += '<td style="vertical-align: middle;"><input type="checkbox" name="czs_table_checkbox_name"'+trId+' /></td>';
				}
				if(cols.formatter) {
					tbodyHtml += '<td style="vertical-align: middle;'+tdHide+'">' + cols.formatter(cell) + '</td>';
				}else if(cols.name){
					tbodyHtml += '<td style="vertical-align: middle;'+tdHide+'">' + eval("cell."+cols.name) + '</td>';
				}
			}
			tbodyHtml += '</tr>';
		}
		tbodyHtml += '</tbody>';
	}

	tableHtml = '<table class="am-table am-table-bordered am-table-striped am-table-hover am-czs-w-table">';
	tableHtml += theadHtml + tbodyHtml;
	tableHtml += '</table>';
	xHtml = btnHtml + tableHtml;
	$("#"+id).html(xHtml);

	//是否显示分页工具栏
	if(czs_table_params.isPageTool){
		var total = Math.ceil(result.total/czs_table_params.czsLimit)	//总页数
		var pageHtml = '<div class="am-fr am-czs-w-page" style="height:60px;"></div>';
		$("#"+id).append(pageHtml);
	    createCZSPageTool(result.page,total,czs_table_params.czsLoadData);
	}

}

//按钮事件
function czsTableBtnClick(funName){
	var ids = '';
	$("input[name='czs_table_checkbox_name']").each(function(){
		if ($(this).is(":checked")) {
			ids += $(this).data("id") + ",";
		}
	});
	if(ids.length > 0) ids = ids.substring(0,ids.length - 1);
	eval(funName+"('"+ids+"')");
}

/*************************************************表格和跳转页面(分页)end*************************************************/

/*************************************************向导组件(步骤)start*************************************************/
//跳转到第几页
function gotoCZSWizardStep(step){

	$(".czs-wizard-steps li.active").removeClass('active');
	$(".czs-wizard-steps li").each(function() {
		var steps = Number($(this).data("step"));
		if(steps == step){
			$(this).removeClass('complete').addClass('active');
		}else if(steps > step){
			$(this).removeClass('complete').removeClass('active');
		}else{
			$(this).removeClass('active').addClass('complete');
		}
	});

	//内容
	$(".czs-step-pane").removeClass('active');
	$(".czs-step-pane").each(function() {
		if(Number($(this).data("step")) == step){
			$(this).addClass('active').removeClass('am-animation-slide-right').addClass('am-animation-slide-left');
		}
	});
	//按钮
	if($(".czs-wizard-next").is(":hidden")){
		$(".czs-wizard-next").removeClass(czsHidden).addClass(czsShow);
		$(".czs-wizard-finish").removeClass(czsShow).addClass(czsHidden);
	}
	if($(".czs-wizard-steps li.complete").length == 0){
		$(".czs-wizard-prev").addClass('am-disabled');
	}
}
/*************************************************向导组件(步骤)end*************************************************/

/*************************************************表单验证start*************************************************/
/*表单格式(暂无使用)
<div class="am-form-icon am-form-feedback">
	<input type="text" class="am-form-field" required></input>
	<span class="am-icon-check am-hide czs-form-success"></span>
	<span class="am-icon-times am-hide czs-form-error"></span>
</div>
*/
//表单验证成功
function validCzsFormSuccess(obj){
	var $parent = obj.parent();
	var $success = $parent.children('.czs-form-success');
	var $error = $parent.children('.czs-form-error');
	$success.removeClass(czsHidden).addClass('am-block');
	$error.removeClass('am-block').addClass(czsHidden);
	$parent.removeClass('am-form-error').addClass('am-form-success');
}
/**
 * 表单验证失败
 * msg	提示信息，若不需要提示信息，则为空
 */
function validCzsFormError(obj,msg){
	var $parent = obj.parent();
	var $success = $parent.children('.czs-form-success');
	var $error = $parent.children('.czs-form-error');
	$success.removeClass('am-block').addClass(czsHidden);
	$error.removeClass(czsHidden).addClass('am-block');
	$parent.removeClass('am-form-success').addClass('am-form-error');
	if(!checkNull(msg)){
		$error.popover({theme: 'danger sm',content: msg,trigger: 'hover'});
	}
}
//表单验证还原到起始状态
function validCzsFormBefore(obj){
	var $parent = obj.parent();
	var $success = $parent.children('.czs-form-success');
	var $error = $parent.children('.czs-form-error');
	$success.removeClass('am-block').addClass(czsHidden);
	$error.removeClass('am-block').addClass(czsHidden);
	$parent.removeClass('am-form-success').removeClass('am-form-error');
}

/*************************************************表单验证end*************************************************/


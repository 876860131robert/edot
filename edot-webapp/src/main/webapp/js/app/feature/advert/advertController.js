angular.module('app').controller('advertController',
		["$rootScope", "$scope", "$filter", "dataService",
function ($rootScope, $scope, $filter, dataService) {
    var tree;
    $scope.editItem = { // 初始化界面默认值。
    	status : '1',
    	type : '0',
    	originalId : null
    };
    $scope.isNewItem = true;
    $scope.my_tree = tree = {};
    $scope.zNodes = [];
    $scope.setting = {
        view: {
        	addDiyDom: addDiyDom,
        	dblClickExpand: false,
        	selectedMulti: false,
        	showIcon: false,
            showLine: false,
            showTitle: false
        },
        data: {
            key: {
                title: "t",
                name: "alias"
            },
            simpleData: {
                enable: true,
                idKey: "id",
                pIdKey: "parentId",
                rootPId: null
            }
        },
        callback: {
            onClick: function (event, treeId, treeNode, clickFlag) {
            	$scope.$apply($scope.load_edit_item(treeNode));// 用$scope.$apply广播值变化
            }
        }
    }

    // 新增资源
    $scope.try_add_a_branch = function () {
        var b;
        b = tree.get_selected_branch();
        if(b.levelNo != "1"){
        	return false;
        }
        // 判断首屏广告下是否已有数据，有则不让再添加
        if(b.id == "02_00" && b.children && b.children.length > 0){
        	return false;
        }
        var newNode = {
            parentId: b.id,
            alias: "新增资源",
            status: '1',
            type: '1',
            levelNo: '2'
        };
        var n = tree.add_branch(b, newNode);
        if (n != null && n.length > 0) {
            tree.select_branch(n[0]);
        }
        $scope.load_edit_item(n[0]);
    };
    
    $scope.load = function (isFirst) {
    	$scope.editItem = {};
    	$scope.isNewItem = true;
    	$scope.editItem = { // 初始化界面默认值。
    		status: '1',
	    	type : '0',
	    	originalId : null
	    };
    	$("#txtParentName").attr("placeholder", "");
    	if(isFirst){
    		$('#file1').uploadifyExt({
    			baseUrl:SiteVars.ApplicationRelativeWebRoot
    			,sessionId:SiteVars.SessionId
    			,relationalTable:"ed_feature"
    			,relationalColumn:"icon"
    			,initFileIds:""
    	    	,multi: false
    	    	,fileTypeExts:'*.bmp;*.jpg;*.jpeg;*.png;*.gif;*.swf;'
    	    	,fileMaxSize:'300KB'
    			,addFileSuccess:function(fileData, fileIds){
    				$scope.editItem.icon = fileData.id;
    	    	}
    	    	,removeFileSuccess: function(){
    	    		$scope.editItem.icon = "";
    	    	}
    		});
    		$('#file2').uploadifyExt({
    			baseUrl:SiteVars.ApplicationRelativeWebRoot
    			,sessionId:SiteVars.SessionId
    			,relationalTable:"ed_feature"
    			,relationalColumn:"icon"
    			,initFileIds:""
    	    	,multi: false
    	    	,fileTypeExts:'*.bmp;*.jpg;*.jpeg;*.png;*.gif;*.swf;'
    	    	,fileMaxSize:'300KB'
    	    	,params: {"isUploadWww": true}
    			,addFileSuccess:function(fileData, fileIds){
    				$scope.editItem.icon = fileData.id;
    	    	}
    	    	,removeFileSuccess: function(){
    	    		$scope.editItem.icon = "";
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
    	$scope.resetSelect();
        dataService.getItems('/admin/feature/features', { kind: "02" })
        .success(function (data) {
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.transformTozTreeNodes(data.results);
            $scope.zNodes = nodes;
            tree.reflash();
        })
        .error(function () {
            toastr.error('加载资源异常！');
        });
    }
    
    $scope.changeSelect = function(level, value, flag, callback){
    	//当不是重置值时
    	if(value != ""){
    		if(level == "1"){
    			dataService.getItems('/system/region/getRegionList', { "level": level, "parentCode": value })
    			.success(function (d) {
    				if(d.code == "0"){
    					if(d.data != null && d.data.length > 0){
    						var s = '<option value="">请选择</option>';
    						for (var i = 0; i < d.data.length; i++) {
    							s += '<option value="'+d.data[i].regionCode+'">'+d.data[i].regionName+'</option>';
    						}
    						$("#selCity").empty();
    						$("#selCity").hide();
    						$("#selCity").append(s);
    						$("#selCity").show();
    						$("#selZone").empty();
    						$("#selZone").hide();
    						if(callback){
    							callback();
    						}
    					} else {
    						$("#selCity").empty();
    						$("#selCity").hide();
    						$("#selZone").empty();
    						$("#selZone").hide();
    					}
    				} else {
    					toastr.error(d.message);
    				}
    			})
    			.error(function () {
    				
    			});
    		} else if(level == "2"){
    			dataService.getItems('/system/region/getRegionList', { "level": level, "parentCode": value })
    			.success(function (d) {
    				if(d.code == "0"){
    					if(d.data != null && d.data.length > 0){
    						var s = '<option value="">请选择</option>';
    						for (var i = 0; i < d.data.length; i++) {
    							s += '<option value="'+d.data[i].regionCode+'">'+d.data[i].regionName+'</option>';
    						}
    						$("#selZone").empty();
    						$("#selZone").hide();
    						$("#selZone").append(s);
    						$("#selZone").show();
    						if(callback){
    							callback();
    						}
    					} else {
    						$("#selZone").empty();
    						$("#selZone").hide();
    					}
    				} else {
    					toastr.error(d.message);
    				}
    			})
    			.error(function () {
    				
    			});
    		}
    		//当是选择下拉框时
    		if(flag){
    			dataService.getItems('/admin/feature/advert/getIdByZone', { "parentId": $scope.editItem.parentId, "zone": value })
    			.success(function (d) {
    				if(d.code == "0"){
    					$scope.editItem.id = d.data;
    				} else {
    					toastr.error(d.message);
    				}
    			})
    			.error(function () {
    				
    			});
    		}
    	} else {
    		//当重置省时
    		if(level == "1"){
    			$("#selCity").empty();
				$("#selCity").hide();
				$("#selZone").empty();
				$("#selZone").hide();
    			$scope.editItem.id = "";
    		//当重置市时
    		} else if(level == "2"){
    			$("#selZone").empty();
    			$("#selZone").hide();
    			dataService.getItems('/admin/feature/advert/getIdByZone', { "parentId": $scope.editItem.parentId, "zone": $("#selProvince").val() })
    			.success(function (d) {
    				if(d.code == "0"){
    					$scope.editItem.id = d.data;
    				} else {
    					toastr.error(d.message);
    				}
    			})
    			.error(function () {
    				
    			});
    		//当重置区县时
    		} else {
    			dataService.getItems('/admin/feature/advert/getIdByZone', { "parentId": $scope.editItem.parentId, "zone": $("#selCity").val() })
    			.success(function (d) {
    				if(d.code == "0"){
    					$scope.editItem.id = d.data;
    				} else {
    					toastr.error(d.message);
    				}
    			})
    			.error(function () {
    				
    			});
    		}
    	}
    }
    
    $scope.resetSelect = function(){
    	$("#selProvince").val("");
    	$("#selCity").empty();
		$("#selCity").hide();
		$("#selZone").empty();
		$("#selZone").hide();
    }

    $scope.loadSelect = function(zone, num){
    	var id = null;
    	//当地区是省时
    	if(zone.substring(2, 6) == "0000"){
    		$("#selProvince").val(zone);
    		id = $scope.editItem.parentId + "_" + $("#selProvince").val() + "_" + num;
    		$scope.changeSelect(1, $("#selProvince").val(), false);
    	//当地区是市时
    	} else if(zone.substring(4, 6) == "00"){
    		$("#selProvince").val(zone.substring(0, 2) + "0000");
    		$scope.changeSelect(1, $("#selProvince").val(), false, function(){
    			$("#selCity").val(zone);
    			id = $scope.editItem.parentId + "_" + $("#selCity").val() + "_" + num;
    			$scope.changeSelect(2, $("#selCity").val(), false);
    		});
    	//当地区是区县时
    	} else {
    		$("#selProvince").val(zone.substring(0, 2) + "0000");
        	$scope.changeSelect(1, $("#selProvince").val(), false, function(){
        		$("#selCity").val(zone.substring(0, 4) + "00");
        		$scope.changeSelect(2, $("#selCity").val(), false, function(){
            		$("#selZone").val(zone);
            		id = $scope.editItem.parentId + "_" + $("#selZone").val() + "_" + num;
            	});
        	});
    	}
    	$scope.editItem.id = id;
    }
    
    // 加载菜单项
    $scope.load_edit_item = function (b) {
    	if(b.levelNo != "2"){
        	return false;
        }
    	$scope.editItem = {};
    	var originalId = null;
    	if(b.id){
    		$scope.isNewItem = false;
    		originalId = b.id;//记录原来的ID
    		$('#file1').uploadifyExt("reset");
    		$('#file2').uploadifyExt("reset");
    		if(b.parentId == "02_00"){
    			$('#file2').uploadifyExt("load", b.icon);
    			$('#file1').hide();
    			$('#file2').show();
    		} else {
    			$('#file1').uploadifyExt("load", b.icon);
    			$('#file1').show();
    			$('#file2').hide();
    		}
        	var array = b.id.replace(b.parentId + "_", "").split("_");
    		var zone = array[0];
    		var num = array[1];
    		$scope.loadSelect(zone, num);
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
    		$scope.resetSelect();
    	}
    	$("#txtParentName").attr("placeholder", b.getParentNode().name);
    	if(b.parentId=='02_01'){
    		$("#msg").html("上传的首页顶部广告图标尺寸为720*260，大小不超过300KB");
    	}
    	else if(b.parentId=='02_02'){
    		$("#msg").html("上传的首页中间广告图标尺寸为720*138，大小不超过300KB");
    	}
        var editItem = {
            parentId: 	b.parentId,
            describe:   b.describe,
            id: 		b.id,
            name: 		b.name,
            icon:  		b.icon,
            status:     b.status,
            type: 		b.type,
            content: 	b.content,
            param: 		b.param,
            orderNo:	b.orderNo,
            levelNo:	b.levelNo,
            originalId: originalId,
            startdate:  b.startdate,
            enddate:    b.enddate,
            starttime:  b.starttime,
            endtime:    b.endtime
        };
        $scope.editItem = editItem;
    };

    $scope.saveAdvert = function () {
    	if (!$('#form').valid()) {
            return false;
        }
    	if(typeof $scope.editItem.id != "undefined" && $scope.editItem.id != null && $scope.editItem.id != ""){
    		;
    	} else {
    		toastr.error('资源标识不能为空！');
    		return false;
    	}
    	if(typeof $scope.editItem.icon != "undefined" && $scope.editItem.icon != null && $scope.editItem.icon != ""){
    		;
    	} else {
    		toastr.error('资源图标不能为空！');
    		return false;
    	}
    	spinOn();
    	if ($scope.isNewItem) {
			dataService.addItem("/admin/feature/advert/add", $scope.editItem)
            .success(function (data) {
                if(data.code != '0') {
            		toastr.error('保存资源出错！');
            		spinOff();
            	} else {
            		toastr.success('保存资源成功！');
            		$scope.load();
            		spinOff();
            	}
            })
            .error(function () {
                toastr.error('保存资源出错！');
                spinOff();
            });
        }
        else {
        	//当主键没有改变时
        	if($scope.editItem.id == $scope.editItem.originalId){
        		dataService.updateItem("/admin/feature/advert/mod", $scope.editItem)
        		.success(function (data) {
        			if(data.code != '0') {
        				toastr.error('更新资源出错！');
        				spinOff();
        			} else {
        				toastr.success('更新资源成功！');
        				$scope.load();
        				spinOff();
        			}
        		})
        		.error(function () {
        			toastr.error('更新资源出错！');
        			spinOff();
        		});
        	//当主键发生改变时
    		} else {
    			dataService.addItem("/admin/feature/advert/add", $scope.editItem)
                .success(function (data) {
                    if(data.code != '0') {
                    	toastr.error('更新资源出错！');
                		spinOff();
                	} else {
                		toastr.success('更新资源成功！');
                		$scope.load();
                		spinOff();
                	}
                })
                .error(function () {
                	toastr.error('更新资源出错！');
                    spinOff();
                });
    		}
        }
    }
    
    $scope.processChecked = function (action) {
    	parent.layer.confirm('确定要删除该资源吗？', {
    		btn: ['确定','取消'] //按钮
    	}, function(index){
    		parent.layer.close(index);//关闭提示框
    		spinOn();
            var checked = [];
            checked.push($scope.editItem);
            if (checked.length < 1) {
                return false;
            }
            if($scope.editItem.levelNo != "2"){
            	return false;
            }
            dataService.processChecked("/admin/feature/processChecked/" + action, checked)
            .success(function (data) {
            	if(data.code != '0') {
            		toastr.error('删除资源出错！');
            		spinOff();
            	} else {
            		toastr.success('删除资源成功！');
            		$scope.load();
            		spinOff();
            	}
            })
            .error(function (data) {
            	toastr.error('删除资源出错！');
        		spinOff();
            });
    	});
    }

    $scope.load(true);

    $(document).ready(function () {
    	$('#form').validate({
            rules: {
            	txtParentName: { required: true },
            	txtId: { required: true },
                txtName: { required: true },
                txtIcon: { required: true },
                txtOrderNo: { required: true },
                txtLevelNo: { required: true }
            }
        });
    });

    function addDiyDom(treeId, treeNode) {
        var spaceWidth = 15;
        var switchObj = $("#" + treeNode.tId + "_switch"),
        icoObj = $("#" + treeNode.tId + "_ico");
        switchObj.remove();
        icoObj.before(switchObj);

        var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level) + "px'></span>";
        switchObj.before(spaceStr);
    }

}]);
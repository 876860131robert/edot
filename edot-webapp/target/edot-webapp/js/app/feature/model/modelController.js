angular.module('app').controller('modelController',
		["$rootScope", "$scope", "$filter", "dataService",
function ($rootScope, $scope, $filter, dataService) {
    var tree;
    $scope.editItem = { // 初始化界面默认值。
    	type : '1'
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

    // 新增模块
    $scope.try_add_a_branch = function () {
        var b;
        b = tree.get_selected_branch();
        var newNode = {
            parentId: b.id,
            alias: "新增模块",
            type: '1'
        };
        var n = tree.add_branch(b, newNode);
        if (n != null && n.length > 0) {
            tree.select_branch(n[0]);
        }
        $scope.load_edit_item(n[0]);
    };
    
    $scope.load = function () {
    	$scope.editItem = {};
    	$scope.isNewItem = true;
    	$scope.editItem = { // 初始化界面默认值。
	    	type : '1'
	    };
    	$("#txtParentName").attr("placeholder", "");
        dataService.getItems('/admin/feature/features', { kind: "01" })
        .success(function (data) {
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.transformTozTreeNodes(data.results);
            $scope.zNodes = nodes;
            tree.reflash();
        })
        .error(function () {
            toastr.error('加载模块异常！');
        });
    }

    // 加载菜单项
    $scope.load_edit_item = function (b) {
    	$scope.editItem = {};
    	if(b.id){
    		$scope.isNewItem = false;
    	}else{
    		$scope.isNewItem = true;
    	}
    	$("#txtParentName").attr("placeholder", b.getParentNode().name);
        var editItem = {
            parentId: 	b.parentId,
            id: 		b.id,
            name: 		b.name,
            icon:  		b.icon,
            type: 		b.type,
            content: 	b.content,
            param: 		b.param,
            orderNo:	b.orderNo,
            levelNo:	b.levelNo
        };
        $scope.editItem = editItem;
    };

    $scope.saveModel = function () {
    	if (!$('#form').valid()) {
            return false;
        }
    	spinOn();
    	 if ($scope.isNewItem) {
            dataService.addItem("/admin/feature/model/add", $scope.editItem)
            .success(function (data) {
                if(data.code != '0') {
            		toastr.error('保存模块出错！');
            		spinOff();
            	} else {
            		toastr.success('保存模块成功！');
            		$scope.load();
            		spinOff();
            	}
            })
            .error(function () {
                toastr.error('保存模块出错！');
                spinOff();
            });
        }
        else {
            dataService.updateItem("/admin/feature/model/mod", $scope.editItem)
            .success(function (data) {
            	if(data.code != '0') {
            		toastr.error('更新模块出错！');
            		spinOff();
            	} else {
            		toastr.success('更新模块成功！');
            		$scope.load();
            		spinOff();
            	}
            })
            .error(function () {
                toastr.error('更新模块出错！');
                spinOff();
            });
        }
    }
    
    $scope.processChecked = function (action) {
    	parent.layer.confirm('确定要删除该模块吗？', {
    		btn: ['确定','取消'] //按钮
    	}, function(index){
    		parent.layer.close(index);//关闭提示框
    		spinOn();
            var checked = [];
            checked.push($scope.editItem);
            if (checked.length < 1) {
                return false;
            }
            dataService.processChecked("/admin/feature/processChecked/" + action, checked)
            .success(function (data) {
            	if(data.code != '0') {
            		toastr.error('删除模块出错！');
            		spinOff();
            	} else {
            		toastr.success('删除模块成功！');
            		$scope.load();
            		spinOff();
            	}
            })
            .error(function (data) {
            	toastr.error('删除模块出错！');
        		spinOff();
            });
    	});
    }

    $scope.load();

    $(document).ready(function () {
    	$('#form').validate({
            rules: {
            	txtParentName: { required: true },
            	txtId: { required: true },
                txtName: { required: true },
                txtIcon: { required: true },
                txtContent: { required: true },
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
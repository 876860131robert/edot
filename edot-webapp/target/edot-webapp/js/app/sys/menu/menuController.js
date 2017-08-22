/**
 * 菜单管理
 */	
angular.module('app').controller('menuController', ["$rootScope", "$scope", "$filter", "dataService", function ($rootScope, $scope, $filter, dataService) {
    var tree;
    var newCount = 1;// 新增菜单索引值  
    $scope.editItem = {};
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
                name: "menuName"
            },
            simpleData: {
                enable: true,
                idKey: "menuId",
                pIdKey: "parentMenuId",
                rootPId: null
            }
        },
        callback: {
            onClick: function (event, treeId, treeNode, clickFlag) {
                console.log(treeNode);
                $scope.$apply($scope.loadEditForm(treeNode));// 用$scope.$apply广播值变化
                //$scope.loadEditForm(treeNode)
            }
        }
    }

    // 新增菜单
    $scope.try_add_a_branch = function () {
    	// 判断是否存在新增菜单，如果存在则需要保存后才能再点击新增按钮
    	if($scope.editItem.menuId != null && $scope.editItem.menuId < 0){
	    	parent.layer.alert('内容已变更请保存操作！', {icon: 1, title:'离开提示'});
	    	return;
    	}
    	
        var b = tree.get_selected_branch();
        var mid = newCount++;
        var newNode = {
            menuId: "-"+mid,
            parentMenuId: b.menuId,
            menuName: "新增菜单" + mid,
            menuType: '1',
            menuState: '1'
        };
        var n = tree.add_branch(b, newNode);
        if (n != null && n.length > 0) {
            tree.select_branch(n[0]);
        }
        $scope.loadEditForm(n[0]);
    };

    // 删除菜单
    /*$scope.try_remove_a_branch = function () {
        var b;
        b = tree.get_selected_branch();
        tree.remove_branch(b);
    };*/
    
    $scope.init = function() {
    	$scope.editItem={};
    	//$scope.isNewItem = true;
    	$scope.editItem = {
    		parentMenuId: '0',
    	    parentMenuName: '菜单列表',
    	    menuType: '1', 
    	    menuState: '1'
    	};
    }
    
    $scope.load = function () {  
    	$scope.init();
        dataService.getItems('/api/menus/all', { orderBy: " menu_order " })
        .success(function (data) {
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.transformTozTreeNodes(data);
            $scope.zNodes = nodes;
            tree.reflash();
        })
        .error(function () {
            toastr.error('加载菜单异常！');
        });
    }

    // 加载菜单项
    $scope.loadEditForm = function (b) {
    	//$scope.editItem = {};
    	if(b.menuId > 0){
    		$scope.isNewItem = false;
    	}else{
    		$scope.init();
    		$scope.isNewItem = true;
    	}
        var editItem = {
            menuId: 		b.menuId,
            parentMenuId: 	b.parentMenuId,
            parentMenuName: b.getParentNode().menuName,
            menuCode: 		b.menuCode,
            menuName: 		b.menuName,
            menuDesc: 		b.menuDesc,
            menuUrl:  		b.menuUrl,
            menuIco:  		b.menuIco,
            menuOrder:		b.menuOrder,
            menuType: 		b.menuType,
            menuState:		b.menuState
        };
        angular.copy(editItem, $scope.editItem);
        //$scope.$apply($scope.editItem)
    };

    $scope.saveMenu = function () {
    	if (!$('#form').valid()) {
            return false;
        }
    	spinOn();
    	 if ($scope.isNewItem) {
            dataService.addItem("/api/menus/add", $scope.editItem)
            .success(function (data) {
            	if(data.code != '0'){
            		  toastr.error('保存菜单出错！');
                      spinOff();
            	}else{
            		toastr.success('菜单保存成功！');
            		$scope.load();
            		spinOff();
            	}
            });
        }
        else {
            dataService.updateItem("/api/menus/update", $scope.editItem)
            .success(function (data) {
            	if(data.code != '0'){
            		toastr.error(data.message);
            		spinOff();
            	}
            	else{
            		toastr.success('菜单更新成功！');
            		$scope.load();
            		spinOff();
            	}
            });
        }
    }
    
    $scope.processChecked = function (action) {
    	parent.layer.confirm('确定要删除该菜单吗？', {
    		btn: ['确定','取消'] //按钮
    	}, function(index){
    	parent.layer.close(index);//关闭提示框
        spinOn();
        var checked = [];
        //var b = tree.get_selected_branch();
        checked.push($scope.editItem);
        if (checked.length < 1) {
            return false;
        }
        dataService.processChecked("/api/menus/processchecked/" + action, checked)
        .success(function (d) {
        	if(d.code == "-1"){
        		toastr.error(d.message);
                spinOff();
        	}else{
	            $scope.load();
	            toastr.success("删除菜单成功！");
	            spinOff();
        	}
        	});
    	 });
    }

    $scope.load();

    $(document).ready(function () {
    	$('#form').validate({
            rules: {
                txtMenuName: { required: true },
                txtMenuUrl: { required: true },
                txtMenuOrder: { number:true }
            }
        });
    });

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



}]);
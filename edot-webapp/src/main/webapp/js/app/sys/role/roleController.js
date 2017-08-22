/**
 * 角色管理
 */	
angular.module('app').controller('roleController', ["$rootScope", "$scope", "$filter", "dataService", function ($rootScope, $scope, $filter, dataService) {
	$scope.items = [];
    $scope.rights = [];
    $scope.editItem = {};
    $scope.newItem = false;
    $scope.focusInput = false;
    
    $scope.currentPage = 0;
    $scope.pagedCount = 0;
    $scope.rowCount = 0;
    $scope.filteredItems = [];
    $scope.groupedItems = [];  
    $scope.pagedItems = [];
    // set default if not passed in
    if (!$scope.itemsPerPage) {
        $scope.itemsPerPage = SiteVars.GenericPageSize;
    }
    
    $scope.my_tree = tree = {};
    $scope.zNodes = [];
    $scope.setting = {
        view: {
        	//addDiyDom: addDiyDom,
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
        check:{
        	chkStyle: "checkbox",
        	enable: true
        },
        callback: {
            onClick: function (event, treeId, treeNode, clickFlag) {
                console.log(treeNode);
            }
        }
    }

    $scope.load = function () {
        dataService.getItems('/api/roles', { take: $scope.itemsPerPage, skip: $scope.currentPage+1 })
        .success(function (data) {
            angular.copy(data.results, $scope.items);
            gridInit($scope, $filter);
            //spinOff();
        })
        .error(function () {
            toastr.error("加载角色时出错");
        });
    }

    $scope.loadRightsForm = function (id) {
    	if (!id) {
            $scope.editItem = {};
            $scope.newItem = true;
        }
        else {
            $scope.newItem = false;
            //$scope.loadCurrentRole(id);
        }
        //spinOn();
    	dataService.getItems('/api/menus/all', { orderBy: " menu_order " })
        .success(function (data) {
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.transformTozTreeNodes(data);
            $scope.zNodes = nodes;
            tree.reflash();
            $scope.loadCurrentRoleRights(id);
            $("#modal-edit-rights").modal();
            $scope.focusInput = true;
            //spinOff();
        })
        .error(function () {
            toastr.error('加载权限出错');
            //spinOff();
        });
    }
    
    // 加载当前角色权限信息
    $scope.loadCurrentRoleRights = function (id) {
        //spinOn();
        dataService.getItems('/api/roles/getrights/' + id)
        .success(function (d) {
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.getNodes();
            if(nodes.length > 0)
            	loopCheckNode(treeObj, nodes[0], d.data);
            treeObj.expandAll(true);
            $scope.editItem.roleId = id;
            $("#modal-edit-rights").modal();
            $scope.focusInput = true;
           // spinOff();
        })
        .error(function () {
            toastr.error("加载角色时出错");
           // spinOff();
        });
    }

    // 加载当前角色信息
    $scope.loadCurrentRole = function (id) {
        //spinOn();
    	if (!id) {
            $scope.editItem = {};
            $scope.newItem = true;
            $("#modal-edit").modal();
            $scope.focusInput = true;
            return false;
        }
        else {
            $scope.newItem = false;
        }
        dataService.getItems('/api/roles/' + id)
        .success(function (d) {
            angular.copy(d.data, $scope.editItem);
            $("#modal-edit").modal();
            $scope.focusInput = true;
           // spinOff();
        })
        .error(function () {
            toastr.error("加载角色时出错");
           // spinOff();
        });
    }

    $scope.save = function () {
    	if (!$('#form').valid()) {
            return false;
        }
        $scope.saveRole();
    }

    $scope.saveRole = function () {
       // spinOn();
    	 if ($scope.newItem) {
	        dataService.addItem("/api/roles/add", $scope.editItem)
	        .success(function (d) {
	        	if(d.code == "-1"){
            		toastr.error(d.message);
            		spinOff();
            	}else{
	            toastr.success("角色已添加");
	            $scope.load();
	           // spinOff();
	            $("#modal-edit").modal('hide');
	            $scope.focusInput = false;
            	}
	        })
	        .error(function () {
	            toastr.error("新增角色时出错");
	          //  spinOff();
	            $("#modal-edit").modal('hide');
	            $scope.focusInput = false;
	        });
    	 }else{
    		 dataService.updateItem("/api/roles/update", $scope.editItem)
             .success(function (data) {
            	 if(data.code != '0'){
             		toastr.error(data.message);
             		spinOff();
             	}
             	else{
                 toastr.success("角色已更新");
                 $scope.load();
                // spinOff();
                 $("#modal-edit").modal('hide');
                 $scope.focusInput = false;
             	}
             })
             .error(function () {
                 toastr.error("更新失败");
                 //spinOff();
                 $("#modal-edit").modal('hide');
                 $scope.focusInput = false;
             });
    	 }
    }

    $scope.saveRights = function () {
      //  spinOn();
    	if($scope.editItem.roleId == 1){
    		toastr.error("无法对系统默认角色进行操作，请重试！");
    		return;
    	}
        var b;
        b = tree.get_checked_branch();
        $scope.rights=[];
        for (var i=0; i<b.length; i++) {
        	$scope.rights.push({
        		roleId: $scope.editItem.roleId,
        		menuId: b[i].menuId
        	});
        }
        dataService.updateItem("/api/roles/saverights/" + $scope.editItem.roleId, $scope.rights)
        .success(function (data) {
            toastr.success("权限保存成功");
            $scope.load();
         //   spinOff();
            $("#modal-edit-rights").modal('hide');
            $scope.focusInput = false;
        })
        .error(function () {
            toastr.error("保存权限时出错");
         //   spinOff();
            $("#modal-edit-rights").modal('hide');
            $scope.focusInput = false;
        });
    }

    $scope.processChecked = function (action) {
    	parent.layer.confirm('确定要删除所选的选项吗？', {
    		btn: ['确定','取消'] //按钮
    	}, function(index){
    		parent.layer.close(index);//关闭提示框
    		processChecked("/api/roles/processchecked/", action, $scope, dataService);
    	});
    }

    $scope.del = function (id) {
      //  spinOn();
        dataService.deleteById("/api/roles", id)
        .success(function (data) {
            toastr.success("删除角色：" + id + " 成功");
       //     spinOff();
        })
        .error(function () {
            toastr.error("删除时出错：" + id);
       //     spinOff();
        });
    }

    $scope.load();

    $(document).ready(function () {
        $('#form').validate({
            rules: {
                txtRoleName: { required: true },
                txtRoleCode: { required: true }
            }
        });
    });

    $(document).ready(function () {
        //bindCommon();
    });
    
    function loopCheckNode(treeObj, node, rights) {  
        if (!node.children) return;  
        for (var i = 0, l = node.children.length; i < l; i++) {   
            if(rights.indexOf(";"+node.children[i].menuId+";") != -1){
            	treeObj.checkNode(node.children[i], true, false);
            	loopCheckNode(treeObj, node.children[i], rights);
            }
        }  
    } 
}]);
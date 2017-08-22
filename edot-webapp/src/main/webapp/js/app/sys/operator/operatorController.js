/**
 * 用户管理
 */	
angular.module('app').controller('operatorController', ["$rootScope", "$scope", "$filter", "dataService", function ($rootScope, $scope, $filter, dataService) {
    $scope.items = [];
    $scope.roles = [];
    $scope.editItem = {};
    $scope.isNewItem = false;
    $scope.focusInput = false;
    $scope.security = $rootScope.security;
    
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
                name: "orgName"
            },
            simpleData: {
                enable: true,
                idKey: "orgId",
                pIdKey: "parentOrgId",
                rootPId: null
            }
        },
        callback: {
            onClick: function (event, treeId, treeNode, clickFlag) {
            	$scope.editItem.orgId = treeNode.orgId;
            	$scope.currentPage = 0;
                $scope.load();
            }
        }
    }
    
    $scope.loadOrg = function () {              
        dataService.getItems('/api/orgs/all', { orderBy: " org_order " })
        .success(function (data) {
            var treeObj = $.fn.zTree.getZTreeObj("tree");
            var nodes = treeObj.transformTozTreeNodes(data);
            $scope.zNodes = nodes;
            tree.reflash();
        })
        .error(function () {
            toastr.error('加载机构异常！');
        });
    }

    $scope.load = function () {
        //if (!$scope.security.canManageUsers == true) {
        //    window.location.replace("../Account/Login.aspx");
        //}
    	var options = {};
    	options["take"] = $scope.itemsPerPage;
    	options["skip"] = $scope.currentPage+1;
    	options["orderBy"] = " operator_code ";
    	options.operatorCode = options.operatorName = $scope.query;
    	if($scope.editItem.orgId){
    		options["orgId"] = $scope.editItem.orgId;
    	}
        dataService.getItems('/api/operators', options)
        .success(function (data) {
            angular.copy(data.results, $scope.items);
            $scope.pagedCount = data.page.pageCount;
            $scope.rowCount = data.page.rowCount;
            gridInit($scope, $filter);
            spinOff();
        })
        .error(function () {
            toastr.error("加载操作员时出错");
        });
    }

    $scope.loadEditForm = function (id) {
        $scope.loadRoles(id);
        if (!id) {
        	$("#txtConfirmPassword").val('');
            $scope.editItem = {};
            $scope.isNewItem = true;
            $("#modal-user-edit").modal();
            /*iframe层-父子操作
            parent.layer.open({
              type: 2, // 0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
              area: '600px',
              fix: false, //不固定
              maxmin: true,
              content: 'sys#/operatorEdit'
            });*/
            $scope.focusInput = true;
            return false;
        }
        else {
            $scope.isNewItem = false;
        }
        spinOn();
        dataService.getItems('/api/operators/' + id)
        .success(function (d) {
            angular.copy(d.data, $scope.editItem);
            $("#modal-user-edit").modal();
            $("#txtPassword").val('');
        	$("#txtConfirmPassword").val('');
            $scope.focusInput = true;
            spinOff();
        })
        .error(function () {
            toastr.error("加载操作员时出错");
            spinOff();
        });
    }

    $scope.loadRoles = function (id) {
        spinOn();
       /* if (!id) {
            id = "fakeusername";
        }*/
        dataService.getItems('/api/roles/getuserroles', { orderBy: "" })
            .success(function (data) {
                angular.copy(data, $scope.roles);
                //gridInit($scope, $filter);
                spinOff();
            })
            .error(function () {
                toastr.error("加载角色时出错");
                spinOff();
            });
    }

    $scope.saveUser = function () {
        if (!$('#form').valid()) {
            return false;
        }
        spinOn();
        $scope.editItem.roles = preChecked($scope.roles);
        if ($scope.isNewItem) {
            dataService.addItem("/api/operators/add", $scope.editItem)
            .success(function (d) {
            	if(d.code == "-1"){
            		toastr.error(d.message);
            		spinOff();
            	}else{
            		toastr.success("用户已添加");
            		$scope.editItem = {};
            		$scope.load();
            		spinOff();
            		$("#modal-user-edit").modal('hide');
            		$scope.focusInput = false;
            	}
            })
            .error(function () {
                toastr.error("新增用户时出错");
                spinOff();
                $("#modal-user-edit").modal('hide');
                $scope.focusInput = false;
            });
        }
        else {
            dataService.updateItem("/api/operators/update", $scope.editItem)
            .success(function (data) {
            	 if(data.code != '0'){
              		toastr.error(data.message);
              		spinOff();
              	}
              	else{
                toastr.success("用户已更新");
                $scope.editItem = {};
                $scope.load();
                spinOff();
                $("#modal-user-edit").modal('hide');
                $scope.focusInput = false;
              	}
            })
            .error(function () {
                toastr.error("更新失败");
                spinOff();
                $("#modal-user-edit").modal('hide');
                $scope.focusInput = false;
            });
        }
    }

    $scope.processChecked = function (action) {
    	parent.layer.confirm('确定要删除所选的选项吗？', {
    		btn: ['确定','取消'] //按钮
    	}, function(index){
    		parent.layer.close(index);//关闭提示框
    	processChecked("/api/operators/processchecked/", action, $scope, dataService);
    	});
    }

    $scope.loadOrg();
    $scope.load();

    $(document).ready(function () {
        $('#form').validate({
            rules: {
                txtOperatorCode: { required: true },
                txtOperatorName: { required: true },
                txtEmail: { required: true, email: true },
                txtPassword: { required: true },
                txtConfirmPassword: { required: true, equalTo: '#txtPassword' },
				//roles: { required: true }
            }
        });
    });

    $(document).ready(function () {
        //bindCommon();
    });
}]);
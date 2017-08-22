/**
 * 机构管理
 */	
angular.module('app').controller('orgController', ["$rootScope", "$scope", "$filter", "dataService", 
function ($rootScope, $scope, $filter, dataService) {

    var tree;
    var newCount = 1;// 新增机构索引值    
    $scope.editItem = { // 初始化界面默认值。
    	orgState : '1'
    };
    $scope.isNewItem = false;
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
                console.log(treeNode);
                $scope.$apply($scope.load_edit_item(treeNode));// 用$scope.$apply广播值变化
            }
        }
    }

    // 新增机构
    $scope.try_add_a_branch = function () {
        var b;
        b = tree.get_selected_branch();
        var newNode = {
            orgId: '999' + newCount,
            parentorgId: b.orgId,
            orgName: "新增机构" + (newCount++),
            orgType: '1',
            orgState: '1'
        };
        var n = tree.add_branch(b, newNode);
        if (n != null && n.length > 0) {
            tree.select_branch(n[0]);
        }
        $scope.load_edit_item(n[0]);
    };

    // 删除机构
    $scope.try_remove_a_branch = function () {
        var b;
        b = tree.get_selected_branch();
        tree.remove_branch(b);
    };
    
    $scope.load = function () {        
        if ($('#form')) {
            $('#form')[0].reset();
        	$("#txtParentOrgName").attr("placeholder", "");
        }        
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

    // 加载编辑项
    $scope.load_edit_item = function (b) {
    	$scope.editItem = {};
    	if(b.orgId > 9990){
    		  $scope.isNewItem = true;
    	}else{
    		  $scope.isNewItem = false;
    	}
    	$("#txtParentOrgName").attr("placeholder", b.getParentNode().orgName);
        var editItem = {
            orgId: 			b.orgId,
            parentOrgId: 	b.parentOrgId,
            orgCode: 		b.orgCode,
            orgName: 		b.orgName,
            orgDesc: 		b.orgDesc,
            orgOrder:		b.orgOrder,
            orgState:		b.orgState
        };
        $scope.editItem = editItem;
    };

    $scope.saveOrg = function () {
    	if (!$('#form').valid()) {
            return false;
        }
    	spinOn();
    	 if ($scope.isNewItem) {
            dataService.addItem("/api/orgs/add", $scope.editItem)
            .success(function (data) {
                toastr.success('保存成功！');
                $scope.load();
                spinOff();
            })
            .error(function () {
                toastr.error('保存出错！');
                spinOff();
            });
        }
        else {
            dataService.updateItem("/api/orgs/update", $scope.editItem)
            .success(function (data) {
            	if(data.code != '0'){
            		toastr.error('更新出错！');
            		spinOff();
            	}
            	else{
            		toastr.success('更新成功！');
            		$scope.load();
            		spinOff();
            	}
            })
            .error(function () {
                toastr.error('更新出错！');
                spinOff();
            });
        }
    }
    
    $scope.processChecked = function (action) {
    	parent.layer.confirm('确定要删除该机构吗？', {
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
        dataService.processChecked("/api/orgs/processchecked/" + action, checked)
        .success(function (d) {
        	if(d.code == "-1"){
        		toastr.error(d.message);
                spinOff();
        	}else{
	            $scope.load();
	            toastr.success("删除机构成功！");
	            spinOff();
        	}
        })
        .error(function (data) {
            toastr.error("删除机构失败！");
            spinOff();
        	});
    	  });
    }

    $scope.load();

    $(document).ready(function () {
    	$('#form').validate({
            rules: {
                txtOrgName: { required: true },
                txtOrgUrl: { required: true }
            }
        });
    });

    



}]);
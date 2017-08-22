/**
 * 用户管理
 */	
angular.module('app').controller('operatorEditController', ["$rootScope", "$scope", "$filter", "dataService", function ($rootScope, $scope, $filter, dataService) {
    $scope.items = [];
    $scope.roles = [];
    $scope.editItem = {};
    $scope.isNewItem = false;
    $scope.focusInput = false;
    $scope.security = $rootScope.security;
  
    $scope.load = function () {
        //if (!$scope.security.canManageUsers == true) {
        //    window.location.replace("../Account/Login.aspx");
        //}
        dataService.getItems('/api/operators', { take: 0, skip: 0, filter: "1 == 1", order: "operator_code" })
        .success(function (data) {
            angular.copy(data.results, $scope.items);
            gridInit($scope, $filter);
            spinOff();
        })
        .error(function () {
            toastr.error("加载操作员时出错");
        });
    }

    $scope.loadEditForm = function (id) {
        //$scope.loadRoles(id);
        if (!id) {
            $scope.editItem = {};
            $scope.isNewItem = true;
            //$("#modal-user-edit").modal();
          //iframe层-父子操作
            parent.layer.open({
              type: 2, // 0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
              area: '600px',
              fix: false, //不固定
              maxmin: true,
              content: 'sys#/operatorEdit'
            });
            $scope.focusInput = true;
            return false;
        }
        else {
            $scope.isNewItem = false;
        }
        spinOn();
        dataService.getItems('/api/operators/' + id)
        .success(function (data) {
            angular.copy(data, $scope.editItem);
            //$("#modal-user-edit").modal();
          //iframe层-父子操作
            layer.open({
              type: 2,
              area: ['700px', '530px'],
              fix: false, //不固定
              maxmin: true,
              content: 'test/iframe.html'
            });
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
        if (!id) {
            id = "fakeusername";
        }
        dataService.getItems('/api/roles/getuserroles/' + id)
            .success(function (data) {
                angular.copy(data, $scope.roles);
                gridInit($scope, $filter);
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
        $scope.editItem.roles = $scope.roles;
        if ($scope.isNewItem) {
            dataService.addItem("/api/users", $scope.editItem)
            .success(function (data) {
                toastr.success("用户已添加");
                $scope.load();
                spinOff();
                $("#modal-user-edit").modal('hide');
                $scope.focusInput = false;
            })
            .error(function () {
                toastr.error("新增用户时出错");
                spinOff();
                $("#modal-user-edit").modal('hide');
                $scope.focusInput = false;
            });
        }
        else {
            dataService.updateItem("/api/users/update/item", $scope.editItem)
            .success(function (data) {
                toastr.success("用户已更新");
                $scope.load();
                spinOff();
                $("#modal-user-edit").modal('hide');
                $scope.focusInput = false;
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
    	processChecked("/api/users/processchecked/", action, $scope, dataService);
    }

    $scope.loadOrg();
    $scope.load();

    $(document).ready(function () {
        $('#form').validate({
            rules: {
                txtEmail: { required: true, email: true },
                txtUserName: { required: true },
                txtPassword: { required: true },
                txtConfirmPassword: { required: true, equalTo: '#txtPassword' },
                roles: { required: true }
            }
        });
    });

    $(document).ready(function () {
        //bindCommon();
    });
}]);
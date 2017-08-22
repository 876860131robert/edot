(function() {
	var module;
	module = angular.module('ngzTree', []);
	
	module.directive('zTree', ['$timeout',
		function($timeout) {
			return {
				restrict: 'A',// 通过属性定义
				replace: true,
		        scope: {
		        	treeControl: '=',
		        	zNodes: '=',
		        	setting: '='
		        },
				link: function(scope, element, attrs) {
					var treeInit, on_zNodes_change, zTreeObj, tree;
					if (scope.treeControl != null) {
					    if (angular.isObject(scope.treeControl)) {
					        tree = scope.treeControl;

					        tree.get_first_branch = function () {
					            var n = zTreeObj.getNodes();
					            if(n != null && n.length > 0)
					                return n[0];
					            return null;
					        };
					        tree.select_branch = function (b) {
					        	if (b != null) {
					        		zTreeObj.selectNode(b);
					            }
					        };
					        tree.get_selected_branch = function () {
					        	var n;
					            n = zTreeObj.getSelectedNodes();
					            if (n != null && n.length > 0) 
					                return n[0];
					            return null;
					        };
					        tree.expand_branch = function (b) {
					        	if(b != null)
					        		zTreeObj.expandNode(b, true, false, false, false);
					        };
					        tree.expand_all = function () {
					            zTreeObj.expandAll(true);
					        };
					        tree.add_branch = function (parent, new_branch) {
					        	var n;
					            if (parent != null) {
					                n = zTreeObj.addNodes(parent, new_branch);
					            } else {
					                n = zTreeObj.addNodes(null, new_branch);
					            }
					            return n;
					        };
					        tree.remove_branch = function (b) {
					        	var n = zTreeObj.getSelectedNodes();
					        	for (var i=0; i<n.length; i++) {
					        		zTreeObj.removeNode(n[i]);
					        	}
					        };
					        tree.reflash = function(){
					        	treeInit();
					        	
					        }
					    }


					    treeInit = (function () {
					        zTreeObj = $.fn.zTree.init(element, scope[attrs.setting], scope[attrs.zNodes]);
					        tree.expand_branch(tree.get_first_branch());
					        tree.select_branch(tree.get_first_branch());
					    });

					    treeInit();

					    on_zNodes_change = function () {
					        treeInit();
					    };

					    scope.$watch('zNodes', on_zNodes_change, true);// 监听值发生的变化时触发

					}
				}
			}
		}
	])

}).call(this);

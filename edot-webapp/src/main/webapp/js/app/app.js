    
var app = angular.module('app', ['ngAnimate',
                                 'ngCookies',
                                 'ngResource',
                                 'ngSanitize',
                                 'ngTouch',
                                 'ngStorage',
                                 'ui.bootstrap',
                                 'ui.load',
                                 'ui.jq',
                                 'ui.validate',
                                 'oc.lazyLoad',
                                 'pascalprecht.translate',
                                 'ngRoute'])
    .config([    '$controllerProvider', '$compileProvider', '$filterProvider', '$provide',
	    function ($controllerProvider,   $compileProvider,   $filterProvider,   $provide) {
	        
	        // lazy controller, directive and service
	    	app.controller = $controllerProvider.register;
	    	app.directive  = $compileProvider.directive;
	    	app.filter     = $filterProvider.register;
	    	app.factory    = $provide.factory;
	    	app.service    = $provide.service;
	    	app.constant   = $provide.constant;
	    	app.value      = $provide.value;
	    }]
	)    
	.config(['$routeProvider', function ($routeProvider) {
		
			$routeProvider
	        .when('/', { 
	        	templateUrl: 'js/app/tpl/app_dashboard.html',
	        	resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load(['js/controllers/chart.js']);
                    }]
                  }
	        })	        
	        .when("/menu", { 
	        	templateUrl: "js/app/sys/menu/menuView.html",
                resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load('ngzTree').then(
                            function(){
                               return $ocLazyLoad.load('js/app/sys/menu/menuController.js');
                            }
                        );
                      }
                    ]
                }
	        })
            .when("/org", { 
	        	templateUrl: "js/app/sys/org/orgView.html",
                resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load('ngzTree').then(
                            function(){
                               return $ocLazyLoad.load('js/app/sys/org/orgController.js');
                            }
                        );
                      }
                    ]
                }
            })
	        .when("/operator", { 
	        	templateUrl: "js/app/sys/operator/operatorView.html",
	        	resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load('ngzTree').then(
                            function(){
                               return $ocLazyLoad.load([
                                  'js/app/sys/org/orgController.js',
                                  'js/app/sys/operator/operatorController.js']);
                            }
                        );
                      }
                    ]
                }
	        })
	        .when("/role", { 
	        	templateUrl: "js/app/sys/role/roleView.html",
	        	resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load('ngzTreeDefault').then(
                            function(){
                               return $ocLazyLoad.load('js/app/sys/role/roleController.js');
                            }
                        );
                      }
                    ]
                }
	        })
	        .when("/model", {
	        	templateUrl: "js/app/feature/model/modelView.html",
                resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load('ngzTree').then(
                            function(){
                               return $ocLazyLoad.load('js/app/feature/model/modelController.js');
                            }
                        );
                      }
                    ]
                }})
            .when("/advert", {
            	templateUrl: "js/app/feature/advert/advertView.html",
            	resolve: {
            		deps: ['$ocLazyLoad',
            		  function( $ocLazyLoad ){
            			return $ocLazyLoad.load('ngzTree').then(
            					function(){
            						return $ocLazyLoad.load('js/app/feature/advert/advertController.js');
            					}
            			);
            		  }
            		]
            	}})
	        .otherwise({ redirectTo: '/' });
		}]
	)
    /* 运行
    .run([       '$rootScope',
        function ($rootScope) {
	          $rootScope.$state = $state;
	          $rootScope.$stateParams = $stateParams;        
	    }]
	)*/
    
var security = function () {
    // sys
    this.showTabSys = showTabSys();
    this.canManageMenu = canManageMenu();
    this.canManageRole = canManageRoles();
    this.canManageUser = canManageUser();

    function showTabSys() { return (UserVars.Rights.indexOf("sys") > -1) ? true : false; }
    function canManageMenu() { return UserVars.Rights.indexOf("sys:menu") > -1 ? true : false; }
    function canManageRole() { return UserVars.Rights.indexOf("sys:role") > -1 ? true : false; }
    function canManageUser() { return UserVars.Rights.indexOf("sys:user") > -1 ? true : false; }
}
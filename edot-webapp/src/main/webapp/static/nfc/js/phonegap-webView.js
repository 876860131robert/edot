/**
*	打开网页显示
*/
var WebView = function(){
};

WebView.prototype = {
	open: function(url) {
			cordova.exec(    
				function(pos){}, 
				function(err){},
				"WebViewPlugin",
				"open",
				[url]
			)
	},
	close:function(){
		cordova.exec(    
				function(pos){}, 
				function(err){},
				"WebViewPlugin",
				"close",
				[]
			)
	}
}
cordova.addConstructor(function() {
	if (!window.plugins) {
		window.plugins = {};
	}
	window.plugins.webViewPlugin = new WebView();
});
/**
 * 吐司相关的插件
 * @author keyz@asiainfo.com
 * @since 2013-08-01
 * 
 */
var toast = function(){};
toast.prototype = {
        ShowToast:function(content,length){
            return cordova.exec(null, null,"ToastPlugin","toast",[content,length]);
        }
};
cordova.addConstructor(function(){
    if (!window.plugins) {
        window.plugins = {};
    }
    window.plugins.ToastPlugin = new toast();
 
});
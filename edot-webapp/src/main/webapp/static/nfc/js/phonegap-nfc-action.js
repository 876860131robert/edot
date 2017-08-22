
var nfc = {
	cardNo:null,
	//读取
    addReadListener: function (win, fail) {
    	this.removeReadListener();
        document.addEventListener("tag", this.readCallback, false);
    },
    //写入
    addWriteListener: function (win, fail) {
    	this.removeWriteListener();
        document.addEventListener("tag", this.writeCallback, false);
    },
    
    //删除写入监听
    removeWriteListener: function () {
        document.removeEventListener("tag", this.writeCallback, false);
    },
    
    //删除读取监听
    removeReadListener: function () {
        document.removeEventListener("tag", this.readCallback, false);
    },
    
    //写入回调监听
    writeCallback:function(e){
    	if(e.tag.serl){
    		
    	}
    	document.removeEventListener("tag", nfc.writeCallback, false);
    },
    
    //读取回调监听
    readCallback:function(e){
    	var param={
    		cardNo:e.tag.id,
    		chipSerial:e.tag.serl,
    		cardSerial:e.tag.chip,
    		tranAmount:e.tag.cash
    	};
    	document.removeEventListener("tag", nfc.readCallback, false);
    	aigovApp.openAppWindow("nfc",param);
    }

};

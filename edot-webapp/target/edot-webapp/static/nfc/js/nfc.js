$(function(){
	
	var cardNo, amount, tranAmount, chipSerial, cardSerial;

	ajaxExecute(basePath + "/recharge/GetTradeRecord", {
		"terminalTranNo" : terminalTranNo
	}, function(data){
		if(data != null){
			
			data.terminalTranNo=terminalTranNo;
			nfc.data=data;
			if(data.resultCode == "0"){
				amount = parseFloat(data.amount) * 100;// 元转分
				//TODO 1.轮询写卡操作
				//CardRecharge2(cardNo, amount, tranAmount, chipSerial, cardSerial, terminalTranNo);
				//queryAlipayRefundRepeat(terminalTranNo);
				//初始化nfc
				var onDeviceReady=function(){
					cordova.exec(
		                function () {
		                    console.log("初始化NfcPlugin");
		                },
		                function (reason) {
		                	window.plugins.ToastPlugin.ShowToast(reason);
		                },
		                "NfcPlugin", "init", ["write",amount]
		            );
					//返回事件
					document.addEventListener("backbutton", function(){
						window.plugins.ToastPlugin.ShowToast("正在冲值中请不要退出");
					}, false); //返回键
				}
				document.addEventListener("deviceready", onDeviceReady, false);  
				//TODO 2.写卡成功调用充值接口2，失败调用退费接口
				
			} else {
				window.plugins.ToastPlugin.ShowToast("获取交易记录失败");
				window.plugins.webViewPlugin.close();
			}
		} else {
			window.plugins.ToastPlugin.ShowToast("获取交易记录失败");
			window.plugins.webViewPlugin.close();
			
		}
	}, true);
	
	
});

// 充值接口2
function CardRecharge2( ){
	var cardNo = nfc.data.cardNo;
	var amount = parseFloat(nfc.data.amount) * 100;// 元转分
	var tranAmount = parseFloat(nfc.data.totalAmount) * 100;// 元转分，接口返回的总金额实际上是余额
	var chipSerial = nfc.data.chipSerial;
	var cardSerial = nfc.data.cardSerial;
	var terminalTranNo=nfc.data.terminalTranNo;
	
	ajaxExecute(basePath + "/recharge/CardRecharge2", {
		"cardNo" : cardNo,
		"amount" : amount,
		"totalAmount" : parseInt(amount) + parseInt(tranAmount),
		"chipSerial" : chipSerial,
		"cardSerial" : cardSerial,
		"terminalTranNo" : terminalTranNo
	}, function(data){
		window.plugins.ToastPlugin.ShowToast("成功充值" + (amount / 100) + "元！");
		window.plugins.webViewPlugin.close();
	}, true);
}

// 退费接口
function queryAlipayRefundRepeat(){
	var terminalTranNo=nfc.data.terminalTranNo;
	ajaxExecute(basePath + "/wiseMedical/queryAlipayRefundRepeat", {
		"sourceType" : "3",
		"orderId" : terminalTranNo
	}, function(data){
		if(data != null){
			if(data.result_Code == "0000"){
				CorrectCommonRecharge(terminalTranNo, "04");
				window.plugins.ToastPlugin.ShowToast("退款成功！");
			} else {
				CorrectCommonRecharge(terminalTranNo, "02");
				window.plugins.ToastPlugin.ShowToast("退款失败，请联系客服！");
				window.plugins.webViewPlugin.close();
			}
		} else {
			CorrectCommonRecharge(terminalTranNo, "02");
			window.plugins.ToastPlugin.ShowToast("退款失败，请联系客服！");
			window.plugins.webViewPlugin.close();
		}
	}, true);
}

// 冲正接口
function CorrectCommonRecharge(terminalTranNo, payStatus){
	ajaxExecute(basePath + "/recharge/CorrectCommonRecharge", {
		"terminalTranNo" : terminalTranNo,
		"payStatus" : payStatus
	}, function(data){

	}, true);
}



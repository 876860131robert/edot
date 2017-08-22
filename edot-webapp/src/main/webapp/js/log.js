/**
 * @author songxiaoliang
 * 前端日志
 */
var Logger = {
	debug:false,
	height:100,
	init: function(){
		if($('#log_0000').length==0){
			var logPanel = [
				'<div id="log_0000" style="float:left;">',
				'<div id="log_content" style="float:left;"/>',
				'<div id="log_title" style="float:right;word-break:break-all;background-color:#bcbcbc;">',
					'<div style="width:20px"><a href="javascript:void(0)">清空日志</a></div>',
				'</div>',
				'</div>'
				];
			$('html').append(logPanel.join(''));
			$("#log_0000").css({'position':'fixed','bottom':'0px','z-index':'1001','width':'100%','height':this.height+'px'});
			$("#log_0000").css({'background-color':'#CDE6FF'});
			$("#log_0000").css('top',($(window).height()-this.height)+'px');
			$("#log_0000").css('border','2px solid #bcbcbc');
			
			$("#log_title").css({'height':this.height+'px'});
			$("#log_title div").css({'padding':'5px 0 0 0', 'margin-left':'5px'});
			
			$("#log_content").css({'position':'fixed','overflow-y':'auto','overflow-x':'hidden'});
			$("#log_content").css({'padding':'5px 0 0 15px'});
			$("#log_content").css({'height':(this.height-10)+'px'});
			$("#log_content").css({'width':$('#log_0000').width()-40+'px'});
			
			$("#log_title a").click(function(){
				$("#log_content").html("");
			})
		}
	},
	info: function(obj){
		if(this.debug){
			this.init();
			var content = '<div>'+this.getString(obj)+'</div>';
			$("#log_content").append(content);
		}
	},
	getString : function(obj){
		if(typeof obj=="number" || typeof obj == "string" || typeof obj == "boolean"){
			return obj;
		}
		if(typeof obj == "object"){
			return this.parseObject(obj);
		}
		else if(typeof obj == "array"){
			return this.parseArray(obj);
		}
	},
	parseArray : function(array){
		var str = "";
		for(i in array){
			var obj = array[i];
			if(typeof obj=="number" || typeof obj == "string" || typeof obj == "boolean"){
				str += ("\""+obj+"\"");
				continue;
			}
			if(typeof obj == "object"){
				str += this.parseObject(obj);
				continue;
			}
			else if(typeof obj == "array"){
				str += this.parseArray(obj);
				continue;
			}
		}
		return str;
	},
	parseObject : function(obj){
//		var str = "{";
//		for(key in obj){
//			if(typeof obj[key]=="number" || typeof obj[key] == "string" || typeof obj[key] == "boolean"){
//				str += (key+":"+obj[key]+",");
//				continue;
//			}
//			if(typeof obj[key] == "object"){
//				str += (key+":"+this.parseObject(obj[key])+",");
//				continue;
//			}
//			else if(typeof obj[key] == "array"){
//				str += (key+":"+this.parseArray(obj[key])+",");
//				continue;
//			}
//		}
//		return str+"}";
		return JSON.stringify(obj);
	},
	test : function(){
		Logger.debug = true;
		Logger.info("字符串");
		Logger.info(111);
		Logger.info(true);
	}
}
/** 
 * @author songxiaoliang
 * 
 * options说明：
 *	baseUrl：应用根路径（必填）
 *  sessionId：会话ID（必填）
 *  relationalTable：关联的业务表名（存储在sys_file表里，作为日志查看）
 *  relationalColumn：关联的业务表字段名（存储在sys_file表里，作为日志查看）
 *  fileMaxSize：所有文件总计允许最大尺寸，值例：3MB或100KB
 *  initFileIds：初始化文件id列表，多的逗号隔开
 *  multi:是否允许多文件，如果为false，则页面上始终显示最后一次上传的文件
 *  addFileSuccess(data, fileIds): 添加文件成功后回调，data:SysFile的json数据;fileIds:当前文件编号（逗号隔开）
 *  removeFileSuccess(fileId, fileIds): 删除文件成功回调，fileId:删除的sys_file记录id;fileIds:当前文件编号（逗号隔开）
 *  fileTypeExts:'*.jpg;*.jpge;*.gif;*.png;*.doc;*.docx;*.xls;*.xlsx;*.ppt;*.pptx;*.pdf;*.rar;*.zip',//文件格式
 *  params:{a:1} :静态参数
 *  validateBefore:function(){} :参数
 *  getParams: function(){} 动态参数
 *  
 *  其他参数参照settings
 *  禁止使用uploadLimit、fileSizeLimit，这些属性有bug
 *  
 *  注意：多文件提交，swf实际上是一个一个提交，所以每完成一个都会回调success方法
 */
//Logger.debug = true;
(function ($) {
	
    function insertFileInfo(uploadifyId, fileData, swfFile){
		Logger.info("insertFileInfo()");
		Logger.info(fileData.fileName);
		var $uploadifyExt = $("#"+uploadifyId).parent().parent();
		var options = $uploadifyExt.data("options");
		//如果单文件上传，则先删除先前的文件
		if(!options.multi){
			if($uploadifyExt.find(".swfFileInfo").length>0){
				removeFileInfo(uploadifyId, $uploadifyExt.find(".swfFileInfo").attr("id"));
			}
		}
		//添加缓存数据
		var sysFile = new SysFile();
		sysFile.id = fileData.id;
		sysFile.fileName = fileData.fileName;
		sysFile.filePath = fileData.filePath;
		sysFile.fileSize = fileData.fileSize;
		if(swfFile){
			sysFile.swfFileId = swfFile.id;
		}
		
		$uploadifyExt.data('DataCache').add(sysFile);
		//添加视图
		var cancelImg = options.baseUrl+'/js-plugs/swfupload/images/uploadify-cancel.png';
		var html = '<div id="#fileId" class="swfFileInfo">' +
						'<a href="javascript:void(0)" style="color:blue">#fileDes</a>' +
						'<img src="'+cancelImg+'" title="删除" />' +
					'</div>';
		html = html.replaceAll('#fileId',fileData.id);
		html = html.replaceAll('#fileDes',sysFile.getDesc());
		var $html = $(html);
		$html.find('img').click(function(){
			var fileId = $(this).parent().attr("id");
			showConfirm("确认删除？",function(){
				removeFileInfo(uploadifyId, fileId);
			});
		})
		$html.find('a').click(function(){
			downloadSysFile(fileData.id);
		})
		Logger.info("当前文件对象ID："+$uploadifyExt.attr("id"));
		$uploadifyExt.find('#swfFileList').append($html);
	}
	function removeFileInfo(uploadifyId, fileId){
		Logger.info("removeFileInfo()");
		Logger.info({uploadifyId:uploadifyId, fileId:fileId});
		var $uploadifyExt = $("#"+uploadifyId).parent().parent();
		var options = $uploadifyExt.data("options");
		var cache = $uploadifyExt.data("DataCache");
		
		$("#"+fileId).remove();//删除视图
		removeFileFromDb(options.baseUrl, fileId);//删除数据库
		var swfFileId = cache.get(fileId).swfFileId;
		if(swfFileId && swfFileId!=""){
			$("#"+uploadifyId).uploadify('cancel', swfFileId);//删除队列
		}
		
		cache.remove(fileId);//删除缓存
		//回调
		var cache = $uploadifyExt.data("DataCache");
		options.removeFileSuccess(fileId, cache.getIds());
	}
	function removeFileFromDb(baseUrl, fileId){
		ajaxExecute(baseUrl+'/sys/file/remove?ids='+fileId);
	}
	function validateSize(uploadifyId, uploadSize){
    	Logger.info("validateSize()");
    	var $uploadifyExt = $("#"+uploadifyId).parent().parent();
		var options = $uploadifyExt.data("options");
		var cache = $uploadifyExt.data("DataCache");
		
    	var sumMaxByteSize = 0;
    	if(options.fileMaxSize.toUpperCase().indexOf('KB')!=-1){
    		sumMaxByteSize = parseInt(options.fileMaxSize.replace('KB'),'')*1024;
    	}
    	else if(options.fileMaxSize.toUpperCase().indexOf('MB')!=-1){
    		sumMaxByteSize = parseInt(options.fileMaxSize.replace('MB'),'')*1024*1024;
    	}
    	else{
    		showMessage("fileMaxSize值错误:"+options.fileMaxSize);
    		return;
    	}
    	var currSumFileSize = cache.getSumFileSize();
    	
    	//多文件上传
    	if(options.multi){
    		Logger.info({"currSumFileSize":currSumFileSize,"uploadSize":uploadSize,"sumMaxByteSize":sumMaxByteSize});
    		if((currSumFileSize + uploadSize) > sumMaxByteSize){
    			showMessage('上传失败：文件总大小超过最大限制 '+options.fileMaxSize);
    			return false;
    		}
    	}
    	//单文件上传
    	else{
    		Logger.info({"uploadSize":uploadSize,"sumMaxByteSize":sumMaxByteSize});
    		if(uploadSize > sumMaxByteSize){
    			showMessage('上传失败：文件大小超过最大限制 '+options.fileMaxSize);
    			return false;
    		}
    	}
		return true;
	}
    //隐藏进度条
	function hideProgress(uploadifyId, swfFileId){
		var $uploadifyExt = $("#"+uploadifyId).parent().parent();
		if(swfFileId){
			$uploadifyExt.find("#"+swfFileId).hide();
		}else{
			$uploadifyExt.find(".uploadify-queue-item").hide();
		}
	}
	function showMessage(message){
		alert(message);
	}
	function showConfirm(message, trueCallBack){
		var c = confirm(message);
        if(c){
        	trueCallBack();
        }

		//showConfirm(message, trueCallBack);
	}
	function initFiles(uploadifyId){
		var $uploadifyExt = $("#"+uploadifyId).parent().parent();
		var options = $uploadifyExt.data("options");
		var ids = options.initFileIds;
		if(ids!=''){
			Logger.info("initFiles()");
			Logger.info(ids);
		
			ajaxExecute(options.baseUrl+'/sys/file/select',{ids:ids}, function(jsonData){
				Logger.info(jsonData);
				if(jsonData && jsonData!=null){
					for(i in jsonData){
						insertFileInfo(uploadifyId, jsonData[i]);
					}
				}
			});
		}
	}
	
	var methods = {
		init : function(options) {
			return this.each(function() {
				var $this = $(this);
				var uploadifyId = this.id+'_swfuploadify';
				
				var defOptions = {
					uploadifyExtId : this.id,
					uploadifyId : uploadifyId,
		    		baseUrl : "",
		    		sessionId : "",
		    		relationalTable : "",
		    		relationalColumn : "",
		    		fileMaxSize : "100MB",
		    		initFileIds : "",
		    		multi : true,
		    		addFileSuccess : function(fileData){},
		    		removeFileSuccess : function(fileId){},
		    		params : {},
		    		validateBefore: function(){ return true;}
		    	};
		    	$.extend(defOptions, options);
		    	
				if(defOptions.baseUrl == '') {
					showMessage('请定义应用根路径！');
					return false;
				}
				if(defOptions.sessionId == '') {
					showMessage('请传入sessionId！');
					return false;
				}
				
				var submitUrl = defOptions.baseUrl+'/sys/file/upload.do;jsessionid='+defOptions.sessionId;
				defOptions.params.relationalTable = defOptions.relationalTable;
				defOptions.params.relationalColumn = defOptions.relationalColumn;
				
		        var settings = {
		        	formData: defOptions.params,
					height: '26',//上传按钮的高度
					width: '74',//上传按钮的长度
					fileObjName:'file',
					buttonText: '上传附件',//上传按钮的名字
					swf      : defOptions.baseUrl+'/js-plugs/swfupload/css/uploadify.swf',//对应的SWF文件
					uploader : submitUrl,//上传文件请求url
					fileTypeExts:'*.jpg;*.jpge;*.gif;*.png;*.doc;*.docx;*.xls;*.xlsx;*.ppt;*.pptx;*.pdf;*.rar;*.zip',//文件格式
					auto:true,//选定文件后是否自动上传
					//fileSizeLimit:'9999MB',//禁用,上传文件的大小限制。目前暂不用该属性控制，改用自定义fileMaxSize属性控制
					successTimeout : 9999,//超时时间
					simUploadLimit:1,
					multi:true,//是否允许同时上传多文件，可设定true或false
					onFallback:function(){//检测FLASH失败调用
		        		showMessage("未安装FLASH插件");
			        },
			        //上传前
			        onUploadStart : function(swfFile){
			        	var uploadifyId = this.settings.uploadifyId;
			        	var success = validateSize(settings.uploadifyId, swfFile.size) && defOptions.validateBefore();
			        	if(!success){
			        		$("#"+uploadifyId).uploadify('cancel', swfFile.id);
			        		$("#"+uploadifyId).uploadify('stop');
			        		hideProgress(uploadifyId);
			        	}
			        	if(defOptions.getParams){
			        		var params = defOptions.getParams();
			        		$("#"+uploadifyId).uploadify("settings", "formData", params)
			        	}
			        },
			        //上传到服务器，服务器返回相应信息到result里
			        onUploadSuccess:function(swfFile, result, response){
			        	var uploadifyId = this.settings.uploadifyId;
			        	var jsonData = JSON.parse(result);
			        	if(jsonData.code!=0){
			        		showMessage("上传文件失败："+jsonData.message);
			        		return;
			        	}
			        	//隐藏进度条
		        		hideProgress(uploadifyId, swfFile.id);
		        		//插入文件信息
		        		var fileData = jsonData.data;
		    			insertFileInfo(uploadifyId, fileData, swfFile);//上传成功后返回处理，这里是将上传后的文件名字返回回来，设置给隐藏域。同时显示本地文件名和文件大小。
		        		//成功回调
		    			var uploadifyExtId = this.settings.uploadifyExtId;
		    			var cache = $("#"+uploadifyExtId).data("DataCache");
		    			this.settings.addFileSuccess(fileData, cache.getIds());
			        },
			        //选择上传文件后调用
			        onSelect : function(file) {
			        },
			        //每次更新上载的文件的进展
			        onUploadProgress : function(file, bytesUploaded, bytesTotal, totalBytesUploaded, totalBytesTotal) {
			            $('#progress').html(totalBytesUploaded + ' bytes uploaded of ' + totalBytesTotal + ' bytes.');
			        },
			        onUploadComplete:function(file, data, response){
			        },
			        onError :function (event,queueId,fileObj,errorObj){
			        	showMessage(errorObj.type+":\t"+errorObj.info);
			        }
				};
		        $.extend(settings, defOptions);
		        
		        html = [
		            '<div style="">',
		            	//'<div id="'+uploadifyId+'" />',
		            	'<input id="'+uploadifyId+'" name="file" type="file" multiple="true"/>',
		            	'<div id="swfFileList" />',
		            '</div>',
		        ];
             	$html = $(html.join(""));
             	$this.append($html);
		        
             	$("#"+uploadifyId).uploadify(settings);
		        
             	$(this).data("options", defOptions);
             	$(this).data("DataCache", new SysFileDataCache());
             	
		        initFiles(uploadifyId);
			});
			
		},
		
		reset : function() {
			var cache = $(this).data("DataCache");
			var options = $(this).data("options");
			for(i in cache.array){
				var sysFile = cache.array[i];
				var fileId = sysFile.id;
				$("#"+fileId).remove();//删除视图
				var swfFileId = sysFile.swfFileId;
				if(swfFileId && swfFileId!=""){
					try{
						$("#"+options.uploadifyId).uploadify('cancel', swfFileId);//删除队列
					}catch(e){}
				}
			}
			
			cache.clear();//删除缓存
		},

		load : function(fileIds) {
			var cache = $(this).data("DataCache");
			var options = $(this).data("options");
			var fileIdArr = fileIds.split(",");
			var notRepeated = [];
			for(j in fileIdArr){
				if(cache.get(fileIdArr[j])==null){
					notRepeated.push(fileIdArr[j]);
				}
			}
			
			if(notRepeated.length>0){
				Logger.info("load()");
				Logger.info(fileIds);
			
				ajaxExecute(options.baseUrl+'/sys/file/select',{ids:notRepeated.join(",")}, function(jsonData){
					if(jsonData && jsonData!=null){
						for(k in jsonData){
							insertFileInfo(options.uploadifyId, jsonData[k]);
						}
					}
				});
			}
		},
		
		dataCache : function() {
			return $(this).data("DataCache");
		}
	}
    
    $.fn.uploadifyExt = function(method) {
		if (methods[method]) {
			return methods[method].apply(this, Array.prototype.slice.call(arguments, 1));
		} else if (typeof method === 'object' || !method) {
			return methods.init.apply(this, arguments);
		} else {
			showMessage('在$.uploadifyExt里找不到方法 【' + method + '】');
		}
	}
})(jQuery);

//文件
function SysFile(){
	this.id="";
	this.swfFileId="";
	this.fileName="";
	this.filePath="";
	this.fileSize=0;//单位字节

	this.getDesc = function(){
		var fileSizeDes = this.fileSize/1024;
		if(fileSizeDes<1000){
			fileSizeDes = fileSizeDes.toFixed(0) +'KB';
		}
		else{
			fileSizeDes = fileSizeDes/1024;
			fileSizeDes = fileSizeDes.toFixed(2) +'MB';
		}
		
		return this.fileName+" ("+fileSizeDes+")";
	}
	
	this.toString = function(){
		var str = "";
		for(key in this){
			if("toString,getDesc".indexOf(key)!=-1) continue;//过滤显示属性
			str += ("["+key+":"+this[key]+"]");
		}

		return str;
	}
}

//缓存
function SysFileDataCache(){
	this.array = new Array();
	
	this.sort = function(){
		this.array.sort(function(a, b){
			return a.id>b.id ? 1 :-1
		});
	},
	this.add = function(bean){
		this.array.push(bean);
	},
	this.get = function(id){
		for(i in this.array){
			if(this.array[i].id==id){
				return this.array[i];
			}
		}
		return null;
	},
	this.remove = function(id){
		for(i in this.array){
			if(this.array[i].id==id){
				this.array.splice(i,1);
				break;
			}
		}
		
		return this;
	},
	this.size = function(){
		return this.array.length;
	},
	this.clear = function(){
		return this.array = new Array();
	},
	this.getSumFileSize = function(){
		var sum = 0;
		for(i in this.array){
			sum += parseInt(this.array[i].fileSize);
		}
		return sum;
	},
	this.toString = function(){
		return this.array.join("<br/>");
	},
	this.getIds = function(){
		var ids = "";
		for(i in this.array){
			ids += this.array[i].id;
			if(i<this.size()-1){
				ids += ","
			}
		}
		return ids;
	},
	this.printLog = function(){
		Logger.info(this.toString());
	}
}

//下载文件
function downloadSysFile(id){
	window.open(basePath+"/sys/file/download?id="+id);
}
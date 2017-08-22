<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>信箱详情</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
</head>
<script>
$(function() {


});

function reply(){
	ajaxSubmitForm($("#replyForm"), function(data){
		parent._table.draw();
		closeDialogInIframe();
	});
}
</script>
<body>
	<form id="replyForm" action="${ctx}/admin/hotLine/hotMailReply" method="post">
		<input type="hidden" name="id" value="${bean.hotMailId}"/>
		<table class="table table-striped czs-bs-table">
		    <tr>
		    	<td style="width:20%">信件内容:</td>
		    	<td><textarea style="width:95%;height:100px" disabled="disabled">${bean.hotMailContent}</textarea></td>
		    </tr>
		    <tr>
		    	<td>回复内容:</td>
		    	<td><textarea style="width:95%;height:180px" name="content"></textarea></td>
		    </tr>
		</table>
		<div class="center">
		<button type="button" class="btn btn-success" onclick="reply()">回复</button>
		</div>
	</form>
</body>

</html>

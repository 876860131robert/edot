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

</script>
<body>
	<table class="table table-striped czs-bs-table">
	    <tr>
	    	<td>标&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题:</td>
	    	<td>${bean.hotMailTitle}</td>
	    </tr>
	    <tr>
	    	<td>创建时间:</td>
	    	<td><fmt:formatDate value="${bean.createDate}" pattern="yyyy-MM-dd" /></td>
	    </tr>
	    <tr>
	    	<td>信件类型:</td>
	    	<td><ai:dictWrite name="bean.modelId" dictId="HOT_MAIL-MODEL_ID"/> </td>
	    </tr>
	    <tr>
	    	<td>意见类型:</td>
	    	<td><ai:dictWrite name="bean.hotMailAim" dictId="HOT_MAIL_AIM"/> </td>
	    </tr>
	    <tr>
	    	<td>是否已读:</td>
	    	<td>${bean.isRead=='1'?'是':'否' }</td>
	    </tr>
	    <tr>
	    	<td>是否回复:</td>
	    	<td>${bean.replyState=='1'?'已回复':'未回复' }</td>
	    </tr>
	    <tr>
	    	<td>信件内容:</td>
	    	<td><textarea style="width:95%;height:100px" disabled="disabled">${bean.hotMailContent}</textarea></td>
	    </tr>
	    <tr>
	    	<td>是否回复:</td>
	    	<td>${bean.replyState==1 ?'已回复':'未回复' }</td>
	    </tr>
	    <c:if test="${bean.replyState=='1'}">
	    <tr>
	    	<td>回复人:</td>
	    	<td>${bean.replyerName}</td>
	    </tr>
	    <tr>
	    	<td>回复时间:</td>
	    	<td><fmt:formatDate value="${bean.replyTime}" pattern="yyyy-MM-dd" /></td>
	    </tr>
	     <tr>
	    	<td>回复内容:</td>
	    	<td><textarea style="width:95%;height:100px" disabled="disabled">${bean.replyContent}</textarea></td>
	    </tr>
	    </c:if>
	</table>
</body>

</html>

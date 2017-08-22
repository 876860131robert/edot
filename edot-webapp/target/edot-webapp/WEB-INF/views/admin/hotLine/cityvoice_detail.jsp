<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title>城市声音详情</title>
	<%@ include file="/WEB-INF/views/common/public.jsp" %>
</head>
<script>
$(function() {


});

</script>
<body>
	<table class="table table-striped czs-bs-table">
	    <tr>
	    	<td>姓名:</td>
	    	<td>${bean.createName}</td>
	    </tr>
	    <tr>
	    	<td>创建时间:</td>
	    	<td><fmt:formatDate value="${bean.createDate}" pattern="yyyy-MM-dd" /></td>
	    </tr>
	    <tr>
	    	<td>地址定位:</td>
	    	<td>${bean.address}</td>
	    </tr>
	    <tr>
	    	<td>点赞数:</td>
	    	<td>${bean.likeNum}</td>
	    </tr>
	    <tr>
	    	<td>回复数:</td>
	    	<td>${bean.replyNum}</td>
	    </tr>
	    <tr>
	    	<td>内容:</td>
	    	<td><textarea style="width:95%;height:100px" disabled="disabled">${bean.factContent}</textarea></td>
	    </tr>
	    <tr>
	    	<td>相关图片:</td>
	    	<td>
	    	<c:if test="${!empty bean.img1}"><img src="${bean.img1}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img2}"><img src="${bean.img2}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img3}"><img src="${bean.img3}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img4}"><img src="${bean.img4}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img5}"><img src="${bean.img5}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img6}"><img src="${bean.img6}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img7}"><img src="${bean.img7}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img8}"><img src="${bean.img8}" width="150"/></c:if>
	    	<c:if test="${!empty bean.img9}"><img src="${bean.img9}" width="150"/></c:if>
	    	</td>
	    </tr>
	</table>
</body>

</html>

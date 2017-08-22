<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
<title>APP下载</title>
</head>
<body>
    <div style="margin:20px;"><a href="itms-services://?action=download-manifest&url=https://ydt.xy12345.cn/edot/upload/client/edot.plist" download="咸阳一点通">咸阳一点通IOS版</a></div>
    <div style="margin:20px;"><a href="${ctx}/upload/client/AigovAppV1.0.1.apk" download="咸阳一点通">咸阳一点通ANDROID版</a></div>
</body>
</html>

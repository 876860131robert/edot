<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>
<%@ include file="/WEB-INF/views/common/public.jsp" %>
<%
	String outTradeNo = request.getParameter("out_trade_no");
%>
<!DOCTYPE HTML>
<html>
<head>
<title>NFC充值</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/weui.css"/>
<link rel="stylesheet" href="css/public.css"/>
<link rel="stylesheet" href="css/tax.css"/>
<link rel="stylesheet" href="css/pay.css"/>
<link href="css/css3icon/css/font-awesome.min.css" rel="stylesheet">
<script type="text/javascript">
var terminalTranNo = "<%=outTradeNo%>";
</script>
<script type="text/javascript" src="js/cordova.js"></script>
<script type="text/javascript" src="js/phonegap-toast.js"></script>
<script type="text/javascript" src="js/phonegap-nfc-action.js"></script>
<script type="text/javascript" src="js/phonegap-webView.js"></script>
<script type="text/javascript" src="js/nfc.js"></script>
</head>

<body>
<header id="header">
    <h3>刷卡充值</h3>
    <div class="logo"><img src="images/headerLogo.png" height="35" /></div>
</header>

<div class="m-t-50"></div>

<div class="prompt">
    <h6><img src="images/nfc_02.png" class="fl"/> 友情提示</h6>
    <div class="clear"></div>
    <p>1.使用中须开启NFC功能</p>
    <p>2.充值＝<span>支付＋圈存</span>(将充值金额写入您的卡内)</p>
    <p>3.<span>圈存过程中请勿移动卡片</span></p>
    <p>4.一卡通服务热线：029-12345</p>
</div>
<div class="pay">
    <div class="payCard"><img src="images/nfc_01.png" width="70%"/> </div>
    <p>将您的卡贴于手机背面，并保持10秒，系统将会把您的<font color="red">充值金额写入卡内，在此过程中请勿移动卡片</font></p>
    <div class="m-t-30"></div>
</div>

</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>在咸阳12345</title>
  <meta name="description" content="app, web app, responsive, responsive layout, admin, admin panel, admin dashboard, flat, flat ui, ui kit, AngularJS, ui route, charts, widgets, components" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
  <link href="css/public.css" rel="stylesheet" type="text/css">
  <link href="css/login.css" rel="stylesheet" type="text/css">
  <!-- jQuery -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script>
  $(function(){
	  $("#captcha").attr("class","fl Linput w-i-40");
	  $("#kaptchaImage").attr("class","fl").attr("height","37px").attr("style","margin-left:15px");
	  $("form a").click(function(){
		  $("form").submit();
	  })
  })
  </script>
  <script type="text/javascript">
		try{
            if (top.location != self.location){ 
               top.location=self.location;
               top.window.location.href   =   window.location.href;
               window.location.reload();
            }
        }catch(e){;} 
</script>
</head>
<body>

<!--top begin-->
<div class="wrap top">
    <div class="fl logo"><a href="#"><img src="images/logo.gif" alt="在咸阳12345" /></a></div>
    <span class="fl">后台管理系统</span>
    <div class="cl"></div>
</div>
<!--top end-->

<div class="wrap100 loginContent">
    <div class="banner" id="banner">

        <a href="#" class="d1" style="background:url(images/banner1.jpg) center no-repeat;"></a>
        <div class="d2" id="banner_id">
            <ul>
                <li></li>
            </ul>
        </div>
    </div>

	<form name="form" class="form-validation" action="${ctx}/login" method="post">
    <div class="loginInput">
        <div class="login">
            <h3 class="bg-blue">登录</h3>
            <ul class="prompt">${message}</ul>
            <ul>
                <li><span>用户名</span><input type="text" name="username" placeholder="用户名" class="Linput w_b_90" required></li>
                <li><span>密码</span><input type="password" name="password" placeholder="密码" class="Linput w_b_90" required></li>
                <li><span>验证码</span> <ai:kaptcha /></li>
            </ul>
            <div class="cl"></div>
            <div class="enter bg-blue"><a href="#">立即登录</a></div>
            <button type="submit" style="display:none" >登录</button>
        </div>
        <div class="loginBg"></div>
    </div>
	</form>

</div>

<!--bottom begin-->
<div class="wrap100 foot footBg">
    <br/>
    <p>Copyright © 2016 asiainfo. All rights reserved 陕ICP备11009411号-1</p><div class="cl"></div>
</div>
<!--bottom end-->
  	
</body>
</html>
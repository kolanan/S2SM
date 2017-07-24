<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">
	var CtxPath ="${pageContext.request.contextPath}";
</script>
<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>登陆</title>
		<meta name="keywords" content="登陆" />
		<meta name="description" content="~" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body>

        <div class="page-container">
            <h1>注册</h1>
            <form action="regist.action" method="post">
                <input type="text" name="name" class="username" placeholder="用户名">
                <input type="password" name="password" class="password" placeholder="密码">
                <input type="text" name="question" class="username" placeholder="提示问题">
                <input type="text" name="answer" class="username" placeholder="答案">
                <button type="submit">提交</button>
                <div class="error"><span>+</span></div>
            </form>

            
            <div class="connect">
                <p>Or connect with:</p>
                <p>
                    <a class="facebook" href=""></a>
                    <a class="twitter" href=""></a>
                </p>
            </div>
        </div>
		
        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>

    </body>

</html>
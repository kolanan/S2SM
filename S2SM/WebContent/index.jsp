<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Login</title>
		<meta charset="utf-8">
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>
	 <!-----start-main---->
	 <div class="main">
		<div class="login-form">
			<h1>Member Login</h1>
					<div class="head">
						<img src="images/user.png" alt=""/>
					</div>
				<form action="login.action" method="post">
					<input type="text" name="username" class="text" value="USERNAME" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'USERNAME';}" >
					<input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
					<div class="submit">
						<input type="submit" value="LOGIN" >
					</div>	
					<p><a href="#">Forgot Password ?</a></p>
				</form>
			</div>
			<!--//End-login-form-->
			 <!-----start-copyright---->
   					<div class="copy-right">
						<p>Copyright &copy; 2014.Company name All rights reserved.</p> 
					</div>
				<!-----//end-copyright---->
		</div>
			 <!-----//end-main---->
		 		
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
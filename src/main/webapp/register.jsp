<%@ page pageEncoding="utf-8" isELIgnored="false"%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">

	<!-- Animate.css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
	<!-- Flexslider  -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/flexslider.css">
	<!-- Theme style  -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

	<!-- Modernizr JS -->
	<script src="${pageContext.request.contextPath}/js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath}/js/respond.min.js"></script>
	<![endif]-->
	<script type="text/javascript">
        function vaildate(){
            var username = document.getElementsByName("username")[0];
            var password = document.getElementsByName("password")[0];
            var rePassword = document.getElementsByName("rePassword")[0];
            var email = document.getElementsByName("email")[0];
            var imageCode = document.getElementsByName("imageCode")[0];
            if(username.value.length<1){
                alert("所输入的用户名不能为空");
                return false;
            }
            if(password.value.length<1){
                alert("所输入的密码不能为空");
                return false;
            }
            if(password.value.equal(rePassword.value)){
                alert("两次输入的密码不一致");
                return false;
            }
            if(email.value.length<1){
                alert("所输入的邮箱不能为空");
                return false;
            }
            if(imageCode.value.length<1){
                alert("所输入的验证码不能为空");
                return false;
            }
            return true;
        }
	</script>
</head>
<body>
<div id="fh5co-page">
	<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
	<aside id="fh5co-aside" role="complementary" class="border js-fullheight">

		<h1 id="fh5co-logo"><a href="${pageContext.request.contextPath}/index.jsp">VtmerBlog</a></h1>
		<nav id="fh5co-main-menu" role="navigation">
			<ul>
				<ul>
					<li><a href="${pageContext.request.contextPath}/orderLogin.jsp">用户登陆</a></li>
					<li><a href="${pageContext.request.contextPath}/register.jsp">注册</a></li>
				</ul>
			</ul>
		</nav>
	</aside>

	<div id="fh5co-main">
		<div class="fh5co-narrow-content animate-box" data-animate-effect="fadeInLeft">

			<div class="row">
				<div class="col-md-4">
					<h2>用户注册</h2>
				</div>
			</div>
			<form method="post" action="${pageContext.request.contextPath}/user/register" onsubmit="return vaildate();">
				<div class="row">
					<div class="col-md-12">
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<input type="text" class="form-control" placeholder="Username" name="username">
								</div>
								<div class="form-group">
									<input type="password" class="form-control" placeholder="Password" name="password">
								</div>
								<div class="form-group">
									<input type="password" class="form-control" placeholder="RePassword" name="rePassword">
								</div>
								<div class="form-group">
									<input type="text" class="form-control" placeholder="Email" name="email">
								</div>
								<div class="form-group">
									<input type="text" class="form-control" placeholder="Code" name="imageCode"><img src="user/login/code"><br>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<input type="submit" class="btn btn-primary btn-md" value="提交">
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
		<div id="map"></div>
	</div>
</div>

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!-- jQuery Easing -->
<script src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="${pageContext.request.contextPath}/js/jquery.waypoints.min.js"></script>
<!-- Flexslider -->
<script src="${pageContext.request.contextPath}/js/jquery.flexslider-min.js"></script>
<!-- MAIN JS -->
<script src="${pageContext.request.contextPath}/js/main.js"></script>

</body>
</html>
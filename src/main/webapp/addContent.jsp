<%@ page pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

</head>
<body>
<div id="fh5co-page">
	<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
	<aside id="fh5co-aside" role="complementary" class="border js-fullheight">

		<h1 id="fh5co-logo"><a href="${pageContext.request.contextPath}/index.jsp">VtmerBlog</a></h1>
		<nav id="fh5co-main-menu" role="navigation">
			<ul>
				<ul>
					<li><a href="${pageContext.request.contextPath}/login/getAll?currentPage=1&pageSize=4">个人中心</a></li>
					<li><a href="${pageContext.request.contextPath}/content/getAll?currentPage=1&pageSize=8">博客中心</a></li>
					<li><a href="${pageContext.request.contextPath}/content/getUserAll?currentPage=1&pageSize=8">
						<c:if test="${sessionScope.User.roleId == 1}">
							我的博客
						</c:if>
						<c:if test="${sessionScope.User.roleId == 2}">
							博文管理
						</c:if>
					</a></li>
					<li><a href="${pageContext.request.contextPath}/user/logout">退出</a></li>
				</ul>
			</ul>
		</nav>
	</aside>

	<div id="fh5co-main">
		<div class="fh5co-narrow-content animate-box" data-animate-effect="fadeInLeft">

			<div class="row">
				<div class="col-md-4">
					<h2>添加博文</h2>
				</div>
			</div>
			<form action="${pageContext.request.contextPath}/content/insert">
				<div class="row">
					<div class="col-md-12">
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<input type="text" class="form-control" name="title" placeholder="博文标题">
								</div>
								<div class="form-group">
									<textarea name="description" id="message" cols="30" rows="7" class="form-control" placeholder="博文描述"></textarea>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<select name="contentType" class="lead" >
										<option value="1" selected>生活</option>
										<option value="2">娱乐</option>
										<option value="3">工作</option>
										<option value="4">兴趣</option>
										<option value="5">技术</option>
									</select>
								</div>
								<div class="form-group">
									<input type="submit" class="btn btn-primary btn-md" value="提交">
								</div>
							</div>
							<div class="form-group">
								<textarea name="contentData" id="message1" cols="25" rows="10" class="form-control" placeholder="博文内容"></textarea>
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


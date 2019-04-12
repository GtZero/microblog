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
		</nav>
	</aside>

	<div id="fh5co-main">
		<div class="fh5co-narrow-content">
			<h2 class="fh5co-heading animate-box" data-animate-effect="fadeInLeft">Read Our Blog</h2>
			<div class="row row-bottom-padded-md">
				<c:forEach items="${requestScope.pageBean.list}" var="item">
					<div class="col-md-3 col-sm-6 col-padding animate-box" data-animate-effect="fadeInLeft">
						<div class="Blog-entry">
							<a href="${pageContext.request.contextPath}/content/getOne?contentId=${item.contentId}&currentPage=${requestScope.pageBean.currentPage}&flag=1" class="Blog-img"><img src="${pageContext.request.contextPath}/images/1.jpg" class="img-responsive" alt="Free HTML5 Bootstrap Template by sc.chinaz.com"></a>
							<div class="desc">
								<h3><a href="#">${item.contentTitle}</a></h3>
								<span><small>by ${item.contentUserName} </small> / <small> ${item.flag} </small> /<small><
									<c:if test="${item.contentTypeId == 1}"> <%= "生活"%></c:if>
									<c:if test="${item.contentTypeId == 2}"> <%= "娱乐"%></c:if>
									<c:if test="${item.contentTypeId == 3}"> <%= "工作"%></c:if>
									<c:if test="${item.contentTypeId == 4}"> <%= "兴趣"%></c:if>
                                    <c:if test="${item.contentTypeId == 5}"> <%= "技术"%></c:if>
								></small></span>
								<p>${item.description}</p>
								<a href="${pageContext.request.contextPath}/content/getOne?contentId=${item.contentId}&currentPage=${requestScope.pageBean.currentPage}&flag=1" class="lead">Read More </a>
							</div>
						</div>
					</div>
					</c:forEach>
			</div>
		</div>
			<c:if test="${requestScope.pageBean.totalPage >= 5}">
				<c:forEach begin="${requestScope.pageBean.currentPage-1}" end="${requestScope.pageBean.currentPage+3}" var="i">
					<a href="${pageContext.request.contextPath}/content/getAll?currentPage=${i}&pageSize=8">${i}</a>&nbsp;&nbsp;
				</c:forEach>
				总页数&nbsp;${requestScope.pageBean.totalPage}&nbsp;&nbsp;总条数&nbsp;${requestScope.pageBean.totalCount}
			</c:if>
			<c:if test="${requestScope.pageBean.totalPage < 5  &&  requestScope.pageBean.totalPage > 0 }">
				<c:forEach begin="1" end="${requestScope.pageBean.totalPage}" var="i">
					<a href="${pageContext.request.contextPath}/content/getAll?currentPage=${i}&pageSize=8">${i}</a>&nbsp;&nbsp;
				</c:forEach>
				总页数&nbsp;${requestScope.pageBean.totalPage}&nbsp;&nbsp;总条数&nbsp;${requestScope.pageBean.totalCount}
			</c:if>
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


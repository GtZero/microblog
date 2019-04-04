<%--
  Created by IntelliJ IDEA.
  User: pl
  Date: 2019/4/2
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>VTMER博客</title>
</head>
<body>
Vtmer 博客系统
<form method="post" action="user/login">
    用户名 <input type="text" name="username" /><br>
    密码   <input type="password" name="password" /><br>
    验证码 <input type="text" name="imageCode"><img src="user/login/code"><br>
    <input type="submit" name="登录">
</form>
</body>
</html>

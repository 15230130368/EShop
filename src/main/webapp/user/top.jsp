<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/27
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>top</title>
</head>
<body>
<center><h1>欢迎来到用户信息系统</h1></center><br/>
<span style="float: right"><a href="/selUserByUserNum?userNum=${user.userNum}" target="content">欢迎${user.type}:${user.username}</a></span>
</body>
</html>

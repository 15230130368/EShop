<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/26
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>
    <style type="text/css" rel="stylesheet">
        fieldset{padding:.35em .625em .75em;margin:0 2px;border:1px solid silver}
        legend{padding:.5em;border:0;width:auto}
    </style>
</head>
<body>
<fieldset  style="margin-top: 10%">
    <legend>登录</legend>
    <center>
        <form action="/login" method="post">
            用户名：<input type="text" name="username"><br/>
            密　码：<input type="password" name="password"><br/>
            <input type="submit" class="btn-info" value="登录">
        </form>
    </center>
</fieldset>
</body>
</html>

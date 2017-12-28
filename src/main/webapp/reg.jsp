<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/26
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>
    <style type="text/css" rel="stylesheet">
        fieldset{padding:.35em .625em .75em;margin:0 2px;border:1px solid silver}
        legend{padding:.5em;border:0;width:auto}
    </style>
</head>
<body>
    <fieldset>
        <legend>注册</legend>
        <center>
            <form class="form" action="/reg" method="post">
                用户名：<input type="text" name="username"><br/>
                密　码：<input type="password" name="password"><br/>
                身份证：<input type="number" name="personID"><br/>
                真实姓名：<input type="text" name="realName"><br/>
                生　日：<input type="date" name="birth"><br/>
                邮　箱：<input type="text" name="email"><br/>
                手机号：<input type="number" name="telephone"><br/>
                <input type="submit" class="btn-info" value="注册">
            </form>
        </center>
    </fieldset>
</body>
</html>

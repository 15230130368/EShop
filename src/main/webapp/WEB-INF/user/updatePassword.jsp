<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/28
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改用户密码</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="/jQuery/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        $(function () {

        });
    </script>
</head>
<body>
    <center>
        <form action="/updatePassword" method="post">
            <input type="text" value="${user.userNum}" name="userNum" style="display: none">
            请输入旧密码：<input type="password" name="password"><br/>
            请输入新密码：<input type="password" name="newPassword"><br/>
            再输入新密码：<input type="password" name="passwordAgain"><br/>
            <input type="submit" value="修改">
        </form>
        ${message}
    </center>
</body>
</html>

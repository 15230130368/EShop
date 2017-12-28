<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/27
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="../bootstrap/js/bootstrap.js"></script>
</head>
<body>
    <ul>
        <li><a href="/selUserByUserNum?userNum=${user.userNum}" target="content">查看个人信息</a></li>
        <li><a href="/selAllProvince" target="content">添加收货地址</a></li>
        <li><a href="/updatePassword" target="content">修改密码</a></li>
        <li><a href="/addBankCard" target="content">添加银行卡</a></li>
        <li><a href="/selAllCardByUserNum?userNum=${user.userNum}" target="content">查看所有银行卡信息</a></li>
        <li><a href="/logout" target="_parent">退出登录</a></li>
    </ul>
</body>
</html>

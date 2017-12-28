<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/28
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加银行卡</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="/jQuery/jquery-3.2.1.js"></script>
</head>
<body>
    <center>
        <form action="/addBankCard" method="post">
            <input type="text" name="userNum" value="${user.userNum}" style="display: none">
            银行名称：<input type="text" name="bankName"><br/>
            开户行：<input type="text" name="opening_bank"><br/>
            银行卡号：<input type="number" name="cardNum"><br/>
            <input type="submit" class="btn-info" value="绑定">
        </form>
        ${message}
    </center>
</body>
</html>

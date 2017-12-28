<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/27
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="/jQuery/jquery-3.2.1.js"></script>
    <style type="text/css" rel="stylesheet">
        .table th, .table td {

            text-align: center;

            height:38px;

        }
        input{
            margin-left: 50px;
            width: auto;
        }
    </style>

</head>
<body>
    <table class="table">
        <tr>
            <td>银行名称</td>
            <td>开户行</td>
            <td>银行卡号</td>
            <td>绑定时间</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${bankCards}" var="bankCard">
            <tr>
                <td>${bankCard.bankName}</td>
                <td>${bankCard.opening_bank}</td>
                <td>${bankCard.cardNum}</td>
                <td>${bankCard.regTime}</td>
                <td><a href="/delBankCard?cardNum=${bankCard.cardNum}">解绑</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>

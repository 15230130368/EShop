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
    </style>
</head>
<body>
    <table class="table table-condensed table-bordered">
    <tr>
        <td>会员编码</td>
        <td>${user.userNum}</td>
    </tr>
    <tr>
        <td>用户名</td>
        <td>${user.username}</td>
    </tr>
    <tr>
        <td>密码</td>
        <td>${user.password}</td>
    </tr>
    <tr>
        <td>会员类型</td>
        <td>${user.type}</td>
    </tr>
    <tr>
        <td>身份证号码</td>
        <td>${user.personID}</td>
    </tr>
    <tr>
        <td>生日</td>
        <td>${user.birth}</td>
    </tr>
    <tr>
        <td>真实姓名</td>
        <td>${user.realName}</td>
    </tr>
    <tr>
        <td>积分数量</td>
        <td>${user.integral}</td>
    </tr>
    <tr>
        <td>余额</td>
        <td>${user.balance}</td>
    </tr>
    <tr>
        <td>邮箱</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>主收货地址id</td>
        <td>${user.main_address_id}</td>
    </tr>
    <tr>
        <td>总消费金额</td>
        <td>${user.consume}</td>
    </tr>
    <tr>
        <td>注册时间</td>
        <td>${user.regTime}</td>
    </tr>
    </table>
</body>
</html>

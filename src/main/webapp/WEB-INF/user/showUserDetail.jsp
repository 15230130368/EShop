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
            border-color:#fff;
            box-shadow:inset 1px 0px 0px rgba(0,0,0,0.075);
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#${user.main_address_id}").attr("selected",true);
        });
    </script>
</head>
<body>
    <center>
        <form action="/updateUser" method="post">
            <table class="table" border="0">
                <tr>
                    <td>会员编码:</td>
                    <td><input type="text" name="userNum" value="${user.userNum}" readonly></td>
                </tr>
                <tr>
                    <td>用户名:</td>
                    <td> <input type="text" name="username" value="${user.username}" readonly></td>
                </tr>
                <tr>
                    <td>会员类型:</td>
                    <td><input type="text" name="type" value="${user.type}" readonly></td>
                </tr>
                <tr>
                    <td>身份证号码:</td>
                    <td><input type="text" name="personID" value="${user.personID}" readonly></td>
                </tr>
                <tr>
                    <td>生日:</td>
                    <td><input type="date" name="birth" value="${user.birth}"></td>
                </tr>
                <tr>
                    <td>真实姓名:</td>
                    <td><input type="text" name="realName" value="${user.realName}" readonly></td>
                </tr>
                <tr>
                    <td>积分数量:</td>
                    <td><input type="number" name="integral" value="${user.integral}" readonly></td>
                </tr>
                <tr>
                    <td>余额:</td>
                    <td><input type="number" name="balance" value="${user.balance}" readonly></td>
                </tr>
                <tr>
                    <td> 邮箱：</td>
                    <td><input type="text" name="email" value="${user.email}"></td>
                </tr>
                <tr>
                    <td>主收货地址：</td>
                    <td><select name="main_address_id">
                        <c:forEach items="${addresses}" var="address">
                            <option id="${address.id}" value="${address.id}">${address}</option>
                        </c:forEach>
                    </select></td>
                </tr>
                <tr>
                    <td>总消费金额:</td>
                    <td><input type="number" name="consume" value="${user.consume}" readonly></td>
                </tr>
                <tr>
                    <td>注册时间:</td>
                    <td><input type="text" name="regTime" value="${user.regTime}" readonly></td>
                </tr>
            </table>
            <input type="text" name="password" value="${user.password}" style="display: none">
            <input type="submit" class="btn-info" value="修改">
        </form>
    </center>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/27
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看所有用户信息</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="/jQuery/jquery-3.2.1.js"></script>
    <style type="text/css" rel="stylesheet">
        body a{
            margin-left: 20px;
        }
        .table th, .table td {

            text-align: center;

            height:38px;

        }
    </style>
    <script type="text/javascript">
        $(function(){
            $("#inp").change(function (e) {
                window.location="/selUserByUsername?username="+$("#inp").val().trim();
            });
            $("#btn").click(function (e) {

                $num = $("#ipt").val();

                if ($num!=""){
                    window.location="/selAllUser?pageNum="+$num;
                }else {
                    alert("请输入要跳转的页面数");
                }
            });
        });
        function search() {
            window.location="/selUserByUsername?username="+$("#inp").val().trim();
        }
    </script>
</head>
<body>
    <center>
        <b style="font-size: larger;font-style: oblique;">请输入要查的姓名：</b><input type="text" id="inp" style="margin-top: 20px"/><input type="button" class="btn-info" onclick="search()" value="查找">
    </center><br/><br/>
    <table class="table table-condensed table-bordered">
        <thead>
        <tr>
            <td >会员编号</td>
            <td>用户名</td>
            <td>密码</td>
            <td colspan="2">操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.userNum}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td><a href="/manager_selUserByUserNum?userNum=${user.userNum}">详细信息</a></td>
                <td><c:if test="${!user.type.equals('管理员')}">
                    <a href="/updateUserToManager?userNum=${user.userNum}">设置为管理员</a>
                </c:if></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <center>${message}</center>
    <div style="position: absolute;bottom: 20px; width: 100%">
        <center>
            <a href="/selAllUser?pageNum=1">首页</a>
            <a href="/selAllUser?pageNum=${pageNum-1}">上一页</a>
            <a href="/selAllUser?pageNum=${pageNum+1}">下一页</a>
            <a href="/selAllUser?pageNum=${pageCount}">末页</a>
            <span style="margin-left: 20px;color: #149bdf;">跳转到第<input id="ipt" style="width: 50px" type="number" name="pageNum">页&nbsp;&nbsp;<input id="btn" class="btn-info" type="button" value="跳转"></span>
            <span style="margin-left: 20px;color: #149bdf;">第${pageNum}页/共${pageCount}页</span>
        </center>

    </div>
</body>
</html>

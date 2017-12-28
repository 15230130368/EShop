<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/28
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="/jQuery/jquery-3.2.1.js"></script>
    <script type="text/javascript">
        function  sel(val) {
            $.ajax({
                url:"/selAllCityByPid",
                type:"post",
                data:{"pid":val},
                success:function (data) {
                    var arr = eval(data);
                    $("#city").empty();
                    $("#city").append("<option disabled=\"disabled\" selected=\"selected\">---请选择市区---</option>");
                    for(var i=0;i<arr.length;i++){
                        $("#city").append($("<option value="+arr[i].cid+">"+arr[i].cname+"</option>"));
                    }
                },
                error:function (res) {
                    alert("error");
                }
            });
        }
    </script>
</head>
<body>
    <center>
        <form action="/addAddress" method="post">
            <input type="text" name="userNum" value="${user.userNum}" style="display: none">
            请选择省份：<br/>
            <select name="province.pid" onchange="sel(this.value)">
                <option selected="selected" disabled="disabled">---请选择省份---</option>
                <c:forEach items="${provinces}" var="province">
                    <option value="${province.pid}">${province.pname}</option>
                </c:forEach>
            </select><br/>
            请选择市区：<br/>
            <select id="city" name="city.cid">
                <option disabled="disabled" selected="selected">---请选择市区---</option>
            </select><br/>
            请输入详细地址：<br/>
            <input type="text" name="detail"><br/>
            <input type="submit" value="保存">
        </form>
        <center>${message}</center>
    </center>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: zkx
  Date: 2017/12/26
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息系统</title>
</head>
<frameset rows="20%,*" frameborder="no">
    <frame name="top" src="/user/top.jsp">
    <frameset cols="20%,80%" frameborder="no">
        <frame noresize="noresize" name="left" src="/user/left.jsp">
        <frame name="content" src="/user/content.jsp">
    </frameset>
</frameset>
</html>

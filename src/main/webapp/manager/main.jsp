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
    <title>管理系统</title>
</head>
<frameset rows="20%,*" frameborder="no">
    <frame name="top" src="/manager/top.jsp">
    <frameset cols="20%,80%" frameborder="no">
        <frame noresize="noresize" name="left" src="/manager/left.jsp">
        <frame name="content" src="/manager/content.jsp">
    </frameset>
</frameset>
</html>

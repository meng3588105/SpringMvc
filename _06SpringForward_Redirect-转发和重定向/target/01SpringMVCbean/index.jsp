<%--
  Created by IntelliJ IDEA.
  User: 吉祥龙龙
  Date: 2018/5/31
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
<%--01.第一种方式 使用注解--%>
    <a href="/user/add">新增</a>
    <a href="/user/update">修改</a>
    <a href="/user/delete">删除</a>
    <a href="/user/find">查询</a><br/>

<%--02.验证后台不返回ModelAndView--%>
    <a href="model/add">新增</a>
    <a href="model/update">修改</a>
    <a href="model/delete">删除</a>
    <a href="model/find">查询</a>


<%-- 03.前端传递参数--%>
<form action="params/haha" method="post">
    用户名：<input name="userName">
    密码：<input type="password" name="password">
        <input type="submit" value="注册">
</form>



</body>
</html>

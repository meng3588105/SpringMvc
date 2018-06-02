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
    <form action="user/add" method="post" enctype="multipart/form-data">
        <%--单文件上传--%>
        <%--<input type="file" name="file">--%>
            <%--多文件上传--%>
            <input type="file" name="files">
            <input type="file" name="files">
            <input type="file" name="files">

        <button type="submit">文件上传</button>

    </form>


</body>
</html>

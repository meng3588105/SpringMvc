<%--
  Created by IntelliJ IDEA.
  User: 吉祥龙龙
  Date: 2018/5/31
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>studentSuccess</title>
</head>
<body>

    学生姓名：${userName}
    学生年龄：${age}
<hr/>
    学生姓名：${student.name}
    学生年龄：${student.age}
    teacher姓名：${student.teacher.name}
    teacher年龄：${student.teacher.age}<br/>

</body>
</html>

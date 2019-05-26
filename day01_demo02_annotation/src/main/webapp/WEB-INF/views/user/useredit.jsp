<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/update" method="post">
    用户名:<input type="text" name="username" value="${user.username}"><br>
    密码:<input type="text" name="password" value="${user.password}"><br>
    性别:<input type="text" name="gender" value="${user.gender}"><br>
    生日:<input type="text" name="birthday" value="${user.birthday}"><br>
        <input type="submit">
</form>
</body>
</html>
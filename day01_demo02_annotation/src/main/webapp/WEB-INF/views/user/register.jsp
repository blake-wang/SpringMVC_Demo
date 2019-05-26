<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
接收参数：方法参数类型
<form action="${pageContext.request.contextPath}/register1" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    性别:<input type="text" name="gender"><br>
    年龄:<input type="text" name="age"><br>
    生日:<input type="text" name="birthday"><br>
    爱好:<input type="checkbox" name="hobbyIds" value="1">打球
        <input type="checkbox" name="hobbyIds" value="2">打人
        <input type="checkbox" name="hobbyIds" value="3">打假
        <input type="checkbox" name="hobbyIds" value="4">打车<br>
        <input type="submit">
</form>

接收参数：包装类型
<form action="${pageContext.request.contextPath}/register2" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    性别:<input type="text" name="gender"><br>
    年龄:<input type="text" name="age"><br>
    生日:<input type="text" name="birthday"><br>
    爱好:<input type="checkbox" name="hobbyIds" value="1">打球
        <input type="checkbox" name="hobbyIds" value="2">打人
        <input type="checkbox" name="hobbyIds" value="3">打假
        <input type="checkbox" name="hobbyIds" value="4">打车<br>
        <input type="submit">
</form>

接收参数：扩展包装类型
<form action="${pageContext.request.contextPath}/register3" method="post">
    用户名:<input type="text" name="user.username"><br>
    密码:<input type="text" name="user.password"><br>
    性别:<input type="text" name="user.gender"><br>
    年龄:<input type="text" name="user.age"><br>
    生日:<input type="text" name="user.birthday"><br>
    爱好:<input type="checkbox" name="user.hobbyIds" value="1">打球
        <input type="checkbox" name="user.hobbyIds" value="2">打人
        <input type="checkbox" name="user.hobbyIds" value="3">打假
        <input type="checkbox" name="user.hobbyIds" value="4">打车<br>
        <input type="submit">
</form>

接收参数：集合参数类型
<form action="${pageContext.request.contextPath}/register4" method="post">
    用户名:<input type="text" name="userList[0].username"><br>
    密码:<input type="text" name="userList[0].password"><br>
    <hr>
    用户名2:<input type="text" name="userList[1].username"><br>
    密码2:<input type="text" name="userList[1].password"><br>
        <input type="submit" value="保存">
</form>

接收参数：表单数据使用map来接收
<form action="${pageContext.request.contextPath}/register5" method="post">
    用户名:<input type="text" name="userMap['username']"><br>
    密码:<input type="text" name="userMap['password']"><br>
    性别:<input type="text" name="userMap['gender']"><br>
    年龄:<input type="text" name="userMap['age']"><br>
    生日:<input type="text" name="userMap['birthday']"><br>
        <input type="submit">
</form>


</body>
</html>
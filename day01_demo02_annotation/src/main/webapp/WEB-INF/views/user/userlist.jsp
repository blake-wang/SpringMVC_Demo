<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
用户列表
<table border="1">
    <tr>
        <td>名字</td>
        <td>年龄</td>
        <td>性别</td>
        <td>生日</td>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.username}</td>
                <td>${user.age}</td>
                <td>${user.gender}</td>
                <td>${user.birthday}</td>
                <td>
                <a href="${pageContext.request.contextPath}/edit?id=${user.id}" >修改</a>
                &nbsp;<a href="${pageContext.request.contextPath}/edit1/${user.id}" >修改</a>
                </td>
            </tr>
        </c:forEach>
    </tr>
</table>
</body>
</html>
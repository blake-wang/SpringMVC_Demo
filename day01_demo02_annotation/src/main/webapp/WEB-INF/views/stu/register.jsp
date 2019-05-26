<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <script>
        function register(){
          //请求的URL
          var url = '${pageContext.request.contextPath}/stu/save';

          //{"name":"aixu","sex":"women"}
          var name=$('#name').val();
          var sex=$('#sex').val();
          var jsonObj={name:name,sex:sex}

          //把json对象转换成字符串
          var parameters= JSON.stringify(jsonObj)

          console.log(jsonObj);
          console.log(parameters);

          $.ajax({
            type:'post',
            url:url,
            contentType:'application/json;charset=utf-8',
            data:parameters,
            success:function(respData){
                console.log(respData);
            }
          });
        }
    </script>
</head>
<body>
<%-- 请求头 application/x-www-form-urlencoded 数据格式 【name=aixu&sex=women】
     请求头 application/json 数据格式  {"name":"aixu","sex":"women"}  }--%>
<form action="${pageContext.request.contextPath}/stu/save" method="post">
    学生名字:<input id="name" type="text" name="name"><br>
    性别:<input id="sex" type="text" name="sex"><br>
    <input type="button" value="提交Json格式数据" onclick="register();">
    <input type="submit">
</form>
</body>
</html>
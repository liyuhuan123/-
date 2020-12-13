Þ<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/2
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    <link href = "static/css/app.css" rel="stylesheet">

<%--    <script type="text/javascript" src="static/jquery/jquery-1.12.4.min.js">--%>
<%--    <scipt type = "test/javascript">--%>
<%--        $(document).ready(function() {--%>
<%--                $.ajax({--%>
<%--                    url: "login",//请求的路径--%>
<%--                    type: "application/json",//请求的方法--%>
<%--                    contentType: "application/json",--%>
<%--                    data: {username: "abc", password: "123"},//请求的数据--%>
<%--                    dataType: "json",//响应的数据格式--%>
<%--                    success: function (data) {//返回的状态码是200时，调用这个函数--%>
<%--                    }--%>
<%--                });--%>
<%--                $("#btn").click(function () {--%>
<%--                    alert("点击按钮");--%>
<%--                });--%>
<%--            });--%>
<%--    </scipt>--%>
</head>
<body>
    <!--假如，提交到后台的url是http：//localhost:8080/blog/login-->
    <!--现在访问到的是http://localhost:8080/blog/jsp/login,是以当前页面作为相对路径，加上请求路径-->
    <!--action为/login，访问到的是http://localhost:8080/login-->
    <!--配置jsp变量，及base标签，可以解决路径问题：action为login ,访问就是正确的路径-->
    <form action = "/login">
        <input type = "test" name = "username" placeholder = "请输入用户名">
        <input type = "password" name = "password" placeholder = "请输入密码">
        <input type = "submit" value = "提交">
    </form>
    <input id = "btn" type = "button" value = "点击观看事件">
</body>
</html>

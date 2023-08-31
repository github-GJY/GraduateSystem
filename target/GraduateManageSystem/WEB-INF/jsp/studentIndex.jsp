<%--
  Created by IntelliJ IDEA.
  User: liuhu
  Date: 2023/8/4
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>学生信息</title>
    <link rel="shortcut icon" href="image/page_favicon.ico" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/index.js">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body >
<div class="header">
    <a class="logo">
        <h1>毕业生学生系统</h1>
    </a>
    <nav class="navbar">
        <ul>
            <li><a id="loginbtn">登录</a></li>
            <li><a id="modify_password">修改密码</a></li>
            <li><a id="log_out" href="remove/log_out">退出系统</a></li>
        </ul>
    </nav>
</div>

<!-- 二级菜单 -->
<nav class="pagenav">
    <div class="background">
        <div class="box">
            <!-- < img src="img/icon.png" > -->
            <ul class="pagenav_ul" id="navUl">
                <li>
                    <a>毕业生基本信息维护</a >
                    <ul class="submenu  show">
                        <li><a id="query1">基本信息查询</a></li>
                        <li><a id="modify1">基本信息修改</a></li>
                    </ul>
                </li>
                <li>
                    <a href="">毕业生就业信息维护</a >
                    <ul class="submenu">
                        <li><a id="query2">就业信息查询</a ></li>
                        <li><a id="modify2">修改就业信息</a ></li>

                    </ul>
                </li>


                <li>
                    <a href="">专业划分就业情况统计</a >
                    <ul class="submenu ">
                        <li><a id="chart">统计图</a ></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<!-- 二级菜单 end-->
<script src="${pageContext.request.contextPath}/js/index.js"></script>
<div class="mm" >
    <iframe id="forward" src="" frameborder="0" marginwidth="0" marginheight="0"
            scrolling="no" style=" margin-left:240px;margin-top:-90px;width:1500px;height: 1010px;"width="168" height="50" scrolling="no"
            allowtransparency="true"></iframe>
</div>
<div class="overlay" id="overlay"></div>
<div class="popup" id="popup">
    <form action="modify/password" method="get">
        <h1>修改密码</h1>
        <table width="400px">
            <tr>
                <td><label>旧密码：</label></td>
                <td><input type="text" value="" placeholder="旧密码" name="password" required /></td>
            </tr>
            <tr>
                <td><label>新密码：</label></td>
                <td><input type="text" value="" placeholder="新密码" name="newPwd" id="name" required/></td>
            </tr>
        </table>
       <br><br>
        <!--    <button id="closebtn()">关闭</button>-->
        <button type="submit">提交</button>
        <div class="wenzi1">点击空白处返回</div>
    </form>
</div>

<script src="${pageContext.request.contextPath}/js/studentIndex.js"></script>
</body>
</html>

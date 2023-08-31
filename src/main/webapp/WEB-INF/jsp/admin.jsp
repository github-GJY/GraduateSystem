<%--
  Created by IntelliJ IDEA.
  User: liuhu
  Date: 2023/8/2
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>毕业生信息</title>
    <link rel="shortcut icon" href="image/page_favicon.ico" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/index.js">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
<div class="header">
    <a href="index.html" class="logo">
        <h1>毕业生管理系统</h1>
    </a>
    <nav class="navbar">
        <ul>
            <li><a id="admin_login" style="display: none">登录</a></li>
            <li><a id="admin_log_out" href="remove/admin_log_out">退出系统</a></li>
        </ul>
    </nav>
</div>

<!-- 二级菜单 -->
<nav class="pagenav">
    <div class="background">
        <div class="box">
            <!-- <img src="img/icon.png" > -->
            <ul class="pagenav_ul" id="navUl">
                <li>
                    <a >毕业生基本信息维护</a>
                    <ul class="submenu  show">
                        <li><a id="add_modify">添加修改毕业生信息</a></li>
                        <li><a id="queryall">查询毕业生信息</a></li>
                    </ul>
                </li>
                <li>
                    <a href="">毕业生就业信息维护</a>
                    <ul class="submenu">
                        <li><a id="admin_add_employ">添加修改就业信息</a></li>
                        <li><a id="admin_query_employ">查询就业信息</a></li>
                    </ul>
                </li>
                <li>
                    <a href="">毕业生就业查询</a>
                    <ul class="submenu">
                        <li><a id="isEmploy">已经就业</a></li>
                        <li><a id="noEmploy">没有就业</a></li>
                    </ul>
                </li>
                <li>
                    <a>专业划分就业情况统计</a>
                    <ul class="submenu ">
                        <li><a id="chartProfessional">专业统计图</a></li>
                    </ul>
                </li>
                <li>
                    <a>用户管理</a>
                    <ul class="submenu">
                        <li><a id="forwarduser">学生管理</a></li>
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
            scrolling="no" style="background-color: aquamarine; margin-left:240px;margin-top:-90px;width:1500px;height: 1010px;"width="168" height="50" scrolling="no"
            allowtransparency="true"></iframe>
</div>
<script src="${pageContext.request.contextPath}/js/jQuery-3.7.0.js" type="text/javascript"></script>
<script>
    window.onload = function () {
        var login = document.getElementById("admin_login")
        login.onclick = function () {
            window.open('http://localhost:8080/GraduateManageSystem/login')
        }
        document.getElementById("admin_log_out").onclick = function () {
            login.style.display = "block";
        }

        //跳转添加就业信息
        document.getElementById("admin_add_employ").onclick = function () {
            document.getElementById("forward").setAttribute("src","forward/admin_add_employ")
        }
        //跳转查询就业信息
        document.getElementById("admin_query_employ").onclick = function () {
            document.getElementById("forward").setAttribute("src","forward/admin_find_employ")
        }

        //跳转查询
        document.getElementById("queryall").onclick = function(){
            document.getElementById("forward").setAttribute("src","forward/all");
        }

        //跳转用户管理
        document.getElementById("forwarduser").onclick = function(){
            document.getElementById("forward").setAttribute("src","forward/user");
        }

        //跳转添加修改
        document.getElementById("add_modify").onclick = function () {
            document.getElementById("forward").setAttribute("src","forward/adminupdateBase");
        }

        //跳转查询已经就业
        document.getElementById("isEmploy").onclick = function () {
            document.getElementById("forward").setAttribute("src","forward/selectIsEmploy");
        }

        //跳转查询未就业
        document.getElementById("noEmploy").onclick = function () {
            document.getElementById("forward").setAttribute("src","forward/noEmployInf");
        }

        //跳转统计图
        document.getElementById("chartProfessional").onclick = function () {
            document.getElementById("forward").setAttribute("src","forward/chartcount")
        }

    }
</script>
</body>
</html>

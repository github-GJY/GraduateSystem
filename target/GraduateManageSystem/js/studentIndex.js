window.onload = function(){
    //点击退出按钮把id移除
    var btn = document.getElementById("loginbtn");
    btn.onclick = function () {
        window.open('http://localhost:8080/GraduateManageSystem/login');
    }
    document.getElementById("log_out").onclick = function () {
        btn.style.display = "block";
    }
    const popup=document.getElementById('popup');
    const overlay=document.getElementById('overlay');
    document.getElementById("overlay").onclick = function () {
        overlay.style.display = "none";
        popup.style.display = "none";
    }

    const modify = document.getElementById("modify_password");
    modify.addEventListener("click",function () {
        console.log("111");
        popup.style.display='block';
        overlay.style.display='block';
    })
    //默认跳转信息查询页面
    document.getElementById("forward").setAttribute("src","forward/studentInf");
    /* 查询基本信息 */
    document.getElementById("query1").onclick = function(){
        document.getElementById("forward").setAttribute("src","forward/studentInf");
    }
    // 基本信息修改
    document.getElementById("modify1").onclick = function(){
        document.getElementById("forward").setAttribute("src","forward/add_modify");
    }
    // 就业信息查询
    document.getElementById("query2").onclick = function(){
        document.getElementById("forward").setAttribute("src","forward/own_employ/");
    }
    // 修改就业信息
    document.getElementById("modify2").onclick = function(){
        document.getElementById("forward").setAttribute("src","forward/modifyEmploy_student");
    }
    // 统计图
    document.getElementById("chart").onclick = function() {
        document.getElementById("forward").setAttribute("src", "forward/chartcount");
    }
}
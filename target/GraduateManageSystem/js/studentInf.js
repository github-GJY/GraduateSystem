window.onload = function () {
    getStudentInf();
}

function getStudentInf(){
    $.ajax({
        url:"../select/studentInf",
        dataType:"json",
        success:function (studentInf) {
            console.log(studentInf.graduateTime);
            var time = studentInf.graduateTime;
            var date = new Date(time);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
            var Y = date.getFullYear() + '-';
            var M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1):date.getMonth()+1) + '-';
            var D = (date.getDate()< 10 ? '0'+date.getDate():date.getDate())+ ' ';
            $("#graduateID").text(studentInf.graduateID);
            $("#name").text(studentInf.name);
            $("#gender").text(studentInf.gender);
            $("#ethnic").text(studentInf.ethnic);
            $("#place").text(studentInf.place);
            $("#graduatetime").text(Y+M+D);
            $("#professional").text(studentInf.professional);
            $("#status").text(studentInf.status);
        }
    })
}
/*
function getStudentInf(list) {
    $("#graduateID").text(list.graduateID);
    $("#name").text(list.name);
}
*/

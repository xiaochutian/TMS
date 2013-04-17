<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%pageContext.setAttribute("pageTitle", "注册");%>
<%@include file="WEB-INF/jspf/head.jspf"%>
<script>
    function register(){
        var regForm = document.getElementById("regForm");
        var regUsername = document.getElementById("regUsername");
        var regPassword = document.getElementById("regPassword");
        var regEmail = document.getElementById("regEmail");
        var regPhone = document.getElementById("regPhone");
        if (regUsername.value && regPassword.value && regEmail.value && regPhone.value){
            if (regPassword.value.length >= 4){
                //alert("role:" + role);
                regForm.submit();
            }else{
                alert("密码长度必须大于4");
            }
        }else{
            alert("所有字段都必须填上！");
        }
    }
</script>
<div id="mainContent">
    <center>
        <form action="Register" id="regForm">
            <table>
                <tr>
                    <td>用户名</td>
                    <td><input type="text" name="user.username" id="regUsername"/></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password" name="user.password" id="regPassword"/></td>
                </tr>
                <tr>
                    <td>邮箱</td>
                    <td><input type="text" name="user.email" id="regEmail"/></td>
                </tr>
                <tr>
                    <td>电话</td>
                    <td><input type="text" name="user.phone" id="regPhone"/></td>
                </tr>
                <tr>
                    <td>身份</td>
                    <td>
                        <input id="undergraduateCheck" type="radio" checked="true" name="user.role" value="0">本科生
                        <input id="graduateCheck" type="radio" name="user.role" value="1">研究生
                        <input id="techerCheck" type="radio" name="user.role" value="2">教师
                    </td>
                </tr>
            </table>
            <a href="#" class="boxButton" onclick="register()">注册</a>
        </form>
    </center>
</div>
<%@include file="WEB-INF/jspf/foot.jspf"%>

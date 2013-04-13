<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%pageContext.setAttribute("pageTitle", "注册");
    celemari.tms.vo.UserBean user = new celemari.tms.vo.UserBean();
    user.setUsername("asd");
    session.setAttribute("user", user);
%>
<%@include file="WEB-INF/jspf/head.jspf"%>
<script>
    function register(){
        var regForm = document.getElementById("regForm");
        var regUsername = document.getElementById("regUsername");
        var regPassword = document.getElementById("regPassword");
        if (regUsername.value && regPassword.value){
            if (regPassword.value.length >= 4){
                //alert("可以注册");
                regForm.submit();
            }else{
                alert("密码长度必须大于4");
            }
        }else{
            alert("用户名和密码不能为空");
        }
    }
</script>
<div id="mainContent">
    <center>
        <s:form action="register" id="regForm">
            <table>
                <tr>
                    <td><s:textfield name="user.username" label="用户名" id="regUsername"/></td>
                </tr>
                <tr>
                    <td><s:password name="user.password" label="密码" id="regPassword"/></td>
                </tr>
            </table>
            <a href="#" class="boxButton" onclick="register()">注册</a>
        </s:form>
    </center>
</div>
<%@include file="WEB-INF/jspf/foot.jspf"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% pageContext.setAttribute("pageTitle", "注册");%>
<%@include file="WEB-INF/jspf/head.jspf"%>
<div id="mainContent">
    <center>
        <form action="register">
            <table>
                <tr>
                    <td>用户名</td>
                    <td><input name="username" type="text"></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input name="password" type="password"></td>
                </tr>
            </table>
            <br>
            <a href="#" class="boxButton">注册</a>
        </form>
    </center>
</div>
<%@include file="WEB-INF/jspf/foot.jspf"%>

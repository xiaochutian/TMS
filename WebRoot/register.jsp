<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%pageContext.setAttribute("pageTitle", "注册");%>
<%@include file="WEB-INF/jspf/head.jspf"%>
<div id="mainContent">
    <center>
        <s:form action="register">
            <table>
                <tr>
                    <td><s:textfield name="user.username" label="用户名"/></td>
                </tr>
                <tr>
                    <td><s:textfield name="user.password" label="密码"/></td>
                </tr>
            </table>
            <a href="#" class="boxButton">注册</a>
        </s:form>
    </center>
</div>
<%@include file="WEB-INF/jspf/foot.jspf"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% pageContext.setAttribute("pageTitle", "帐号设置");%>
<%@include file="/WEB-INF/jspf/head.jspf" %>
<div id="funcBar">
    <a href="#">asdas</a>
    <a href="#">asdas</a>
    <a href="#">asdas</a>
</div>
<div id="userInfoContent">
    <c:forEach var="job" items="${user.jobs}">

    </c:forEach>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf" %>

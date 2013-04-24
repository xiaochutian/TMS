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
        <a href="${rootPath}/Job?jobId=${job.id}">
            <div class="jobBox">
                <center>
                    <b>${job.title}</b>
                </center>
                <p>
                    ${job.brief}
                </p>
            </div>
        </a>
    </c:forEach>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf" %>

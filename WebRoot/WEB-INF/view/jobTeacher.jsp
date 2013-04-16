<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%pageContext.setAttribute("title", "查看岗位");%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<div id="mainContent">
    <h1>{job.title}</h1>
    <p>{job.brief}</p>
    <a class="boxButton" href="${rootPath}/RemoveJob">删除</a>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>

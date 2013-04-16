<%@page contentType="text/html" pageEncoding="utf-8"%>
<%pageContext.setAttribute("title", "查看岗位");%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<div id="mainContent">
    <h1>{job.title}</h1>
    <p>{job.brief}</p>
    <a class="boxButton" href="${rootPath}/ApplyJob">申请</a>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>

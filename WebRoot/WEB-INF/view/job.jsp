<%@page contentType="text/html" pageEncoding="utf-8" %>
<%pageContext.setAttribute("title", "岗位");%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<%
    java.util.List<Object> list = new java.util.ArrayList<Object>();
    list.add(new Object());
    list.add(new Object());
    list.add(new Object());
    session.setAttribute("jobs", list);
%>
<div id="mainContent">
    <c:forEach var="job" items="${jobs}">
        <a href="#">
            <div class="jobBox">
                ${job.toString()}
            </div>
        </a>
    </c:forEach>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>
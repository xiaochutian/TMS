<%@page contentType="text/html" pageEncoding="utf-8" %>
<%pageContext.setAttribute("pageTitle", "岗位");%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<c:forEach var="job" items="${jobs}">

</c:forEach>
<%@include file="/WEB-INF/jspf/foot.jspf"%>
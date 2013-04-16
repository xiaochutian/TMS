<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%pageContext.setAttribute("title", "查看申请");%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<div id="mainContent">
    <c:forEach var="train" items="${trains}">

    </c:forEach>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>

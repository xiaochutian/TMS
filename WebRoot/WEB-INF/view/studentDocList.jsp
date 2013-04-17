<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<div id="mainContent">
    <c:forEach var="studentDocument" items="${studentDocuments}">
        <%--TODO: 补完参数--%>
        <a href="${rootPath}/StudentDocument?">
            <div class="jobBox">

            </div>
        </a>
    </c:forEach>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%pageContext.setAttribute("title", "查看申请");%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<div id="mainContent">
    <c:forEach var="train" items="${trains}">
        <%-- TODO: 补完参数 --%>
        <%--  upload: string isaccept =accept/reject 
                     string id
        
             download:
                    trains
        
        --%>
        
        <%--<p>${train}</p>--%>
        <a href="${rootPath}/Accept?" class="boxButton">接受</a>
        <a href="${rootPath}/Reject?" class="boxButton">拒绝</a>
    </c:forEach>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>

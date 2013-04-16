<%@page contentType="text/html" pageEncoding="utf-8" %>
<%pageContext.setAttribute("title", "发布岗位");%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<script>
    function submit(){
        var jobTitle = document.getElementById("jobTitle");
        var jobText = document.getElementById("jobText");
        var jobForm = document.getElementById("jobForm");
        if (jobTitle.value && jobText.value){
            jobForm.submit();
        }else{
            alert("岗位标题和简介不能为空");
        }
    }
</script>
<div id="mainContent">
    <s:form id="jobForm" action="PublishJob" method="POST">
        <s:textfield id="jobTitle" name=""/>
        <s:textarea id="jobText" name=""/>
        <a class="boxButton" href="#" onclick="submit()">发布</a>
    </s:form>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>
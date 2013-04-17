<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<script>
    function submit(){
        var gradeForm = document.getElementById("gradeForm");
        var gradeText = document.getElementById("gradeText");
        if (gradeText.value){
            gradeForm.submit();
        }else{
            alert("分数不能为空！");
        }
    }
</script>
<div id="mainContent">
    <%--TODO: 补完参数--%>
    <%--${studentDocument}--%>
    <s:form id="gradeForm" action="Grade" method="POST">
        <s:textfield id="gradeText" name=""/>
        <a href="#" onclick="submit()">评分</a>
    </s:form>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>

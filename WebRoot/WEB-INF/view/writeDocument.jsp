<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/jspf/head.jspf"%>
<script>
    function submit(){
        var docForm = document.getElementById("docForm");
        var docText = document.getElementById("docText");
        if (docText.value){
            docForm.submit();
        }else{
            alert("内容不能为空！");
        }
    }
</script>
<div id="mainContent">
    <s:form id="docForm" action="AddDocument" method="POST">
        <s:textarea id="docText" name=""/>
        <a href="#" onclick="submit()">提交</a>
    </s:form>
</div>
<%@include file="/WEB-INF/jspf/foot.jspf"%>
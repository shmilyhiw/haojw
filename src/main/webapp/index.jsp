<%@ page contentType="text/html; charset=utf-8"%>
<html>



<body>
<h2>修改！~~~~~~~~</h2>
<h2>测试用户自定义敏感信息检测</h2>
<form action="/infoTest" method="get">
    <input type="text" name="username"/></br>
    <input type="password" name="password"/></br>
    <input type="submit" value="提交"/>

</form>




















<%--<h2>测试获取http请求的body数据</h2>--%>

<%--<form action="/httpTest" method="post">--%>
<%--    <input type="text" name="username"/>--%>
<%--    <input type="password" name="password"/>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>



<%--<h2>目录文件</h2>--%>
<%--<form action="/readFile" method="get">--%>
<%--    <input type="text" name="fileName"/>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>

<%--<h2>XSS跨站脚本攻击</h2>--%>
<%--<form action="/xssTest" method="get">--%>
<%--&lt;%&ndash;    <textarea typeof="text" rows="25" cols="50" name="xssCode"></textarea>&ndash;%&gt;--%>
<%--    用户名：<input type="text" name="username"/>--%>
<%--    密&nbsp;&nbsp;码:<input type="password" name="password"/>--%>
<%--    <input type="submit" value="提交" id="demo">--%>
<%--</form>--%>

<%--&lt;%&ndash;测试用例&ndash;%&gt;--%>
<%--<script type="text/javascript" language="javascript">--%>
<%--    alert("cookieValue = " + document.cookie);--%>
<%--</script>--%>


<%--<h2>HTTP响应头截断</h2>--%>

<%--<form action="/httpTest" method="get">--%>
<%--    <textarea typeof="text" rows="25" cols="50" name="data"></textarea>--%>
<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>














</body>
</html>

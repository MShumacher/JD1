<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body><div>hello world</div></body>
<p><%= request.getRemoteHost() %>
<p><%= request.getParameter("title") %>
<p>Текущее время: <%= new java.util.Date() %>
<p><%! private int accessCount=0; %>
<p><%= ++accessCount %>
<p><% String queryData=request.getQueryString(); out.println("данные запроса:"+queryData);%>
<p><%= queryData %>
</html>
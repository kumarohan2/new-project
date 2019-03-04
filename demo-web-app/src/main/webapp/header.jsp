<%@page import="javax.xml.ws.Response"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Http Header(s)</title>
</head>
<body>
<%
 String useragent = request.getHeader("user-agent");
%>

<h1><%= useragent %></h1>
<%
Date d = new Date();
%>
<h2>Today's date is <%=  d %></h2>

<%
//response.setHeader("refresh","1");
//response.setHeader("refresh","5; URL=http://www.google.com");
%>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
%>

</body>
</html>
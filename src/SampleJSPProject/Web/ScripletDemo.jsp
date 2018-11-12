<%@ page language="java" contentType="text/html" import="java.sql.*"%>
<%@include file="CommonPage.jsp" %>


<h3>Declaration Scriplet</h3>

<%!
	Connection conn;
	Statement statment;
%>

<h3>Scriplet</h3>

<%
	java.util.Date today=new java.util.Date();
	out.println("Today:"+today);
%>

<h3>Expression Scriplet</h3>

100+60= <%=(100+60) %>

</body>
</html>
<%@include file="CommonPage.jsp" %>

<h3 align="center"><u>Main Page</u></h3>

<br/><br/><br/><br/>
<a href="FirstServlet"> First Servlet using Servlet Interface</a>
|&nbsp;|&nbsp;|&nbsp;|&nbsp;|&nbsp;
<a href="MyGenericServlet">GenericServlet Demo</a>


<h3>Get Request- Hyperlink</h3>

<a href="MyHttpServlet">Calling Servlet By HyperLink</a>

<h3>Get Request- Form</h3>

<form action="MyHttpServlet" method="get">
	<input type="submit" value="Submit">
</form>

<h3>Post Request- Form</h3>

<form action="MyHttpServlet" method="post">
	<input type="submit" value="Submit">
</form>

</body>
</html>
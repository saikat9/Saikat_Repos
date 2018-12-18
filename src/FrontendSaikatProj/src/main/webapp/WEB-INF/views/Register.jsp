<%@include file="CommonNavbar.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
 table.center 
 {
    margin-left:auto; 
    margin-right:auto;
 }
  body {
    background-color: silver;
}
</style>
</head>
<body>
<h3 align="center">NIIT E-Commerce Registration Page</h3>
<div class="container">
<form:form action="processregistration" modelAttribute="userdetails" method="post">
<table class="center" class="table table-bordered">
<tr>
<td style="text-align: center;">User Name</td>
<td style="text-align: center;"><form:input path="username"/></td>
</tr>
<tr>
<td style="text-align: center;">Password</td>
<td style="text-align: center;"><form:input path="password"/></td>
</tr>
<tr>
<td style="text-align: center;">Enabled</td>
<td style="text-align: center;"><form:input path="enabled"/></td>
</tr>
<tr>
<td style="text-align: center;">Role</td>
<td style="text-align: center;"><form:input path="role"/></td>
</tr>
<tr>
<td style="text-align: center;">Customer Name</td>
<td style="text-align: center;"><form:input path="customerName"/></td>
</tr>
<tr>
<td style="text-align: center;">Contact Number</td>
<td style="text-align: center;"><form:input path="mobileNo"/></td>
</tr>
<tr>
<td style="text-align: center;">Email Id</td>
<td style="text-align: center;"><form:input path="emailId"/></td>
</tr>
<tr>
<td style="text-align: center;">Address</td>
<td style="text-align: center;"><form:input path="address"/></td>
</tr>
<tr>
<td style="text-align: center;" colspan="2">${userdetails.message}</td>
</tr>
<tr>
<td/>
<td  >
<br>
<input type="submit" value="Register"/>
</td>
</tr>
</table>
</form:form>
</div>
</body>
</html>
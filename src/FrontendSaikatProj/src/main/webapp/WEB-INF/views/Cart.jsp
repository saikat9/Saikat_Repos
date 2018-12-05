<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h3 align="center">Cart</h3>
<table class="table bordered">
<tr>
<td> SL # </td>
<td> Product Name</td>
<td> Quantity</td>
<td> Price</td>
<td> Total Price</td>
<td> Amend</td>
<td> Delete</td>
</tr>
<c:forEach items="listCartItems" var="cartItem">
<tr>
<td> </td>
<td> ${cartItem.productName}</td>
<td> ${cartItem.quantity}</td>
<td> ${cartItem.price}</td>
<td> ${cartItem.quantity} * ${cartItem.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
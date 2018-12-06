<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h3 align="center">Cart</h3>
<table class="table bordered">
<tr bgcolor="orangle">
<td> SL # </td>
<td> Product Name</td>
<td> Quantity</td>
<td> Price</td>
<td> Total Price</td>
<td> Amend</td>
<td> Delete</td>
</tr>
<c:forEach items="${listCartItems}" var="cartItem">
<form action="<c:url value="/amendcartitem/${cartItem.cartId}"/>" method="get">
<table>
<tr>	
<td> </td>
<td> ${cartItem.productName}</td>
<td> <input type="text" name="quantity" value="${cartItem.quantity}"/></td>
<td> ${cartItem.price}</td>
<td> ${cartItem.quantity * cartItem.price}/-</td>
<td>
<input type="submit" value="Update" class="btn btn-success"/>
</td>
<td>
<!-- <a class="btn btn-danger" href="<c:url value="/removecartitem/${cartItem.cartId}"/>" method="get">Delete</a> -->
<a class="btn btn-danger" href="<c:url value="/removecartitem/${cartItem.cartId}"/>">Delete</a>
</td>
</tr>
</table>
</form>
</c:forEach>
<tr bgcolor="cyan">
<td colspan="5">Total Cart Price</td>
<td colspan="3">Rs.${cartTotalPrice}/-</td>
</tr>
<tr bgcolor="gray">
<td colspan="3"><a href="<c:url value="/showproductimage"/>">Continue Shopping</a></td>
<td colspan="3"><a href="<c:url value="/checkout"/>">Checkout</a></td>
</tr>
</table>
</body>
</html>
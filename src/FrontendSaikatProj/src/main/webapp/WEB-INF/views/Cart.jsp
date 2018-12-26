<%@include file="CommonNavbar.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

body {
    background-color: silver;
}
</style>
</head>
<body>
<div class="container-fluid">
<h3 align="center">Cart</h3>
<table class="table bordered">
<tr bgcolor="green">
<td><b> SL # </b></td>
<td><b> Product Name</b></td>
<td><b> Quantity</b></td>
<td><b> Price</b></td>
<td><b>Total Price</b></td>
<td><b> Amend</b></td>
<td><b> Delete</b></td>
</tr>


<c:forEach items="${listCartItems}" var="cartItem" varStatus="loop">
<!-- <form action="<c:url value="/amendcartitem/${cartItem.cartId}"/>" method="get"> -->
<tr>

<td>${loop.index + 1}</td>
<td> ${cartItem.productName}</td>
<td> ${cartItem.quantity}</td>
<!--<input type="text" name="quantity" id="quantity" value="${cartItem.quantity}"/>  -->
<td> ${cartItem.price}</td>
<td> ${cartItem.quantity * cartItem.price}/-</td>
<td>
<!--<input type="submit" value="Update" class="btn btn-success"/>  -->
<a class="btn btn-success" href="<c:url value="/amendcartitem/${cartItem.cartId}"/>">Update</a>
</td>
<td>
<!-- <a class="btn btn-danger" href="<c:url value="/removecartitem/${cartItem.cartId}"/>" method="get">Delete</a> -->
<a class="btn btn-danger" href="<c:url value="/removecartitem/${cartItem.cartId}"/>">Delete</a>
</td>
</tr>
<!-- </form> -->
</c:forEach>

<tr bgcolor="cyan">
<td/>
<td/>
<td/>
<td><b>Total Cart Price</b></td>	
<td ><b>Rs.${cartTotalPrice}/-</b></td>
<td/>
<td/>
</tr>
<tr bgcolor="teal">
<td colspan="3"><a href="<c:url value="/showproductimage"/>"><b><font color="white">Continue Shopping</font></b></a></td>
<td/>
<td/>
<td/>
<td colspan="4"><a href="<c:url value="/checkout"/>" class="btn btn-success"><b>Checkout</b></a></td>
</tr>
</table>
</div>
</body>
</html>
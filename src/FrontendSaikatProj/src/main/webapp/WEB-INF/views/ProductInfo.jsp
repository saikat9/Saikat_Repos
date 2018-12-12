<%@include file="CommonNavbar.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<script>
function myFunction() {
    document.getElementById("quantity").stepUp(5);
}
</script>
<br/><br/><br/>
<form action="<c:url value="/addtocart/${product.productId}"/>" method="post">
<div class="container">
<div class="row">
<div class="col-xs-4 item-photo">
<c:set var="pid" value="${product.productName}${product.productId}"/>
<img src="/resources/images/${product.productName}${product.productId}.jpg"/>
</div>
<div class="col-xs-5" style="border: 0px solid gray">
<h3>Product Name: ${product.productName}</h3>
<h6 class="title-price">
Stock : ${product.stock}
</h6>
<h3 style="margin-top: 0px;">Price : INR ${product.price}/-</h3>
<div class="section">
<h6 class="title-attr" style="margin-top: 15px;">
Description : ${product.productDesc}
</h6>
<div>
<div class="attr" style="width: 25px; background: #5a5a5a;"></div>
<div class="attr" style="width: 25px; background: white;"></div>
</div>
</div>
<div>
<input value="1" name="quantity" id="quantity" type="number" min="1"/>
</div>
<div class="section" style="padding-bottom: 20px;">
<input type="submit" class="btn btn-success" value="Add To Cart">
</div>
</div>
</div>
</div>
</form> 
</body>
</html>
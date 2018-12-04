<%@include file="Header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<br/><br/><br/>
<form action="/AddToCart/${product.productId}" method="get">
<div class="container">
<div class="row">
<div class="col-xs-4 item-photo">
<c:set var="pid" value="${product.productName}${product.productId}"/>
<img src="<c:url value="/resource/images/pid.jpg"/>"/>
</div>
<div class="col-xs-5" style="border: 0px solid gray">
<h3>Product Name: ${product.productName}</h3>
<h6 class="title-price">
<small>Stock : ${product.stock}</small>
</h6>
<h3 style="margin-top: 0px;">Price : INR ${product.price}/-</h3>
<div class="section">
<h6 class="title-attr" style="margin-top: 15px;">
<small>Description : ${product.productDesc}</small>
</h6>
<div>
<div class="attr" style="width: 25px; background: #5a5a5a;"></div>
<div class="attr" style="width: 25px; background: white;"></div>
</div>
</div>
<div>
<div class="btn-minus">
<span class="glyphicon glyphicon-minus"></span>
</div>
<input value="1" name="quantity"/>
<div class="btn-plus">
<span class="glyphicon glyphicon-plus"></span>
</div>
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
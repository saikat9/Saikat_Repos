<%@include file="CommonNavbar.jsp" %>
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
<h3 align="center">Product Image Page</h3>
<div class="row text-center text-lg-left">
<c:forEach items="${productList }" var="product">
<div class="col-lg-3 col-md-4 col-6">
<a href="<c:url value="/productinfo/${product.productId}"/>" class="d-block mb-4 h-100">
<!--<c:set var="pid" value="${product.productName}${product.productId}" />-->
<img class="img-fluid img-thumbnail" src="/resources/images/${product.productName}${product.productId}.jpg" alt="" width="100" height="100"/>
<!--<img src="/resources/images/${product.productName}${product.productId}.jpg" alt="" />  -->
<!--  <b>Price : ${product.price}/-</b>-->
<!--  <b>Stock : ${product.stock}/-</b>-->
<!--  <p>Price : ${product.price}/-</p>-->
<!-- <p>Stock : ${product.stock}/-</p>-->
</a>
<a href="<c:url value="/productinfo/${product.productId}"/>" class="d-block mb-4 h-100">
<br><b>Price : ${product.price}/-</b>
</a>
<a href="<c:url value="/productinfo/${product.productId}"/>" class="d-block mb-4 h-100">
<br><b>Stock : ${product.stock}/-</b>
</a>
</div>
</c:forEach>
</div>
</body>
</html>
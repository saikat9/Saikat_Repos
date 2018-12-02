<%@include file="Header.jsp" %>
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
</style>
</head>
<body>
<div class="container">
<form:form action="AddProduct" modelAttribute="product" method="post" enctype="multipart/form-data">
<table class="center" class="table table-bordered">
<tr>
<td style="text-align: center;">Product Name</td>
<td style="text-align: center;"><form:input path="productName"/></td>
</tr>
<tr>
<td style="text-align: center;">Price</td>
<td style="text-align: center;"><form:input path="price"/></td>
</tr>
<tr>
<td style="text-align: center;">Stock</td>
<td style="text-align: center;"><form:input path="stock"/></td>
</tr>
<tr>
<td style="text-align: center;">Category</td>
<td style="text-align: center;">
<form:select path="categoryId">
<form:option value="0" label="---Select from drop-down---"/>
<form:options items="${categoryList}"/>
</form:select>
</td>
</tr>
<tr>
<td style="text-align: center;">Supplier</td>
<td style="text-align: center;"><form:input path="supplierId"/></td>
</tr>
<tr>
<td style="text-align: center;">Product Description</td>
<td style="text-align: center;"><form:input path="productDesc"/></td>
</tr>
<tr>
<td style="text-align: center;">Product Image</td>
<td style="text-align: center;"><form:input type="file" path="pimage"/></td>
</tr>
<tr>
<td style="text-align: center;" colspan="2">
<input type="submit" value="Add Product"/>
</td>
</tr>
</table>
</form:form>
<table class="center" class="table table-bordered">
<tr>
<td style="text-align: center;">Product ID</td>
<td style="text-align: center;">Product Name</td>
<td style="text-align: center;">Category</td>
<td style="text-align: center;">Price</td>
<td style="text-align: center;">Supplier</td>
<td style="text-align: center;">Edit</td>
<td style="text-align: center;">Delete</td>
</tr>
<c:forEach items="${productList }" var="product">
<tr>
<td style="text-align: center;">${product.productId}</td>
<td style="text-align: center;">${product.productName}</td>
<td style="text-align: center;">${product.categoryId}</td>
<td style="text-align: center;">${product.price}</td>
<td style="text-align: center;">${product.supplierId}</td>
<td style="text-align: center;">
<a class="btn btn-success" href="<c:url value="/amendProduct/${product.productId}"/>">Edit</a>
</td>
<td style="text-align: center;">
<a class="btn btn-danger" href="<c:url value="/${product.productId}/removeProduct"/>">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>
<%@include file="Header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form:form action="AddProduct" modelAttribute="product" method="post">
<table>
<tr>
<td>Product Name</td>
<td><form:input path="productName"/></td>
</tr>
<tr>
<td>Price</td>
<td><form:input path="price"/></td>
</tr>
<tr>
<td>Stock</td>
<td><form:input path="stock"/></td>
</tr>
<tr>
<td>Category</td>
<td>
<form:select path="categoryId">
<form:option value="0" label="---Select from drop-down---"/>
<form:options items="${listCategories}"/>
</form:select>
</td>
</tr>
<tr>
<td>Supplier</td>
<td><form:input path="supplierId"/></td>
</tr>
<tr>
<td>Product Description</td>
<td><form:input path="productDesc"/></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Add Product"/>
</td>
</tr>
</table>
</form:form>
</body>
</html>
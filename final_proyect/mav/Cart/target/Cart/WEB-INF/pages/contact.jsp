<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Shopping Product Manager</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 100%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
</head>
<body>

<h2>Product Manager</h2>

<form:form method="post" action="add.html" commandName="product">

	<table>
	<tr>
		<td><form:label path="id"><spring:message code="label.id"/></form:label></td>
		<td><form:input path="id" /></td> 
	</tr>
	<tr>
		<td><form:label path="name"><spring:message code="label.name"/></form:label></td>
		<td><form:input path="name" /></td>
	</tr>
	<tr>
		<td><form:label path="price"><spring:message code="label.price"/></form:label></td>
		<td><form:input path="price" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.addproduct"/>"/>
		</td>
	</tr>
</table>	
</form:form>

	
<h3>Products</h3>
<c:if  test="${!empty productList}">
<table class="data">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Price</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${productList}" var="product">
	<tr>
		<td>${product.id}</td>
		<td>${product.name}</td>
		<td>${product.price}</td>
		<td><a href="delete/${product.id}">delete</a></td>
	</tr>
</c:forEach>
</table>
</c:if>


</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>

	<form:form action="addBook" modelAttribute="book" method="POST">
		<form:hidden path="id" />
		<br>
		<table>
			<tbody>
				<tr>
					<td><label>Author:</label></td>
					<td><form:input path="author" /></td>
				</tr>
				<tr>
					<td><label>Title:</label></td>
					<td><form:input path="title" /></td>
				</tr>
				<tr>
					<td><label>Publisher:</label></td>
					<td><form:input path="publisher" /></td>
				</tr>
				<tr>
					<td><label>Year:</label></td>
					<td><form:input path="year" /></td>
				</tr>
			</tbody>
		</table>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
	
	<form:form action="addMagazine" modelAttribute="magazine" method="POST">
		<form:hidden path="id" />
		<br>
		<table>
			<tbody>
				<tr>
					<td><label>Title:</label></td>
					<td><form:input path="title" /></td>
				</tr>
				<tr>
					<td><label>Publisher:</label></td>
					<td><form:input path="publisher" /></td>
				</tr>
				<tr>
					<td><label>Year:</label></td>
					<td><form:input path="year" /></td>
				</tr>
				<tr>
					<td><label>Numbers per year:</label></td>
					<td><form:input path="numbersPerYear" /></td>
				</tr>
			</tbody>
		</table>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
	
	<p>
		<a href="${pageContext.request.contextPath}/">Back to start</a>
	</p>

</body>
</html>
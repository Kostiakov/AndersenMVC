<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Title</th>
			<th>Publisher</th>
			<th>Year</th>
			<c:forEach var="tempLiterature" items="${literature}">
				<tr>
					<td>${tempLiterature.id}</td>
					<td>${tempLiterature.title}</td>
					<td>${tempLiterature.publisher}</td>
					<td>${tempLiterature.year}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>
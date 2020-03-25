<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Author</th>
			<th>Title</th>
			<th>Publisher</th>
			<th>Year</th>
			<th>Numbers Per Year</th>
			<th>Delete</th>
			<c:forEach var="tempLiterature" items="${literature}">
				<c:url var="deleteLink" value="/delete">
					<c:param name="literatureId" value="${tempLiterature.id}"></c:param>
				</c:url>
				<tr>
					<td>${tempLiterature.id}</td>
					<c:catch var="error1">
						<td>${tempLiterature.author}</td>
					</c:catch>
					<c:if test="${error1!=null}">
					</c:if>
					<td>${tempLiterature.title}</td>
					<td>${tempLiterature.publisher}</td>
					<td>${tempLiterature.year}</td>
					<c:catch var="error2">
						<td>${tempLiterature.numbersPerYear}</td>
					</c:catch>
					<c:if test="${error2!=null}">
					</c:if>
					<td><a href="${deleteLink}">Delete</a></td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	<p>
		<a href="${pageContext.request.contextPath}/">Back to start</a>
	</p>
</body>
</html>
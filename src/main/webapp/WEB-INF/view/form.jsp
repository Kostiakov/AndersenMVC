<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
</head>
<body>
<form:form action="process" modelAttribute="student">
Name: <form:input path="name"/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>
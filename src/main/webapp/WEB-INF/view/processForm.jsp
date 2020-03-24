<html>
<head>
</head>
<body>
Processed
<% 
String abc=request.getParameter("name");
out.println("Hello " + abc);
response.sendRedirect("https://www.google.com");
%>
<br>
</body>
</html>
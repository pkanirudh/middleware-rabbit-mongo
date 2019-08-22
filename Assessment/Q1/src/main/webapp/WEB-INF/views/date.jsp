<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Age Calculator</title>
</head>
<body>
<div class="container">
<form:form action="findAge" method="POST">
<label>Date</label>
<form:input type="date" path="dateOfBirth"/>

<input type="submit" value="Find Age">
</form:form>
</div>

<h3>Age is ${age}</h3>
</body>
</html>
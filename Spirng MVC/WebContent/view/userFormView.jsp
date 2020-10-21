<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>
<form:form action="displayUserInfo">
	Name: <form:input path=""/><p/>
	Gender: Male <form:radiobutton path="" value="male"/>
			Female <form:radiobutton path="" value="female"/>
			<p/>
			<input type="submit" value="Submit">
</form:form>
</head>
<body>

</body>
</html>
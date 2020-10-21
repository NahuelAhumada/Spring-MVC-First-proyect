<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>

</head>
<body>
<form:form action="displayUserInfo" modelAttribute="user">
	Name: <form:input path="name"/><p/>
	Gender: <form:radiobuttons path="gender" items="${genderMap}" />
			<br>
	Country: <form:select path="country">
				<form:option value="Argentina" ></form:option>
				<form:option value="USA" label="United States"></form:option>
				<form:option value="Uruguay" ></form:option>
				<form:option value="Mexico" ></form:option>
			</form:select>
			<p/>
	<input type="submit" value="Submit">
</form:form>

</body>
</html>
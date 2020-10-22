<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">

</head>
<body>
<h4>Submit your information</h4>
<hr/>
<form:form action="displayUserInfo" modelAttribute="user">
	Name: <form:input path="name" required="true" placeholder="Enter name"/><p/>
	Gender: <form:radiobuttons path="gender" required="true" items="${genderMap}" />
			<br>
	Country: <form:select path="country" items="${countryMap}"/>
			<p/>
	Introduction: 
		<form:textarea path="introduction" required="true"/><p/>
	Visited countries: 
			China: <form:checkbox path="visitedCountries" value="China"/>
			Japon: <form:checkbox path="visitedCountries" value="Japon"/>
			Suecia: <form:checkbox path="visitedCountries" value="Suecia"/>
			Noruega: <form:checkbox path="visitedCountries" value="Noruega"/>
	<p/>
	<input type="submit" value="Submit">
</form:form>

</body>
</html>
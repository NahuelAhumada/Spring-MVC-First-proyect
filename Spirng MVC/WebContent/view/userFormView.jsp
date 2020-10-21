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
	Country: <form:select path="country" items="${countryMap}"/>
			<p/>
	Introduction: 
		<form:textarea path="introduction"/><p/>
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
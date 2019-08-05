<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<c:if test="${param['error'] }">Incorrect username or password</c:if>
	<form:form method="POST" modelAttribute="fresher" action="dashboard">
		<table>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" name="password" id="password"/></td>
			</tr>
			<tr>
				<td></td>
				<td><form:button name="userName" id="userName">Login</form:button></td>
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>
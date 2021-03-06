<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Books and authors</title>
	</head>
	<body>
		<h1>
			Welcome to the application for books and authors
		</h1>
		<form method="GET" action="/">
			<button type="submit">
				Go back to home
			</button>
		</form>
		<ul>
			<c:forEach var="author" items="${authorList}">
				<li>
					<c:out value="${author.getFirstname()}"></c:out>
					<c:out value="${author.getLastname()}"></c:out>
					<c:out value="${author.getAuthor_id()}"></c:out>
				</li>
			</c:forEach>
		</ul>
	</body>
</html>
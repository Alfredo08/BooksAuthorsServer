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
			<c:forEach var="row" items="${bookList}">
				<li>
					<c:forEach var="column" items="${row}">
						<c:out value="${column}"></c:out>
					</c:forEach>
				</li>
			</c:forEach>
		</ul>
	</body>
</html>
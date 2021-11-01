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
		<h2>
			Please select what you want to do:
		</h2>
		<form method="GET" action="/authors/add">
			<button type="submit">
				Add an author
			</button>
		</form>
		<form method="GET" action="/books/add">
			<button type="submit">
				Add a book
			</button>
		</form>
		<form method="GET" action="/authors/">
			<button type="submit">
				Display all authors
			</button>
		</form>
		<form method="GET" action="/books/">
			<button type="submit">
				Display all books
			</button>
		</form>
	</body>
</html>
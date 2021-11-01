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
		<form method="POST" action="/authors/new">
			<div>
				<label for="firstname">
					First name:
				</label>
				<input type="text" id="firstname" name="firstname" />
			</div>
				<div>
				<label for="lastname">
					Last name:
				</label>
				<input type="text" id="lastname" name="lastname" />		
			</div>
			<button type="submit">
				Add author
			</button>
		</form>
	</body>
</html>
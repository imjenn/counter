<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Current Visit Count</title>
	<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<div>
		<p>You have visited <span>http://localhost:8080</span> <c:out value="${counter}"/> times.</p>
		<nav>
			<a href="/">Increment 1</a>
			<a href="/counter2">Increment 2</a>
			<a href="/reset">Reset</a>
		</nav>
	</div>
</body>
</html>
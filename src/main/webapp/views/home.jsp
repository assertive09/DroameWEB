<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.droame.entities.Customer"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container text-center mt-5">
		<h1>Users Table</h1>
		<table class="table table-striped">
			<thead>

				<tr>
					<th>User ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Mobile Number</th>
					<th>Booking</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${customers}" var="c">
					<tr>
						<th scope="row">${c.id }</th>
						<td>${c.name}</td>
						<td>${c.email}</td>
						<td>${c.phone_number}</td>
						<td>Yes</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>

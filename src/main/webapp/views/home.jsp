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


<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
	integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<body>
	<div class="container text-center mt-5">
		<h1>Users</h1>
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
						<td><a href="booking_form/${c.id}"><i
								class="fas 	far fa-edit text-secondary"></i></a> &nbsp; <a
							href="show_details/${c.id}"><i
								class="fa fa-bars text-secondary"></i></a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="container">
		<a href="/add_form"><button>Add User</button> </a>
	</div>

</body>
</html>

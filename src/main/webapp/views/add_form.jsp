<%@page import="java.util.Iterator" %>
	<%@page import="java.util.ArrayList" %>
		<%@page import="java.util.List" %>
			<%@page import="com.droame.entities.Customer" %>
				<%@page isELIgnored="false" %>
					<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
						<html>

						<head>
							<title>Home</title>
							<!-- Bootstrap CSS -->
							<link rel="stylesheet"
								href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
						</head>

						<body>
							<div class="container text-center mt-5 p-2">
								<h1>Add New User</h1>
								<Form action="add_user" method="post">
									<div class="container">
									<div  class="form-group "> <label for="Name">Name</label> <input class="col-3"
											type="text" name="name" placeholder="Enter your name"></div>
									<div class="form-group"><label for="Email">Email</label> <input class="col-3"
											type="email" name="email"></div>
									<div class="form-group"><label for="phone_number">Number</label> <input class="col-3"
											type="tel" name="phone_number"></div>
									<hr>
									<button type="submit" >Submit</button>
									<button type="reset">Clear</button>
								</div>
								</Form>

							</div>

							<!-- Bootstrap JS -->
							<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
							<script
								src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
							<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
						</body>

						</html>
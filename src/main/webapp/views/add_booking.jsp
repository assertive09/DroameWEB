<%@page import="java.util.List"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Set Location and Drone Form</title>
<!-- Link to Bootstrap CSS file -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h1>Set Location and Drone</h1>
		<form action="<%=request.getContextPath()%>/add_booking" method="post">
			<div class="form-group">
				<label for="locationInput">Location:</label> 
				<select  name="lId"class="form-control" id="locationInput">
					<c:forEach items="${locations}" var="l">
						<option value="${l.getLocation_id()}">${l.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="droneInput">Drone:</label> <select name="dId"
					class="form-control" id="droneInput">
					<c:forEach items="${drones}" var="d">
						<option value="${d.getDrone_shot_id()}">${d.name}</option>
					</c:forEach>
				</select>
			</div>
	<input type="hidden" name="cId" value="${id }">
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<!-- Link to Bootstrap JS file -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>

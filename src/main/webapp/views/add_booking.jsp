<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Set Location and Drone Form</title>
  <!-- Link to Bootstrap CSS file -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

  <div class="container mt-5">
    <h1>Set Location and Drone</h1>
    <form>
      <div class="form-group">
        <label for="locationInput">Location:</label>
        <input type="text" class="form-control" id="locationInput" placeholder="Enter location">
      </div>
      <div class="form-group">
        <label for="droneInput">Drone:</label>
        <select class="form-control" id="droneInput">
          <option value="drone1">Drone 1</option>
          <option value="drone2">Drone 2</option>
          <option value="drone3">Drone 3</option>
        </select>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>

  <!-- Link to Bootstrap JS file -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>

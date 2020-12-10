<!DOCTYPE html>
<html>
<head>
	<title>Assignment 4</title>
</head>
<body>
	<table border>
		<tr>
			<th>Username</th>
			<th>date</th>
			<th>time</th>
		</tr>
		<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'error';
}
else {
	$date = $_POST['date'];
	$select = "select * from log where date = '$date'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['user'].'</td><td>'.$row['date'].'</td><td>'.$row['time'].'</td></tr>';
		}
	}
}
 ?>
	</table>
</body>
</html>
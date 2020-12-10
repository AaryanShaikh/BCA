<!DOCTYPE html>
<html>
<head>
	<title>Assigment 6</title>
</head>
<body>
	<table border>
		<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$select = "select * from book";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['bid'].'</td><td>'.$row['bname'].'</td><td>'.$row['stock'].'</td></tr>';
		}
	}
}
 ?>
	</table>
</body>
</html>
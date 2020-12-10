<!DOCTYPE html>
<html>
<head>
	<title>Assignment 7</title>
</head>
<body>
	<table border>
		<tr>
			<th>Name</th>
			<th>Salary</th>
		</tr>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$select = "select name,salary from assign7";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['name'].'</td><td>'.$row['salary'].'</td></tr>';
		}
	}
}
?>
</table>
 </body>
</html>
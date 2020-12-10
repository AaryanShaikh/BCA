<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<table border>
	<tr>
		<th>Name</th>
		<th>wt</th>
		<th>maths</th>
		<th>percentage</th>
	</tr>
<?php 
$conn = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$select = "select * from sha";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['name'].'</td><td>'.$row['wt'].'</td><td>'.$row['maths'].'</td><td>'.$row['percentage'].'</td></tr>';
		}
	}
}
 ?>
 </table>
 </body>
</html>
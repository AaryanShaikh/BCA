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
	$select = "select * from issue";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['id'].'</td><td>'.$row['bname'].'</td></tr>';
		}
	}
}
?>
</table>
</body>
</html>
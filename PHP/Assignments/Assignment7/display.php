<!DOCTYPE html>
<html>
<head>
	<title>Assignment 7</title>
</head>
<body>
	<table border>
		<tr>
			<th>Employee name with highest attendance</th>
			<th>Employee name with lowest attendance</th>
			<th>Highest bonus with any selected month</th>
		</tr>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$select = "select max(amt) as max from salary";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $maxs = $row['max'];
		}
	}
	$select = "select min(amt) as min from salary";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $mins = $row['min'];
		}
	}
	$select = " select max(bamt) as mbonus from bonus";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $mbonus = $row['mbonus'];
		}
	}
	$select = "select name from salary where amt = '$maxs'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['name'];
		}
	}
	$select = "select name from salary where amt = '$mins'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '</td><td>'.$row['name'];
		}
	}
	$select = "select month from bonus where bamt = '$mbonus'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '</td><td>'.$row['month'].'</td></tr>';
		}
	}
}
 ?>
 </table>
 </body>
</html>
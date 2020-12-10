<!DOCTYPE html>
<html>
<head>
	<title>Assignment 8</title>
</head>
<body>
	<table border>
		<tr>
			<th>Student Name</th>
			<th>Subject Name</th>
			<th>Roll number</th>
			<th>Month</th>
			<th>Marks</th>
		</tr>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$name = $_POST['name'];
	$sname = $_POST['sname'];
	$roll = $_POST['roll'];
	$month = $_POST['month'];
	$select = "select marks from report where name = '$name' and sname = '$sname'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $rmarks = $row['marks'];
		}
	}
	$select = "select marks from subj where sname = '$sname'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $smarks = $row['marks'];
		}
	}
	$res = ($rmarks/$smarks)*100;
	if ($res<35) {
		echo '<tr><td>'.$name.'</td><td>'.$sname.'</td><td>'.$roll.'</td><td>'.$month.'</td><td bgcolor="red">'.$rmarks.'</td></tr>';
	}
	else {
		echo '<tr><td>'.$name.'</td><td>'.$sname.'</td><td>'.$roll.'</td><td>'.$month.'</td><td bgcolor="green">'.$rmarks.'</td></tr>';
	}
}
 ?>
 </table>
</body>
</html>
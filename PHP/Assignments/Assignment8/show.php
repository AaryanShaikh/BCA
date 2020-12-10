<!DOCTYPE html>
<html>
<head>
	<title>Assignment 8</title>
</head>
<body>
	<table border>
		<tr>
			<th>Student Name</th>
			<th>Class</th>
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
	$select = "select max(marks) as max from report";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $max = $row['max'];
		}
	}
	$select = " select report.name,assign8.class,report.roll,report.month,report.marks from assign8,report where report.marks = '$max'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['name'].'</td><td>'.$row['class'].'</td><td>'.$row['roll'].'</td><td>'.$row['month'].'</td><td>'.$row['marks'].'</td></tr>';
		}
	}
}
 ?>
 </table>
</body>
</html>
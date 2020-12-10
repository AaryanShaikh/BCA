<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$name = $_POST['name'];
	$stream = $_POST['stream'];
	$division = $_POST['division'];
	$class = $_POST['class'];
	$roll = $_POST['roll'];
	$insert = "insert into assign6 (stream,name,division,class,roll) values ('$stream','$name','$division','$class','$roll')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records Entered sucessfully';
	}
	else {
		echo 'records not entered';
	}
}
 ?>
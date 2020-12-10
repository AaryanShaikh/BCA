<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$name = $_POST['name'];
	$dept = $_POST['dept'];
	$salary = $_POST['salary'];
	$insert = "insert into assign7 (name,dept,salary) values ('$name','$dept','$salary')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records have been added successfully';
	}
	else {
		echo 'Insertion Error';
	}
}
 ?>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$name = $_POST['name'];
	$class = $_POST['class'];
	$roll = $_POST['roll'];
	$insert = "insert into assign8 (name,class,roll) values ('$name','$class','$roll')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records entered Successfully';
	}
	else {
		echo 'Insertion Error';
	}
}
 ?>
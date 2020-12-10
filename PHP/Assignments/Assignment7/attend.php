<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$id = $_POST['id']; 
	$month = $_POST['month'];
	$leaves = $_POST['leaves'];
	$insert = "insert into attend (id,month,leaves) values ('$id','$month','$leaves')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records entered successfully';
	}
	else {
		echo 'Insertion Error';
	}
}
 ?>
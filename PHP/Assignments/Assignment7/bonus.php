<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$id = $_POST['id'];
	$dept = $_POST['dept'];
	$month = $_POST['month'];
	$bamt = $_POST['bamt'];
	$insert = "insert into bonus (id,dept,month,bamt) values ('$id','$dept','$month','$bamt')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records entered successfully';
	}
	else {
		echo 'insertion error';
	}
}
 ?>
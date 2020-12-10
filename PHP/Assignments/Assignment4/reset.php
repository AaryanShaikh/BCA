<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'error';
}
else {
	$user = $_POST['user'];
	$pass = $_POST['pass'];
	$rpass = $_POST['rpass'];
	if ($pass==$rpass) {
		$update = "update assign4 set pass = '$pass' where user = '$user'";
		$res = mysqli_query($conn, $update);
		if ($res) {
			echo 'Password Reset sucess';
		}
		else {
			echo 'Updation error';
		}
	}
	else {
		echo 'Password are not same';
	}
}
 ?>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Connection Error';
}
else {
	$user = $_POST['user'];
	$pass = $_POST['pass'];
	$select = "select * from assign4 where user = '$user' and pass = '$pass'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		$date = date("Y/m/d");
		$time = date("h:i:s");
		$insert = "insert into log (user,date,time) values ('$user','$date','$time')";
		$res = mysqli_query($conn, $insert);
		if ($res) {
			echo 'Login Sucess';
		}
		else {
			echo 'date & time log not created';
		}
	}
	else {
		echo "not exist";
	}
}	
 ?>
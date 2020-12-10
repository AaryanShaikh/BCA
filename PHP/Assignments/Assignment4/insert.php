<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'error';
}
else {
	$pass = $_POST['pass'];
	$rpass = $_POST['rpass'];
	if ($pass==$rpass) {
		$plen=strlen($pass);
		if ($plen<8) {
			echo 'Password is minimum than 8';
		}
		else {
			$user = $_POST['user'];
			$email = $_POST['email'];
			$pass = $_POST['pass'];
			$insert = "insert into assign4 (user,email,pass) values ('$user','$email','$pass')";
			$res = mysqli_query($conn, $insert);
			if ($res) {
				echo 'Records Entered Sucess';
			}
			else {
				echo 'Error while entering records';
			}
		}
	}
	else{
		echo 'Password are not same';
	}
}
 ?>
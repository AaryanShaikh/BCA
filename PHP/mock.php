<?php  
$conn = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'Connection Error';
}
else {
	$email = $_POST['email'];
	$pass = $_POST['pass'];
	$insert = "insert into mock (email,pass) values ('$email','$pass')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records entered successfully';
	}
	else {
		echo 'Records insertion error';
	}
}
?>
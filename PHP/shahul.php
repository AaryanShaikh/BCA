<?php 
$conn = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'error';
}
else {
	$name = $_POST['name'];
	$wt = $_POST['wt'];
	$maths = $_POST['maths'];
	$per = (($wt+$maths)/100)*100;
	$insert = "insert into sha (name,wt,maths,percentage) values ('$name','$wt','$maths','$per')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Insertion success';
	}
	else {
		echo 'Insertion error';
	}
}
 ?>
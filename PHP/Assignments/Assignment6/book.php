<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$bname = $_POST['bname'];
	$stock = $_POST['stock'];
	$insert = "insert into book (bname,stock) values ('$bname','$stock')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records Entered sucessfully';
	}
	else{
		echo 'Insertion Error';
	}
}
 ?>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$sname = $_POST['sname'];
	$class = $_POST['class'];
	$marks = $_POST['marks'];
	$insert = "insert into subj (sname,class,marks) values ('$sname','$class','$marks')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records entered Successfully';
	}
	else {
		echo 'Insertion error';
	}
}
 ?>

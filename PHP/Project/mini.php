<?php 
$conn = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$name = $_POST['name'];
	$sname = $_POST['sname'];
	$roll = $_POST['roll'];
	$marks = $_POST['marks'];
	if ($marks>80) {
		$grade = 'A';
	}
	elseif ($marks>50&&$marks<80) {
		$grade = 'B';
	}
	else {
		$grade = 'C';
	}
	$insert = "insert into proj (name,sname,roll,marks,grade) values ('$name','$sname','$roll','$marks','$grade')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records Entered';
	}
	else{
		echo 'Records not Entered';
	}
}
 ?>
<?php 
	$conn = mysqli_connect("localhost", "root", "", "assignment");
	if ($conn->connect_error) {
		echo 'Error';
	}
	else {
		$name = $_POST['name'];
		$dept = $_POST['dept'];
		/*$date = date("Y/m/d");
		$time = date("h:i:s");*/
		$insert = "insert into assign2 (name,dept) values ('$name','$dept')";
		$insert2 = "insert into intime (timein) values ('000')";
		$insert3 = "insert into outtime (timeout,date) values ('000','000')";
		mysqli_query($conn, $insert);
		mysqli_query($conn, $insert2);
		mysqli_query($conn, $insert3);
		echo 'Records inserted Successfully';
	}
 ?>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$marks = $_POST['marks'];
	$select = "select marks from subj";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $smark = $row['marks'];
		}
	}
	if ($marks>$smark) {
		echo 'Wrong value';
	}
	else{
		$name = $_POST['name'];
		$sname = $_POST['sname'];
		$roll = $_POST['roll'];
		$month = $_POST['month'];
		$insert = "insert into report (name,sname,roll,month,marks) values ('$name','$sname','$roll','$month','$marks')";
		$res = mysqli_query($conn, $insert);
		if ($res) {
			echo 'Records Entered Successfully';
		}
		else{
			echo 'Insertion error';
		}
	}
}
 ?>
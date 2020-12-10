<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$name = $_POST['name'];
	$dept = $_POST['dept'];
	$month = $_POST['month'];
	$amt;
	$salary;
	$bamt;
	$select = "select salary from assign7";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $salary = $row['salary'];
		}
	}
	$select = "select bamt from bonus";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		  $bamt = $row['bamt'];
		}
	}
	$amt = $salary+$bamt;
	$insert = "insert into salary (name,dept,month,amt) values ('$name','$dept','$month','$amt')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records added Successfully';
	}
	else {
		echo 'insertion error';
	}
}
 ?>
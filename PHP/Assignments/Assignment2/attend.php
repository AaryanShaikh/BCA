<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$name = $_POST['name'];
	$option = $_POST['option'];
	if ($option=="enter") {
		$id;
		$select = "select assign2.id from assign2,intime where assign2.name = '$name' and assign2.id = intime.id";
		$res = $conn->query($select);
		if ($res->num_rows>0) {
			while ($row = $res->fetch_assoc()) {
			    $id = $row['id'];
			}
		}
		$time = date("h:i:s");
		$update = "update intime set timein = '$time' where id = '$id'";
		mysqli_query($conn, $update);
		echo "Entered!";
	}
	else {
		$id;
		$select = "select assign2.id from assign2,outtime where assign2.name = '$name' and assign2.id = outtime.id";
		$res = $conn->query($select);
		if ($res->num_rows>0) {
			while ($row = $res->fetch_assoc()) {
			    $id = $row['id'];
			}
		}
		$time = date("h:i:s");
		$date = date("Y/m/d");
		$update = "update outtime set timeout = '$time',date = '$date' where id = '$id'";
		mysqli_query($conn, $update);
		echo "Left!";
	}
}
 ?>
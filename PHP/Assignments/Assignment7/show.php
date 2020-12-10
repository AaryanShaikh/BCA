<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$month = $_POST['month'];
	$select = "select amt from salary where month = '$month'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo $row['amt'];
		}
	}
}
 ?>
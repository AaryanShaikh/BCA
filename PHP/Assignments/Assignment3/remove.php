<?php
$conn = mysqli_connect("localhost", "root", "", "exam");
if ($conn->connect_error) {
	echo "Error";
}
else {
	/*echo "Success";*/
	$stock = $_POST['stock'];
	$delete = "delete from invent where stock = '$stock'";
	mysqli_query($conn,$delete);
	echo "records  deletion Success";
}
?>
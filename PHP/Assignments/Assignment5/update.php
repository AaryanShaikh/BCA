<?php 
$where = $_POST['option'];
$value = $_POST['values'];
$id = $_POST['id'];
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Connection failed';	
}else {
	echo 'Connection Successfully';
	/*echo $where;
	echo $value;
	echo $roll;*/
	$update = "UPDATE assign5 SET $where = '$value' WHERE id = '$id'";
	mysqli_query($conn, $update);
}
 ?>
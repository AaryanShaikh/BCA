<?php 
$where = $_POST['option'];
$value = $_POST['values'];
$roll = $_POST['roll'];
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Connection failed';	
}else {
	echo 'Connection Successfully';
	/*echo $where;
	echo $value;
	echo $roll;*/
	$update = "UPDATE assign1 SET $where = '$value' WHERE roll = '$roll'";
	mysqli_query($conn, $update);
}
 ?>
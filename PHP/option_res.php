<?php 
$conn = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'error';
}
else {
	$name = $_POST['name'];
	$fname = $_POST['fname'];
	echo $name;
	echo '<br>'.$fname;
}
 ?>
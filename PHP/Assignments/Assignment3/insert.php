<?php
$conn = mysqli_connect("localhost", "root", "", "exam");
if ($conn->connect_error) {
	echo "Error";
}
else {
	/*echo "Success";*/
	$name = $_POST['name'];
	$cost = $_POST['cost'];
	$brand = $_POST['brand'];
	$exp = $_POST['exp'];
	$batch = $_POST['batch'];
	$stock = $_POST['stock'];
	$insert = "insert into invent (name,cost,brand,exp,batch,stock) values (?,?,?,?,?,?)";
	$stmt = $conn->prepare($insert);
	$stmt->bind_param("ssssss",$name,$cost,$brand,$exp,$batch,$stock);
	$stmt->execute();
	echo "records  entered Success";
}
?>
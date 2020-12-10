<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$id = $_POST['id'];
	$bname;
	$stock;
	$select = "select bname from issue where id = '$id'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo $row['bname'];
		    $bname = $row['bname'];
		}
	}
	$select = "select stock from book where bname = '$bname'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $stock = $row['stock'];
		}
	}
	$stock = $stock + 1;
	$update = "update book set stock = '$stock' where bname = '$bname'";
	mysqli_query($conn, $update);
}
 ?>
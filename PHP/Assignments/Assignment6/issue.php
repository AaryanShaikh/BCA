<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$id = $_POST['id'];
	$bname = $_POST['bname'];
	$stock;
	$select = "select stock from book where bname = '$bname'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    $stock = $row['stock'];
		}
	}
	if ($stock>0) {
		$select = "select * from issue where id = '$id'";
		$res = $conn->query($select);
		if ($res->num_rows>0) {
			echo 'Book already issued';
		}
		else {
			$insert = "insert into issue (id,bname) values ('$id','$bname')";
			$res = mysqli_query($conn, $insert);
			if ($res) {
				echo 'Book issued Successfully';
			}
			else {
				echo 'Insertion Error';
			}
			$stock = $stock-1;
			$update = "update book set stock = '$stock' where bname = '$bname'";
			mysqli_query($conn, $update);
		}
	}
	else {
		echo 'No Stock of this book';
	}
}
 ?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="">
</head>
<body>
	<table border>
			<tr>
				<th>id</th>
				<th>Item Name</th>
				<th>Cost</th>
				<th>Brand</th>
				<th>Expiry Date</th>
				<th>Batch</th>
				<th>Stock</th>
			</tr>
	<?php
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo "Error";
}
else {
	/*echo "Success";*/
	$option = $_POST['option'];
	if ($option == 'date') {
		$select1 = "Select * from invent where exp = '17/7/1999'";	
		$res = $conn->query($select1);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
			echo "<tr><td>".$row['id']."</td><td>".$row['name']."</td><td>".$row['cost']."</td><td>".$row['brand']."</td><td>".$row['exp']."</td><td>".$row['batch']."</td><td>".$row['stock']."</td></tr>";
		}
	}
	}
	elseif ($option == 'name'){
		$select2 = "Select * from invent where name = 'ahmad'";	
		$res = $conn->query($select2);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
			echo "<tr><td>".$row['id']."</td><td>".$row['name']."</td><td>".$row['cost']."</td><td>".$row['brand']."</td><td>".$row['exp']."</td><td>".$row['batch']."</td><td>".$row['stock']."</td></tr>";
		}
	}
	}
	else{
	$select3 = "Select * from invent where stock = '10'";	
		$res = $conn->query($select3);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
			echo "<tr><td>".$row['id']."</td><td>".$row['name']."</td><td>".$row['cost']."</td><td>".$row['brand']."</td><td>".$row['exp']."</td><td>".$row['batch']."</td><td>".$row['stock']."</td></tr>";
		}
	}
	}
	
	
	

}
?>
</table>
</body>
</html>
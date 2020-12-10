<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<table border>
		<tr>
			<th>name</th>
			<th>email</th>
			<th>password</th>
			<th>subject</th>
			<th>hobbies</th>
		</tr>
<?php
$conn = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'error';
}
else {
	$name = $_POST['name'];
	$email = $_POST['email'];
	$pass = $_POST['pass'];
	$sub = $_POST['sub'];
	$hob = $_POST['hob'];
	$insert = "insert into arfa (name,email,pass,sub,hob) values ('$name','$email','$pass','$sub','$hob')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records entered sucessfully';
		$select = "select * from arfa";
		$res = $conn->query($select);
		if ($res->num_rows>0) {//if the data exist in the database
			while ($row = $res->fetch_assoc()) {// fetch the data and store it in an association array
				?>
			    <!-- echo '<tr><td>'.$row['name'].'</td><td>'.$row['email'].'</td><td>'.$row['pass'].'</td><td>'.$row['sub'].'</td><td>'.$row['hob'].'</td></tr>'; -->
			    <tr>
	<td><?php echo $row['name']; ?></td>
	<td><?php echo $row['email']; ?></td>
	<td><?php echo $row['pass']; ?></td>
	<td><?php echo $row['sub']; ?></td>
	<td><?php echo $row['hob']; ?></td>
</tr><?php
			}
		}
	}
	else {
		echo 'Records insertion error';
	}
}
?>

</table>
</body>
</html>
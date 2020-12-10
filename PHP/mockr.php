<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<table border="">
		<tr>
			<th>email</th>
			<th>pass</th>
		</tr>
<?php 
$conn = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$email = $_POST['email'];
	$pass = $_POST['pass'];
	$select = "select * from mock where email = '$email' and pass = '$pass'";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		/*echo 'sucess';*/
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['email'].'</td><td>'.$row['pass'].'</td></tr>';
		}
	}
	else{
		echo 'error';
	}
}
?>
</table>
</body>
</html>
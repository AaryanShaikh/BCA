<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<table border>
		<tr>
			<th>id</th>
			<th>father's name</th>
			<th>mother's name</th>
			<th>date of birth</th>
			<th>gender</th>
			<th>address</th>
			<th>Contact number</th>
			<th>email</th>
			<th>Last company visited</th>
			<th>Aadhar Card number</th>
			<th>Highest educational qualificattion</th>
			<th>Salary/year</th>
			<th>Designation</th>
			<th>Supervisor</th>
			<th>Department</th>
			<th>Full Name</th>
			<th>Joining date</th>
		</tr>
<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'error';
}
else {
	$select = "select * from assign5";
		$res = $conn->query($select);
		if ($res->num_rows>0) {
				while ($row = $res->fetch_assoc()) {
				    echo "<tr><td>".$row['id']."</td><td>".$row['father']."</td><td>".$row['mother']."</td><td>".$row['dob']."</td><td>".$row['gender']."</td><td>".$row['ad']."</td><td>".$row['contact']."</td><td>".$row['email']."</td><td>".$row['last']."</td><td>".$row['adhar']."</td><td>".$row['high']."</td><td>".$row['salary']."</td><td>".$row['design']."</td><td>".$row['super']."</td><td>".$row['dept']."</td><td>".$row['full']."</td><td>".$row['date']."</td></tr>";
				}
			}
}
 ?>
 </table>
 </body>
</html>
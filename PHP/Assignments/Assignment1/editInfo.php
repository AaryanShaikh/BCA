<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<table border>
		<tr>
			<th>id</th>
			<th>Full Name</th>
			<th>Father's Name</th>
			<th>Mother's Name</th>
			<th>Date of Birth</th>
			<th>Gender</th>
			<th>Address</th>
			<th>Contact No</th>
			<th>Last School Attended</th>
			<th>Generate register number</th>
			<th>Stream</th>
			<th>Admitted</th>
			<th>roll</th>
			<th>Date of Admission</th>
			<th>Fees</th>
			<th>Adhar</th>
		</tr>
		<?php 
		$getRegno = $_POST['getRegno'];
		if (!empty($getRegno)) {
		$conn = mysqli_connect("localhost", "root", "", "assignment");
		if ($conn->connect_error) {
			die("Connection Error".$conn->connect_error);
		}else {
			$sql = "select * from assign1 where regno = '$getRegno'";
			$res = $conn->query($sql);

			if ($res->num_rows>0) {
				while ($row = $res->fetch_assoc()) {
				    echo "<tr><td>".$row['id']."</td><td>".$row['full']."</td><td>".$row['father']."</td><td>".$row['mother']."</td><td>".$row['dob']."</td><td>".$row['gender']."</td><td>".$row['address']."</td><td>".$row['contact']."</td><td>".$row['lastSchool']."</td><td>".$row['regno']."</td><td>".$row['stream']."</td><td>".$row['admitted']."</td><td>".$row['roll']."</td><td>".$row['doa']."</td><td>".$row['fees']."</td><td>".$row['adhar']."</td></tr>";
				}
			}
		}
	}else {
	echo 'empty';
}
 ?>
</table>
</body>
</html>
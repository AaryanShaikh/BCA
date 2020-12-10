<!DOCTYPE html>
<html>
<head>
	<title>Assignment 2</title>
</head>
<body>
	<table border>
		<tr>
			<th>Employee Id</th>
			<th>Date</th>
			<th>In-time</th>
			<th>Out-time</th>
		</tr>
		<?php 
$option = $_POST['option'];
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'error';
}
else {
			if ($option=="date") {
				$sql = " select assign2.name,outtime.date,intime.timein,outtime.timeout from assign2,outtime,intime where assign2.id = intime.id and assign2.id = outtime.id and outtime.date = '2019/10/01'";
			$res = $conn->query($sql);

			if ($res->num_rows>0) {
				while ($row = $res->fetch_assoc()) {
				    echo "<tr><td>".$row['name']."</td><td>".$row['date']."</td><td>".$row['timein']."</td><td>".$row['timeout']."</td></tr>";
						}	
				}
			}
			elseif ($option=="id") {
			$sql = " select assign2.name,outtime.date,intime.timein,outtime.timeout from assign2,outtime,intime where assign2.id = intime.id and assign2.id = outtime.id and assign2.id = '1'";
			$res = $conn->query($sql);

			if ($res->num_rows>0) {
				while ($row = $res->fetch_assoc()) {
				    echo "<tr><td>".$row['name']."</td><td>".$row['date']."</td><td>".$row['timein']."</td><td>".$row['timeout']."</td></tr>";
						}	
				}				
			}
			else {
						$sql = " select assign2.name,outtime.date,intime.timein,outtime.timeout from assign2,outtime,intime where assign2.id = intime.id and assign2.id = outtime.id and assign2.dept = 'bcom'";
			$res = $conn->query($sql);

			if ($res->num_rows>0) {
				while ($row = $res->fetch_assoc()) {
				    echo "<tr><td>".$row['name']."</td><td>".$row['date']."</td><td>".$row['timein']."</td><td>".$row['timeout']."</td></tr>";
						}	
				}
						}			
	}
 ?>
	</table>
</body>
</html>
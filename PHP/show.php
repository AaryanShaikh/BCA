<!DOCTYPE html>
<html>
<head>
	<title>Details</title>
</head>
<body>
	<table border>
		<tr>
			<th>id</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Username</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<?php 
			$conn = mysqli_connect("localhost", "root", "", "wt");
			if ($conn->connect_error) {
				die("Connection Failed! ".$conn->connect_error);
			}
			$select = "select * from reg";
			$res = $conn->query($select);

			if ($res->num_rows>0) {
				while ($row = $res->fetch_assoc()) {
				    echo '<tr><td>'.$row['id'].'</td><td>'.$row['first'].'</td><td>'.$row['last'].'</td><td>'.$row['user'].'</td><td>'.$row['email'].'</td><td>'.$row['pass'].'</td></tr>';
				}
			}
			else{
				echo '0 results found!';
			}

		 ?>
	</table>
</body>
</html>
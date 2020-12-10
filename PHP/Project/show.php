<!DOCTYPE html>
<html>
<head>
	<title>Mini project</title>
</head>
<style type="text/css">
	tr:nth-child(even) {
    background-color: #2193b0;
    color: #000;
}
th{
	color: white;
}
table{
	position: absolute;top: 50%;left: 50%;transform: translate(-50%,-50%);width: 90%;height: 400px;text-align: center;box-shadow: 0 0 10px #000,0 0 10px #000;text-shadow: 1px 1px 2px #000;
}
</style>
<body bgcolor="#333">
	<table frame="box">
		<tr>
			<th>Student name</th>
			<th>Subject name</th>
			<th>Roll no</th>
			<th>Marks</th>
			<th>Grade</th>
		</tr>
<?php 
$conn  = mysqli_connect("localhost", "root", "", "wt");
if ($conn->connect_error) {
	echo 'Error';
}
else{
	$select = "SELECT * FROM `proj` ORDER BY name";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<tr><td>'.$row['name'].'</td><td>'.$row['sname'].'</td><td>'.$row['roll'].'</td><td>'.$row['marks'].'</td><td>'.$row['grade'].'</td></tr>';
		}
	}
}
 ?>
</table>
</body>
</html>
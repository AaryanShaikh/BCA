<!DOCTYPE html>
<html>
<head>
	<title>option</title>
</head>
<body>
	<form method="post" action="option_res.php" onsubmit="">
		<select name="name">
<?php 
$conn = mysqli_connect("localhost", "root", "", "wt");
if (mysqli_connect_error()) {/*$conn->connect_error*/
	echo 'error';
}
else {
	$select = "select * from proj";
	$res = $conn->query($select);
	if ($res->num_rows>0) {
		while ($row = $res->fetch_assoc()) {
		    echo '<option>'.$row['roll'].'</option>';
		}
	}
}
?>
</select>
<input type="text" id="fname" name="fname" placeholder="First Name">
<input type="submit" value="go" onclick="return validate()">
	</form>
	<script type="text/javascript">
		function validate() {
			var fname = document.getElementById("fname").value;
			if (fname == "") {
					alert("fields are empty!")	
					return false;
				}
				else {
					return true;
				}
		}
	</script>
</body>
</html>
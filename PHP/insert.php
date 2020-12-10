<?php 
$first = $_POST['first'];
$last = $_POST['last'];
$user = $_POST['user'];
$email = $_POST['email'];
$pass = $_POST['pass'];

//if empty
if (!empty($first)||!empty($last)||!empty($user)||!empty($email)||!empty($pass)) {
	$conn = mysqli_connect("localhost", "root", "", "wt");
			if ($conn->connect_error) {
				die("Connection Failed! ".$conn->connect_error);
	}
	else {
		$select = "select email from reg where email = ? limit 1";
		$insert = "insert into reg (first,last,user,email,pass) values (?,?,?,?,?)";
		//prepare statement
		$stmt = $conn->prepare($select);
		$stmt->bind_param("s",$email);
		$stmt->execute();
		$stmt->bind_result($email);
		$stmt->store_result();
		$rnum = $stmt->num_rows;
		if ($rnum==0) {
			$stmt->close();
			$stmt = $conn->prepare($insert);
			$stmt->bind_param("sssss",$first,$last,$user,$email,$pass);
			$stmt->execute();
			echo "New records inserted sucessfully!";
		}
		else {
			echo "This email is already registered!";
		}
		$stmt->close();
		$conn->close();	
	}
}
else {
	echo 'All fields are required!!';
	die();
}
 ?>
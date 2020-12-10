<?php 
$full = $_POST['full'];
$father = $_POST['father'];
$mother = $_POST['mother'];
$dob = $_POST['dob'];
$gender = $_POST['gender'];
$address = $_POST['address'];
$contact = $_POST['contact'];
$lastSchool = $_POST['lastSchool'];
$regno = $_POST['regno'];
$stream = $_POST['stream'];
$admitted = $_POST['admitted'];
$roll = $_POST['roll'];
$doa = $_POST['doa'];
$fees = $_POST['fees'];
$adhar = $_POST['adhar'];
if (!empty($full)||!empty($father)||!empty($mother)||!empty($dob)||!empty($gender)||!empty($address)||!empty($contact)||!empty($lastSchool)||!empty($regno)||!empty($stream)||!empty($admitted)||!empty($roll)||!empty($doa)||!empty($fees)||!empty($adhar)) {
	$conn = mysqli_connect("localhost", "root", "", "assignment");
	if ($conn->connect_error) {
		die("Connection Error".$conn->connect_error);
	}
	else {
		$insert = "insert into assign1 (full,father,mother,dob,gender,address,contact,lastSchool,regno,stream,admitted,roll,doa,fees,adhar) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		$stmt = $conn->prepare($insert);
		$stmt->bind_param("sssssssssssssss",$full,$father,$mother,$dob,$gender,$address,$contact,$lastSchool,$regno,$stream,$admitted,$roll,$doa,$fees,$adhar);
		$stmt->execute();
		echo 'Records Entered Successfully!';
	}
}
else {
	echo 'Enter all fields';
}

 ?>
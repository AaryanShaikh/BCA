<?php 
$conn = mysqli_connect("localhost", "root", "", "assignment");
if ($conn->connect_error) {
	echo 'Error';
}
else {
	$full = $_POST['full'];
	$father = $_POST['father'];
	$mother = $_POST['mother'];
	$dob = $_POST['dob'];
	$gender = $_POST['gender'];
	$ad = $_POST['ad'];
	$contact = $_POST['contact'];
	$email = $_POST['email'];
	$last = $_POST['last'];
	$adhar = $_POST['adhar'];
	$high = $_POST['high'];
	$salary = $_POST['salary'];
	$desig = $_POST['desig'];
	$super = $_POST['super'];
	$dept = $_POST['dept'];
	$date = $_POST['date'];
	$insert = "insert into assign5 (father,mother,dob,gender,ad,contact,email,last,adhar,high,salary,design,super,dept,full,date) values ('$father','$mother','$dob','$gender','$ad','$contact','$email','$last','$adhar','$high','$salary','$desig','$super','$dept','$full','$date')";
	$res = mysqli_query($conn, $insert);
	if ($res) {
		echo 'Records Entered sucessfully';
	}
	else {
		echo 'records not entered';
	}
}
 ?>
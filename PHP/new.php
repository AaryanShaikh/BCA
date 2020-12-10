<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<?php
	$num1 = $_GET["num1"];
	$num2 = $_GET["num2"];
	$exp = $_GET["exp"];
	switch($exp){
	case "add":{
	echo $num1+$num2;
	break;
	}
	case "sub":{
	echo $num1-$num2;
	break;
	}
	case "mul":{
	echo $num1*$num2;
	break;
	}
	case "div":{
	echo $num1/$num2;
	break;
	}
}
	?>
	<form method="GET">
		<input type="number" name="num1">
		<input type="number" name="num2">
		<select name="exp">
			<option value="add">Add</option>
			<option value="sub">Subtract</option>
			<option value="mul">Multiply</option>
			<option value="div">Divide</option>
		</select>
		<input type="submit" value="submit">
	</form>
</body>
</html>
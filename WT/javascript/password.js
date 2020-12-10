var user = "Aaryan"
var pass = "X3r0.me!"
var len,num,alpha,spec = false
if (pass.length >= 8) {
	len = true
}
	for (var i = 0; i < pass.length; i++) {
	if (pass[i] >= 'a' && pass[i] <= 'z' || pass[i] >= 'A' && pass[i] <= 'Z') {
		alpha = true
	} else if(pass[i] >= 0 || pass[i] <= 9){
		num = true
	}
	else {
		spec = true
	}
}	
if (len && alpha && num && spec) {
	console.log("Successfull login")
} else {
	console.log("Please check your credentials")
}
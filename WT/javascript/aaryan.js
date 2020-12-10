function isPrime(x) {
	let flag = true
	for (let i = 2; i < x; i++) {
		if(x % i == 0){
			flag = false;
			break//for best case Scenario
		}
	}
	return flag
}
function doRev(x) {
	let num = x, rev = 0, dig = 0
	while (num != 0) {
		dig = num % 10//extract the last digit
		rev = rev * 10 + dig//reversing
		num = Math.round(num/10)//reducing the number 
	}
	return rev
}
function isPalindrome(x) {
	let rev = 0, flag = true
	rev = doRev(x)
	if (x != rev) {
		flag = false
	}
	return flag
}
function doFact(x) {
	let fact = 1
	for (let i = x; i > 1; i--) {
		fact*=i
	}
	return fact
}

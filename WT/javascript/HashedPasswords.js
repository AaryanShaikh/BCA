var pass = 'Aaryan'
var letter = []
for (let i = 0; i < pass.length; i++) {
	letter[i] = pass[i]
}
var num = 1000
var res = 0
for (var i = 0; i < letter.length; i++) {
	switch(letter[i]) {
		case 'A':
		case 'a':
			num/=1
			res+=num
			break;
		case 'B':
		case 'b':
			num/=2
			res+=num
			break;
		case 'C':
		case 'c':
			num/=3
			res+=num
			break;
		case 'D':
		case 'd':
			num/=4
			res+=num
			break;
		case 'E':
		case 'e':
			num/=5
			res+=num
			break;
		case 'F':
		case 'f':
			num/=6
			res+=num
			break;
		case 'G':
		case 'g':
			num/=7
			res+=num
			break;
		case 'H':
		case 'h':
			num/=8
			res+=num
			break;
		case 'I':
		case 'i':
			num/=9
			res+=num
			break;
		case 'J':
		case 'j':
			num/=10
			res+=num
			break;
		case 'K':
		case 'k':
			num/=11
			res+=num
			break;
		case 'L':
		case 'l':
			num/=12
			res+=num
			break;
		case 'M':
		case 'm':
			num/=13
			res+=num
			break;
		case 'N':
		case 'n':
			num/=14
			res+=num
			break;
		case 'O':
		case 'o':
			num/=15
			res+=num
			break;
		case 'P':
		case 'p':
			num/=16
			res+=num
			break;
		case 'Q':
		case 'q':
			num/=17
			res+=num
			break;
		case 'R':
		case 'r':
			num/=18
			res+=num
			break;
		case 'S':
		case 's':
			num/=19
			res+=num
			break;
		case 'T':
		case 't':
			num/=20
			res+=num
			break;
		case 'U':
		case 'u':
			num/=21
			res+=num
			break;
		case 'V':
		case 'v':
			num/=22
			res+=num
			break;
		case 'w':
		case 'w':
			num/=23
			res+=num
			break;
		case 'X':
		case 'x':
			num/=24
			res+=num
			break;
		case 'Y':
		case 'y':
			num/=25
			res+=num
			break;
		case 'Z':
		case 'z':
			num/=26
			res+=num
			break;
		default:
			num/=27
			res+=num
	}
}
console.log("Enter Your Password:Aaryan\nHashed Password:"+res)
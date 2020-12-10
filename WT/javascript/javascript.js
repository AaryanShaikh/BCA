//print the days from monday to saturday
/*
var days = ["monday","tuesday","wednesday","thursday","friday","saturday","sunday"]
for (var i = 0; i < days.length - 1; i++) {
	console.log(days[i]);
}
*/
//print the days from saturday to monday
/*
var days = ["monday","tuesday","wednesday","thursday","friday","saturday","sunday"]
for (var i = days.length - 2; i >= 0; i--) {
	console.log(days[i]);
}
*/
// shift(),unshift(),push() & pop() operations
/*
var days = ["monday","tuesday","wednesday","thursday","friday","saturday","sunday"]
console.log(days.shift());//--> Displays the first element from the array
console.log(days.unshift());//--> Displays the last index from the array
console.log(days.push("newItem"));// --> adds new item at the end of the array & displays the index of that element 
console.log(days.pop());// --> removes the last element from the array & displays it
*/
// to input an array of strings & display error if first letter of the string is 'a'
/*
var lname = ["sha","doe","perumalla","peerzade","atest"]
var name
for (var i = 0; i < lname.length; i++) {
	name = lname[i];
	if (name[0] == 'a' || name[0] == 'A') {
			console.log(lname[i]+" = Error");
		}
}
*/
//forEach loop
/*
var tasks = ["wakeup","have breakfast","code","have lunch","code","sleep"]
tasks.forEach( function(value, index) {
	console.log("My task no "+(index + 1)+" is to "+value);
});
*/
//objects in javascript
/*
var myYoutubeVideo={
	title:'animation',
	length:10,
	creator:'shahul',
	desc:'this is my video'
}
console.log(myYoutubeVideo);
console.log(`hey new video on ${myYoutubeVideo.title} by ${myYoutubeVideo.creator}`);
*/
//objects & methods in class
/*
var myDoTo={
	meet:0,
	meetdone:0,

	addMeet: function(meet){
	this.meet = this.meet + meet
	},
	meetingdone: function (meet) {
	this.meetdone = this.meetdone + meet
	},
	meetReset: function () {
	this.meetdone = 0
	this.meet = 0
	},
	summary:function () {
	return this.meet - this.meetdone	
	}
}
myDoTo.addMeet(100)
myDoTo.meetReset()
myDoTo.addMeet(5)
myDoTo.meetingdone(3)
console.log(myDoTo.summary());
*/
//Math functions
/*
var num1=3.1231313
console.log(Math.round(num1));
console.log(num1.toFixed(2));
var min=1; 
var max=6;  
var random = Math.random() * (max - min) + min; 
console.log(random);
*/
//Arrows in javascript
/*
var materials = [
	'Hydrogen',
	'Helium',
	'Lithium',
	'Beryllium',
];
console.log(materials.map(materials => materials.length));
*/
const camera = {
	price:600,
	weight:2000,
	mydesc:()=> `this canon camera is of ${this.price}$`		
}
console.log(camera.mydesc());
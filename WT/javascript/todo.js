var ul = document.getElementById("list")
var li;

var remallButton = document.getElementById("remall");
remallButton.addEventListener("click",remallItem)

var remButton = document.getElementById("rem");
remButton.addEventListener("click",remItem)

function remallItem() {
	li = ul.children
	for (var i = 0; i < li.length; i++) {
		while (li[i]) {//this is an array of an array(Nested Array)
			ul.removeChild(li[i])
		}
	}
}

function remItem() {
	li = ul.children
	for (var i = 0; i < li.length; i++) {
		while (li[i] && li[i].children[0].checked) {
			ul.removeChild(li[i])
		}
	}
}
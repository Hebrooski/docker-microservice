//function created to replace the content
function replaceContent() {
	//declaring the variables
	var myRecipientName;
	var senderName;
	
	//setting the variable to the input field's value by id
	myRecipientName = document.getElementById("recipientNameInput").value;
	senderName = document.getElementById("senderNameInput").value;
	
	//setting the HTML code in the span with the variable by id
	document.getElementById("recipientNamePlaceholder").innerHTML = myRecipientName;
	document.getElementById("senderNamePlaceholder").innerHTML = senderName;
} 
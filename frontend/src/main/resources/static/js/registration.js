var username = 'userName';
var password = 'password';
var passwordVerify = 'passwordVerify';
var firstName = 'firstName';
var lastName = 'lastName';
var email = 'email';
var phoneNum = 'phoneNumber';
var passwordVerifyMatchAlert = "passwordVerifyMatchAlert";
var passwordVerifyLengthAlert = "passwordVerifyLengthAlert";



function setInputsRequired(){
    document.getElementById(username).required = true;
    document.getElementById(password).required = true;
    document.getElementById(passwordVerify).required = true;
    document.getElementById(firstName).required = true;
    document.getElementById(lastName).required = true;
    document.getElementById(email).required = true;
    document.getElementById(phoneNum).required = true;

}

function checkPasswordVerify(){
    document.getElementById(passwordVerifyMatchAlert).style.display = 'none';
    document.getElementById(passwordVerifyLengthAlert).style.display = "none";
    var passwordVal = document.getElementById(password).value;
    var passwordVerifyVal = document.getElementById(passwordVerify).value;
    if(passwordVerifyVal != passwordVal){
        document.getElementById(passwordVerifyMatchAlert).style.display = "block";
    }else if(passwordVerifyVal.length < 8){
        document.getElementById(passwordVerifyLengthAlert).style.display = "block";
    }
}

function submitAndCreateCookie(){
    var urlParams = window.location.href.split('?')[1];
    document.cookie = urlParams;

}
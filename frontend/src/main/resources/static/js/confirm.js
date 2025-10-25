function processCookieData(){
    console.log("("+document.cookie+")");
    var urlParams = document.cookie.split('&');
    urlParams = window.location.href.split('?')[1].split('&');
    for(var i = 0; i< urlParams.length; i++){
        var keyValuePair = urlParams[i].split('=');
        var ul = document.getElementById("formDataDisplay");
        var li = document.createElement("li");
        li.appendChild(document.createTextNode(keyValuePair[0]+'='+decodeURIComponent(keyValuePair[1])));
        ul.appendChild(li);
    }
}
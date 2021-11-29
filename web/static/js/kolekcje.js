function getlinkslength(){
    var x = document.links.length;
    document.getElementById("demo").innerHTML = "Find out how many links there are in the document: "+x;
}

function getAllLinks() {
    var x = document.links;
    var txt = " URL (href) of each link in the document: <br>";
    var i;
    for (i = 0; i < x.length; i++) {
        txt = txt + x[i].href + "<br>";
    };
    document.getElementById("divraportlinkow").style.visibility="visible";
    document.getElementById("demo2").innerHTML = txt;
    window.scrollTo(0,document.body.scrollHeight);
}

function getimageslength(){
    var x = document.images.length;
    document.getElementById("demo3").innerHTML = "Find out how many <img> elements there are in the document:: "+x;
}

function getAllImages() {
    var x = document.images;
    var txt = "URL (src) of each image in the document: <br>";
    var i;
    for (i = 0; i < x.length; i++) {
        txt = txt + x[i].src + "<br>";
    } 
    document.getElementById("divraportzdjec").style.visibility="visible";
    document.getElementById("demo4").innerHTML = txt;
    window.scrollTo(0,document.body.scrollHeight);
}

function getFormLength() {
    var x = document.forms.length;
    document.getElementById("demo").innerHTML = "Number of form elements in the doccument: "+ x;
}

function getAllForms(){
    var x = document.forms[0];
    var txt = "Value of each element in the form: <br>";
    var i;
    for (i = 0; i < x.length; i++) {
    txt = txt + x.elements[i].value + "<br>";
    } 
    document.getElementById("divraportformow").style.visibility="visible";
    document.getElementById("demo2").innerHTML = txt;
    window.scrollTo(0,document.body.scrollHeight);
}


function getAnchorsLength() {
    var x = document.anchors.length;
    document.getElementById("demo5").innerHTML = "Number of anchor elements in the doccument: "+ x;
}

function getAllAnchors(){
    var x = document.anchors[0];
    var txt = "Value of each element in the form: <br>";
    var i;
    for (i = 0; i < x.length; i++) {
    txt = txt + x.elements[i].value + "<br>";
    } 

    document.getElementById("divraportanchorow").style.visibility="visible";
    document.getElementById("demo6").innerHTML = txt;
    window.scrollTo(0,document.body.scrollHeight);
}


function zmiennaczerwonetlo(){
    var nodelist = document.getElementsByTagName("div").item(3); 
    nodelist.style.backgroundColor = "red";
}
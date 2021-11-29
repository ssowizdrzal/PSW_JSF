
function showCoords (event) {
  var x1 = event.clientX;
  var y1 = event.clientY;
  var x2 = event.pageX;
  var y2 = event.pageY;
    document.getElementById("cords").innerHTML = `clientX: ${x1} clientY: ${y1} pageX: ${x2} pageY: ${y2}`;
}


function makeThemRed () {
    document.getElementById("cords").style.color = "red";
}

function makeThemGreen () {
  document.getElementById("cords").style.color = "green";
  elem1 = document.getElementById("news_footer").namedItem("cords");
}
function makeThemDefault () {
  document.getElementById("cords").style.color = "#eaecf0";

}
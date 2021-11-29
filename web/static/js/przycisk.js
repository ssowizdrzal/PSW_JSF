var resizes = 0;

window.addEventListener("resize", function () {
    while (resizes < 1) {
        window.alert("Zmieniles ekran juz " + resizes + " razy.");
        resizes = resizes + 1;
    }
});
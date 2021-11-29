var background_color = document.getElementsByName('choose_color')[0];
var font_color = document.getElementsByName('choose_font')[0];
var font_style = document.getElementsByName('font_style')[0];

background_color.addEventListener('change', function() {
    document.body.style.background = this.value;
});

font_color.addEventListener('change', function() {
    document.body.style.color = this.value;

});

font_style.addEventListener('change', function() {
    document.body.style.fontFamily  = fontFamily = this.value;
});
const messages = [
    " you are awesome! ",
    " have a wonderful day! ",
    " you've got ths! "
];

var message = messages[Math.floor(Math.random() * Math.floor(messages.length))];


document.querySelector(".greeting").append(message);
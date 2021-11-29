function showChar(e){
    console.log(e.keyCode);
    switch (e.keyCode){
        case 73:
            console.log(e.shiftKey);
            console.log(e.ctrlKey);
            console.log(e.altKey);
            if(e.shiftKey){
                window.location.href = "index.html";
            }
            
            else if (e.ctrlKey) {
                window.location.href = "html/worlds.html";
            }
            else if(e.altKey) {
                window.location.href = "html/news.html";    
            }
            break;
        default:
            break;
    }

  }
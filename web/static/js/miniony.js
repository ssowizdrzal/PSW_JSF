function minion() {
    var btn = document.createElement("BUTTON");
    //btn.setAttribute('content', 'm');
    //btn.textContent= 'm';
    document.getElementById("hodowla").appendChild(btn);
    x= Math.floor(Math.random() * (1 - 0 + 1) + 0);
    if(x===0) {
        btn.innerHTML = '<img style="height:50px;width:50px" src="https://static.wikia.nocookie.net/leagueoflegends/images/a/a4/Chaos_Minion_Melee_Render.png/revision/latest/scale-to-width-down/250?cb=20200601045237">';

    }
    else {
        btn.innerHTML = '<img style="height:50px;width:50px" src="https://static.wikia.nocookie.net/leagueoflegends/images/7/78/Order_Minion_Caster_Render.png/revision/latest?cb=20200601043520">';
    }
    btn.style.width = '50px'; 
    btn.style.height = '50px'; 
}

  function zabijminiona() {
    var list = document.getElementById("hodowla");
    y = Math.floor(Math.random() * (list.childElementCount - 0 )) + 0;
    if(y<0) y=0;
    if(y>list.childElementCount) y=childElementCount;
    list.removeChild(list.childNodes[y]);
  }

  function zrobCannona(){
     var list = document.getElementById("hodowla");
     y = Math.floor(Math.random() * (list.childElementCount - 1 )) + 1;
     if(y<0) y=0;
     if(y>list.childElementCount) y=childElementCount;

     var btn = document.createElement("BUTTON");
     btn.innerHTML = '<img style="height:50px;width:50px" src="https://static.wikia.nocookie.net/leagueoflegends/images/5/55/Chaos_Minion_Siege_Render.png/revision/latest?cb=20200601050945">';
     
     btn.style.width = '50px'; 
     btn.style.height = '50px'; 

     list.replaceChild(btn,list.childNodes[y]);
  }
  
  function cannonPoczatek(){
    var list = document.getElementById("hodowla");


    var btn = document.createElement("BUTTON");
    btn.innerHTML = '<img style="height:50px;width:50px" src="https://static.wikia.nocookie.net/leagueoflegends/images/5/55/Chaos_Minion_Siege_Render.png/revision/latest?cb=20200601050945">';
    
    btn.style.width = '50px'; 
    btn.style.height = '50px'; 

    list.insertBefore(btn,list.childNodes[0]);
  }

  function raportujLiczbeMinionow(){
    var list = document.getElementById("hodowla");
    var t = document.createTextNode("Liczba minionów: "+ list.childElementCount+ ". " );
    
    document.getElementById("demo2").appendChild(t);
  }

  function ParentNode() {
    var x = document.getElementById("hodowla").childNodes[0].parentNode.nodeName;
    document.getElementById("demo").innerHTML = x;
  }


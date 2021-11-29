role();
function role(){
    document.writeln("Polecane postacie: <br>");
var x=0;
var max=0;
var i=0;

var list = ["Top", "Jungle","Mid", "Adc","Support"];

var topek = ["Gnar", "Jayce","darius","garen","akali"];
var jng = ["rengar", "kayne","lee sin","nocturne","talon"];
var mid = ["syndra", "irelia","le blanc","azir","galio"];
var bot = ["vayne", "sivir","caitlyn","ziggs","jinx"];
var sup = ["yuumi", "soraka","sona","taric","braum"];

var j=0;


    do{

        x= Math.floor(Math.random() * (1 - 0 + 1) + 0);
        if(x===0) {
            max=3;
        }
        else {
            max=5;
        }
        document.write(list[i]+": ");

        switch(i){
            case 0:
                for(j=0; j<max; j+=1){
                    document.write(topek[j]+", " );
                }
                break;
            case 1:
                for(j=0; j<max; j+=1){
                    document.write(jng[j]+", " );
                }
                break;
            case 2:
                for(j=0; j<max; j+=1){
                    document.write( mid[j]+", ") ;
                }
                break;
            case 3:
                for(j=0; j<max; j+=1){
                    document.write(bot[j]+", ") ;
                }
                break;
            case 4:
                for(j=0; j<max; j+=1){
                    document.write(sup[j]+", " ) ;
                }
                break;
        }
        document.writeln("<br>");
        i+= 1;

    }
    while (i !== 5);
}


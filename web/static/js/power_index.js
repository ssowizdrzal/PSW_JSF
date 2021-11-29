var message1 = " What is your K + A average score?";
var message2 = " What is your cs average score?";
var message3 = " What is your death average score?";

var def_val = 1;

var read1 = window.prompt(message1,def_val);
var read2 = window.prompt(message1,def_val);
var read3 = window.prompt(message1,def_val);

var kills = parseInt (read1);
var cs = parseInt (read2);
var deaths = parseInt (read3);

var textScore = 1;
var formula = 1;
var resultMessage = 1;

function formulaGoesBrr(score1, score2, score3) {
    return (Math.pow(score1,2)+score2)/score3;
}

function writeLine(formula, textScore) {


    if (formula <= 0) {
        resultMessage=0;
    }
    if (formula <= 1) {
        resultMessage=1;
    }
    else{
        resultMessage=2;
    }
    switch (resultMessage) {
        case 0:
        case 1:
            document.write("<p> Based on your skill we recommend you to play only as support or adc (your score: "+ textScore +")</p>");
          break;
        case 2:
            document.write("<p> Based on your skill we recommend you to play top, mid or jungle (your score: "+ textScore +")</p>");
          break;
        default:
          console.log("This should never work");
      }
}

if (Number.isNaN(kills) || Number.isNaN(cs) || Number.isNaN(deaths)) {

    window.alert("Incorrect INPUT DATA!");
}
else{
    formula = formulaGoesBrr(kills,cs,deaths);
    textScore = parseFloat(formula);
    writeLine(formula, textScore);
}

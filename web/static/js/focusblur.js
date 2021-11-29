var helpCommands = [
    "Enter your name",                  // 0
    "Enter your ingame nickname",       // 1
    "Enter your contact email",         // 2    
    "Write something about yourself",   // 3
    "Chose your ingame roles",          // 4
    "Choose your gender",               // 5
    "Select your current rank",         // 6
    "You can submit form here",         // 7
    "You can clear form" ,              // 8
    ""                                  // 9
]

var helpText;

function init()
{
   helpText = document.getElementById( "helpText" );
   
   registerListeners(document.getElementById( "form_name" ), 0 );
   registerListeners(document.getElementById( "form_nickname" ), 1 );
   registerListeners(document.getElementById( "form_email" ), 2 );
   registerListeners(document.getElementById( "form_desc" ), 3 );
   registerListeners(document.getElementById( "form_role_top" ), 4 );
   registerListeners(document.getElementById( "form_role_jg" ), 4 );
   registerListeners(document.getElementById( "form_role_mid" ), 4 );
   registerListeners(document.getElementById( "form_role_bot" ), 4 );
   registerListeners(document.getElementById( "form_role_supp" ), 4 );
   registerListeners(document.getElementById( "form_gender_male" ), 5 );
   registerListeners(document.getElementById( "form_gender_female" ), 5 );
   registerListeners(document.getElementById( "form_gender_other" ), 5 );
   registerListeners(document.getElementById( "form_rank" ), 6 );
   registerListeners(document.getElementById( "form_submit" ), 7 );
   registerListeners(document.getElementById( "form_clear" ), 8 );
}

function registerListeners( object, messageNumber )
{
   object.addEventListener( "focus", 
      function() { helpText.innerHTML = helpCommands[ messageNumber ]; },
      false );
   object.addEventListener( "blur", 
      function() { helpText.innerHTML = helpCommands[ 9 ]; }, false );
} 

window.addEventListener( "load", init, false );
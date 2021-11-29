package webtime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("phoneValidatorr")
public class PhoneValidator implements Validator {

    private static final String EMAIL_PATTERN = "^[1-9]\\d{2}-\\d{3}-\\d{3}$";
    
    private Pattern pattern;
    private Matcher matcher;
        
    public PhoneValidator(){
	 pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
    
     @Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
	matcher = pattern.matcher(value.toString());
	if(!matcher.matches()){
			
		FacesMessage msg = 
			new FacesMessage("Phone validation failed.", 
						"Invalid Phone number format.");
		msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		throw new ValidatorException(msg);

	}

	}
    
}

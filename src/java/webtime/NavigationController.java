/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webtime;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped

public class NavigationController implements Serializable {
   //this managed property will read value from request parameter pageId
    @ManagedProperty(value="#{pageId}")
    private String pageId;

   //condional navigation based on pageId
   //if pageId is 1 show page1.xhtml,
   //if pageId is 2 show page2.xhtml
   //else show home.xhtml
   
   public String showPage() {
      if(pageId == null) {
         return "index";
      }
      
      if(pageId.equals("1")) {
         return "info";
      }else if(pageId.equals("2")) {
         return "Formularz";
      }else {
         return "home";
      }
   }
}

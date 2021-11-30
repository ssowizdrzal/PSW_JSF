/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webtime;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Dominik
 */


@ManagedBean( name="zamowienieBean" )
@SessionScoped
public class Zamowienie {
    public int dostawa;
    public int platnosc;
    public int zamowienie;
    
    public int getCaleZamowienie(){
        Map<String,String> params;
       
        
        return dostawa+platnosc;
        
        
    }

    public int getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(int zamowienie) {
        this.zamowienie = zamowienie;
    }
    
    
    public int getDostawa() {
        return dostawa;
    }

    public void setDostawa(int dostawa) {
        this.dostawa = dostawa;
    }

    public int getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(int platnosc) {
        this.platnosc = platnosc;
    }
}

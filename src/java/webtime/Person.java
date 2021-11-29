/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webtime;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean( name="personBean" )
@SessionScoped
public class Person implements Serializable {
    private String nazwisko;
    private String email;
    private String phone;
    private long wiek;
    private String miasto;
    private int stopien;
    
    
    public String getResult()
   {
      if ( nazwisko != null && email != null && phone != null )
         return "<p style=\"background-color:#696969;width:1000px;" +
            "padding:5px\">Name: " + getNazwisko() + "<br/>E-Mail: " +
            getEmail() + "<br/>Phone: " + getPhone() + "<br/>Miasto: " + getMiasto()+ "<br/>Stopień: " + getStopien() + "</p>";
      else
         return ""; // request has not yet been made
   } 
    
    
    
    
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getWiek() {
        return wiek;
    }

    public void setWiek(long wiek) {
        this.wiek = wiek;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getStopien() {
        return stopien;
    }

    public void setStopien(int stopien) {
        this.stopien = stopien;
    }
    
    
    
    
    
    
}

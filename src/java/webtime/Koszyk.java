/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webtime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Dominik
 */

@ManagedBean (name="koszykBean")
@SessionScoped
public class Koszyk implements Serializable {

    public String produktk;

    public List<String> produkty;
    public List<String> produkty2;
    public List<String> produkty3;
    
    public Koszyk(){
        if(produkty==null){
           produkty = new ArrayList<String>();;
        }
        if(produkty2==null){
           produkty2 = new ArrayList<String>();;
        }
        if(produkty3==null){
           produkty3 = new ArrayList<String>();;
        }

    }

    public List<String> getAllProdukty(){
        List<String> combined = new ArrayList<String>();
        combined.addAll(produkty);
        combined.addAll(produkty2);
        combined.addAll(produkty3);
        return combined;
    }
    
    public List<String> getProdukty2() {
        return produkty2;
    }

    public void setProdukty2(List<String> produkty2) {
        this.produkty2 = produkty2;
    }

    public List<String> getProdukty3() {
        return produkty3;
    }

    public void setProdukty3(List<String> produkty3) {
        this.produkty3 = produkty3;
    }

    public void setProduktk(String produkt) {
        this.produktk = produkt;
        produkty.add(produkt);
    }

    public String getProduktk() {
        return produktk;
    }

    public List<String> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<String> produkty) {
        this.produkty = produkty;
    }

   
     
    public String getResult()
   {
     return "<p style=\"background-color:#696969;width:1000px;" +
            "padding:5px\">Wybrane produkty: " + produkty.toString()+ produkty2.toString() + produkty3.toString()  + "</p>";
   } 
     public String getResult2()
   {
       String result ="<br> </br>";
       int przecinek=0;
       for(String produkt : produkty){
           if(przecinek==0){
                result = result + produkt ;
                przecinek++;
           }else{
                result = result + ", <br> </br> " + produkt ; 
           }
       }
       for(String produkt : produkty2){
           if(przecinek==0){
                result = result + produkt;
                przecinek++;
           }else{
                result = result + ", <br> </br> " + produkt; 
           }
       }for(String produkt : produkty3){
           if(przecinek==0){
                result = result + produkt ;
                przecinek++;
           }else{
                result = result + ", <br> </br>  " + produkt; 
           }
       }
     return result+". <br> </br>";
   } 
     
    public int getLacznaCena(){
        initKategorie x = new initKategorie();
        HashMap<String,Integer> map= x.getMapaWszystkiego();
        
        List<String> combined = new ArrayList<String>();
        combined.addAll(produkty);
        combined.addAll(produkty2);
        combined.addAll(produkty3);
        
        int cena=0;
        
        for(String key: map.keySet()){
            if(combined.contains(key)){
                cena=cena+map.get(key);
            }
        }
        
        return cena;
    }
    
     
    public void addProduktk(String produkt){
        produkty.add(produkt);
    }
 
    
    public int getLicznosc(){
        return produkty.size()+produkty2.size()+produkty3.size();
    }
    
}

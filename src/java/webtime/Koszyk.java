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
import javax.faces.context.FacesContext;

/**
 *
 * @author Dominik
 */

@ManagedBean (name="koszykBean")
@SessionScoped
public class Koszyk implements Serializable {

    public String produktk;

    public List<String> produkty = new ArrayList<String>();; ;
    public List<String> produkty2 = new ArrayList<String>();
    public List<String> produkty3 = new ArrayList<String>();
    
    public int dostawa;
    public int platnosc;

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
    
    public Koszyk(){

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

    public int getFinalCena(){
        return getLacznaCena()+dostawa+platnosc;
    }
     
    public String getResult()
   {
     return "<p style=\"background-color:#696969;width:1000px;" +
            "padding:5px\">Wybrane produkty: " + produkty.toString()+ produkty2.toString() + produkty3.toString()  + "</p>";
   } 
    public String getPrint(){
        String session =  FacesContext.getCurrentInstance().getExternalContext().getSession(true).toString();
        return "" + session; 
    }
    public String getResult3()
   {
       String result ="";
       int przecinek=0;
       if(produkty!=null)
       for(String produkt : produkty){
           if(przecinek==0){
                result = result + produkt ;
                przecinek++;
           }else{
                result = result + ", " + produkt ; 
           }
       }
       if(produkty2!=null)
       for(String produkt : produkty2){
           if(przecinek==0){
                result = result + produkt;
                przecinek++;
           }else{
                result = result + ", " + produkt; 
           }
       }
       if(produkty3!=null)
       for(String produkt : produkty3){
           if(przecinek==0){
                result = result + produkt ;
                przecinek++;
           }else{
                result = result + ", " + produkt; 
           }
       }
       if(przecinek==0){
           return "";
       }
     return result+".</br>";
   } 
     
     public String getResult2()
   {
       String result ="<br> </br>";
       int przecinek=0;
       if(produkty!=null)
       for(String produkt : produkty){
           if(przecinek==0){
                result = result + produkt ;
                przecinek++;
           }else{
                result = result + ", <br> </br> " + produkt ; 
           }
       }
       if(produkty2!=null)
       for(String produkt : produkty2){
           if(przecinek==0){
                result = result + produkt;
                przecinek++;
           }else{
                result = result + ", <br> </br> " + produkt; 
           }
       }
       if(produkty3!=null)
       for(String produkt : produkty3){
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

        int prod_1 = (produkty==null) ? 0 :  produkty.size();
        int prod_2 = (produkty2==null) ? 0 :  produkty2.size();
        int prod_3 = (produkty3==null) ? 0 :  produkty3.size();

        return prod_1 + prod_2 + prod_3;
    }
    
    public boolean isButton(){
        return getLicznosc()>0;
    }
    
    public void reset(){
    this.produkty = new ArrayList<String>();
    this.produkty2 = new ArrayList<String>();
    this.produkty3 = new ArrayList<String>();
    
    this.dostawa=0;
    this.platnosc=0;

    }
}

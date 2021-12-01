/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webtime;

import java.util.HashMap;


public class Kategoria {
    
    public String nazwa;
    public HashMap<String,Integer> przedmioty;
    
    
    public Kategoria(String nazwa){
        this.nazwa=nazwa;
        przedmioty = new HashMap<String,Integer>();
    }
    
    public void addPrzedmiot(String nazwa, int cena){
        przedmioty.put(nazwa,cena);
    }
   
    public HashMap<String,Integer> getPrzedmiotyZKategorii(){
        return przedmioty;
    }
    
    public String getNazwa(){
        return nazwa;
    }
    
    public boolean containsPrzedmiot(String przedmiot){
        return przedmioty.containsKey(przedmiot);
    }
    
    public int getCenaDlaPrzedmiotu(String przedmiot){
        return przedmioty.get(przedmiot);
    }
}

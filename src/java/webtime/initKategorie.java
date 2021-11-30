/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webtime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Dominik
 */
@ManagedBean(name = "kategorieBean")
@SessionScoped
public class initKategorie implements Serializable {

    public int wybor;
    public List<Kategoria> kategorie;

    public int getWybor() {
        return wybor;
    }

    public void setWybor(int wybor) {
        this.wybor = wybor;
    }


    public initKategorie() {
        kategorie = new ArrayList<Kategoria>();
        kategorie.add(new Kategoria("Slodycze"));
        kategorie.get(0).addPrzedmiot("cukierek", 1);
        kategorie.get(0).addPrzedmiot("lizak", 2);
        kategorie.get(0).addPrzedmiot("choco calzone", 13);

        kategorie.add(new Kategoria("Ubrania"));
        kategorie.get(1).addPrzedmiot("But nike", 500);
        kategorie.get(1).addPrzedmiot("Okular rayban", 900);
        kategorie.get(1).addPrzedmiot("Bielizna Cottonworld", 30);

        kategorie.add(new Kategoria("Witaminy"));
        kategorie.get(2).addPrzedmiot("Witamina C", 10);
        kategorie.get(2).addPrzedmiot("Witamina D", 20);
        kategorie.get(2).addPrzedmiot("Witamina E", 15);
    }

    public Kategoria getKategoria1() {
        return kategorie.get(0);
    }

    public Kategoria getKategoria2() {
        return kategorie.get(1);
    }

    public Kategoria getKategoria3() {
        return kategorie.get(2);
    }

    public Kategoria getKategoria() {
        return kategorie.get(wybor);
    }

    public HashMap<String, Integer> getMapaWszystkiego() {
        HashMap<String, Integer> h1 = kategorie.get(0).getPrzedmiotyZKategorii();
        HashMap<String, Integer> h2 = kategorie.get(1).getPrzedmiotyZKategorii();
        HashMap<String, Integer> h3 = kategorie.get(2).getPrzedmiotyZKategorii();
        h1.putAll(h2);
        h1.putAll(h3);

        return h1;
    }

    public boolean isShow0() {
        return wybor == 0;
    }

    public boolean isShow1() {
        return wybor == 1;
    }

    public boolean isShow2() {
        return wybor == 2;
    }
}

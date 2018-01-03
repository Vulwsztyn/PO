package com.company.model.Rynki;

import com.company.model.Aktywa.Waluta;
import com.company.model.Indeks;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


import java.util.ArrayList;

public class Gielda extends Rynek {

    private String adresSiedziby;
    private ArrayList<Indeks> listaIndeksow;

    public Gielda(String nazwa){
        this.setNazwa(nazwa);
        this.setKraj("Kambodża");
        this.setWaluta(new Waluta("Franek",new RynekWalut("a")));
        this.setMiasto("Berlin");
        this.setMarza(13.5);
    }



    public String getAdresSiedziby() {
        return adresSiedziby;
    }

    public void setAdresSiedziby(String adresSiedziby) {
        this.adresSiedziby = adresSiedziby;
    }

    public ArrayList<Indeks> getListaIndeksow() {
        return listaIndeksow;
    }

    public void setListaIndeksow(ArrayList<Indeks> listaIndeksow) {
        this.listaIndeksow = listaIndeksow;
    }

    public StringProperty getTypProperty() {
        return new SimpleStringProperty("Giełda akcji");
    }
}

package com.company.model.Aktywa;

import com.company.model.Rynki.Rynek;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Waluta extends Aktywa {
    private ArrayList<String> listaKrajow;
    private String skrot;
    public Waluta(String nazwa, Rynek rynek){
        this.setNazwa(nazwa);
        this.setRynek(rynek);
    }
    public Waluta(String nazwa,int ilosc, Rynek rynek){
        this.setNazwa(nazwa);
        this.setRynek(rynek);
        this.setIlosc(ilosc);
    }


    public StringProperty getTypProperty() {
        return new SimpleStringProperty("Waluta");
    }
}

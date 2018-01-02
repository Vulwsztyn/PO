package com.company.model.Aktywa;

import com.company.model.Rynki.Rynek;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class Waluta extends Aktywa {
    private ArrayList<String> listaKrajow;

    public Waluta(String nazwa, Rynek rynek){
        this.setNazwa(nazwa);
        this.setRynek(rynek);
    }
}

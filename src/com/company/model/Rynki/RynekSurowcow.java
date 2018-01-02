package com.company.model.Rynki;

import com.company.model.Aktywa.Waluta;
import javafx.beans.property.SimpleStringProperty;

public class RynekSurowcow extends Rynek {
    public RynekSurowcow(String nazwa){
        this.setNazwa(nazwa);
        this.setKraj("Paragwaj");
        this.setWaluta(new Waluta("Korona",new Rynek()));
        this.setMiasto("Witaszyce");
        this.setMarza(13.6);
    }
}

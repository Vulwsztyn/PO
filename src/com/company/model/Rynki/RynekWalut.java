package com.company.model.Rynki;

import com.company.model.Aktywa.Waluta;
import javafx.beans.property.SimpleStringProperty;

public class RynekWalut extends Rynek {
    public RynekWalut(String nazwa){
        this.setNazwa(nazwa);
        this.setKraj("Kambodża");
        this.setWaluta(new Waluta("Funt",new Rynek()));
        this.setMiasto("Londyn");
        this.setMarza(3.14);
    }
}

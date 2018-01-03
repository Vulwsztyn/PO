package com.company.model.Rynki;

import com.company.model.Aktywa.Waluta;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RynekSurowcow extends Rynek {
    public RynekSurowcow(String nazwa){
        this.setNazwa(nazwa);
        this.setKraj("Paragwaj");
        this.setWaluta(new Waluta("Korona",new RynekWalut("a")));
        this.setMiasto("Witaszyce");
        this.setMarza(13.6);
    }
    public StringProperty getTypProperty() {
        return new SimpleStringProperty("Rynek Surowców");
    }
}

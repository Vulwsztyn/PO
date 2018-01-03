package com.company.model.Rynki;

import com.company.model.Aktywa.Waluta;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RynekWalut extends Rynek {
    public RynekWalut(){};
    public RynekWalut(String nazwa){
        this.setNazwa(nazwa);
        this.setKraj("Kambodża");
        this.setWaluta(new Waluta("Funt",new RynekWalut()));
        this.setMiasto("Londyn");
        this.setMarza(3.14);
    }

    public StringProperty getTypProperty() {
        return new SimpleStringProperty("Rynek Walut");
    }
}

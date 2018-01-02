package com.company.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ElementListyWidocznej {
    private String nazwa;

    public StringProperty getNazwaProperty() {

        return new SimpleStringProperty(nazwa);
    }
    public String getNazwa(){

        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

}

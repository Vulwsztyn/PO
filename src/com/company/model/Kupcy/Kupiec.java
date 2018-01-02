package com.company.model.Kupcy;

import com.company.model.ElementListyWidocznej;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Kupiec extends ElementListyWidocznej{

    private String nazwisko;

    public abstract void kup();
    public abstract void sprzedaj();
    private int budzet;

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public StringProperty getTypProperty() {
        String typ=new String();
        if (this instanceof Inwestor){
            typ="Inwestor";
        }
        else if(this instanceof FunduszInwestycyjny) {
            typ = "Fundusz Inwestycyjny";
        }
        return new SimpleStringProperty(typ);
    }
    public int getBudzet() {
        return budzet;
    }

    public void setBudzet(int budzet) {
        this.budzet = budzet;
    }
}

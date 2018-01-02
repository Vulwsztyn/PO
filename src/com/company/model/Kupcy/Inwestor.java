package com.company.model.Kupcy;

import javafx.beans.property.SimpleStringProperty;

public class Inwestor extends Kupiec {
    private String PESEL;


    public Inwestor(String nazwa){
        this.setNazwa(nazwa);
    }
    public void kup(){

    }
    public void sprzedaj(){

    }
    public void kupPosrednio(){

    }
    public void sprzedajPosrednio(){

    }

    //Gettery i Settery
    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }


}

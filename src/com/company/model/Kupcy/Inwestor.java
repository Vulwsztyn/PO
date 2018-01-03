package com.company.model.Kupcy;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Inwestor extends Kupiec {
    private String nazwisko;
    private String PESEL;


    public Inwestor(String imie){
        this.setNazwa(imie);
    }
    public Inwestor(String imie,String nazwisko){
        this.setNazwa(imie);
        this.nazwisko=nazwisko;
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

    @Override
    public StringProperty getNazwaProperty() {
        return new SimpleStringProperty(this.getNazwa()+" "+this.nazwisko);
    }
}

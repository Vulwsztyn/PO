package com.company.model.Kupcy;

import javafx.beans.property.SimpleStringProperty;

public class FunduszInwestycyjny extends Kupiec{
    String zarzadca;

    public String getZarzadca() {
        return zarzadca;
    }

    public void setZarzadca(String zarzadca) {
        this.zarzadca = zarzadca;
    }

    public FunduszInwestycyjny(String nazwa){
        this.setNazwa(nazwa);
        zarzadca="Stefan";
    }

    public void kup(){

    }
    public void sprzedaj(){

    }
}

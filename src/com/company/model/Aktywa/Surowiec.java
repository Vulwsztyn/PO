package com.company.model.Aktywa;

import com.company.model.Rynki.Rynek;
import javafx.beans.property.SimpleStringProperty;

public class Surowiec extends Aktywa {
    private String jednostkaHandlowa;
    private float wartosc;
    private float wartoscMinimalna;
    private float wartoscMaksymalna;
    Waluta waluta;

    public Waluta getWaluta() {
        return waluta;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public String getJednostkaHandlowa() {
        return jednostkaHandlowa;
    }

    public void setJednostkaHandlowa(String jednostkaHandlowa) {
        this.jednostkaHandlowa = jednostkaHandlowa;
    }

    public float getWartosc() {
        return wartosc;
    }

    public void setWartosc(float wartosc) {
        this.wartosc = wartosc;
    }

    public float getWartoscMinimalna() {
        return wartoscMinimalna;
    }

    public void setWartoscMinimalna(float wartoscMinimalna) {
        this.wartoscMinimalna = wartoscMinimalna;
    }

    public float getWartoscMaksymalna() {
        return wartoscMaksymalna;
    }

    public void setWartoscMaksymalna(float wartoscMaksymalna) {
        this.wartoscMaksymalna = wartoscMaksymalna;
    }

    public Surowiec(String nazwa, Rynek rynek){
        this.setNazwa (nazwa);
        jednostkaHandlowa="uncja";
        wartoscMinimalna =3;
        wartoscMaksymalna =4;
        this.setRynek(rynek);

    }

}

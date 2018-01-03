package com.company.model;

import com.company.model.Aktywa.Spolka;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Indeks {
    private String nazwa;
    private ObservableList<Spolka> listaSpolek;
    private float wyniki;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public ObservableList<Spolka> getListaSpolek() {
        return listaSpolek;
    }

    public void setListaSpolek(ObservableList<Spolka> listaSpolek) {
        this.listaSpolek = listaSpolek;
    }

    public float getWyniki() {
        return wyniki;
    }

    public void setWyniki(float wyniki) {
        this.wyniki = wyniki;
    }
}

package com.company.model.Rynki;

import com.company.model.Indeks;


import java.util.ArrayList;

public class Gielda extends Rynek {
    private String kraj;
    private String waluta;
    private String miasto;
    private String adresSiedziby;
    private ArrayList<Indeks> listaIndeksow;

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getAdresSiedziby() {
        return adresSiedziby;
    }

    public void setAdresSiedziby(String adresSiedziby) {
        this.adresSiedziby = adresSiedziby;
    }

    public ArrayList<Indeks> getListaIndeksow() {
        return listaIndeksow;
    }

    public void setListaIndeksow(ArrayList<Indeks> listaIndeksow) {
        this.listaIndeksow = listaIndeksow;
    }
}

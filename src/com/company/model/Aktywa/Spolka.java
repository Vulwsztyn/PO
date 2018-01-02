package com.company.model.Aktywa;

import com.company.model.Rynki.Rynek;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;


import java.time.LocalDate;

public class Spolka extends Aktywa{
    private ObjectProperty<LocalDate> dataPierwszejWyceny;
    private double kursOtwarcia;
    private double kursMinimalny;
    private double kursMaksymalny;
    private double kurs;

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    private int liczbaAkcji;
    private double zysk;
    private double przychod;
    private double kapitalWlasny;
    private double kapitalZakladowy;
    //liczba akcji,ktora zmienila wlasciciela
    private int wolumen;
    //wartosc transakcji wykonanych na akcjach
    private float obroty;

    public Spolka(String nazwa,double kursOtwarcia,int liczbaAkcji,Rynek rynek){
        this.setNazwa(nazwa);
        this.kursOtwarcia=kursOtwarcia;
        this.liczbaAkcji=liczbaAkcji;
        obroty=3;
        wolumen=2;
        zysk=1;
        przychod=2;
        kapitalWlasny=3;
        kapitalZakladowy=4;
        kursMinimalny =5;
        kursMaksymalny =6;
        dataPierwszejWyceny= new SimpleObjectProperty<>(LocalDate.of(1999, 2, 21));
        this.setRynek(rynek);
    }


    public LocalDate getDataPierwszejWyceny() {
        return dataPierwszejWyceny.get();
    }

    public ObjectProperty<LocalDate> dataPierwszejWycenyProperty() {
        return dataPierwszejWyceny;
    }

    public void setDataPierwszejWyceny(LocalDate dataPierwszejWyceny) {
        this.dataPierwszejWyceny.set(dataPierwszejWyceny);
    }

    public double getKursOtwarcia() {
        return kursOtwarcia;
    }

    public void setKursOtwarcia(double kursOtwarcia) {
        this.kursOtwarcia = kursOtwarcia;
    }

    public double getKursMinimalny() {
        return kursMinimalny;
    }

    public void setKursMinimalny(double kursMinimalny) {
        this.kursMinimalny = kursMinimalny;
    }

    public double getKursMaksymalny() {
        return kursMaksymalny;
    }

    public void setKursMaksymalny(double kursMaksymalny) {
        this.kursMaksymalny = kursMaksymalny;
    }

    public int getLiczbaAkcji() {
        return liczbaAkcji;
    }

    public void setLiczbaAkcji(int liczbaAkcji) {
        this.liczbaAkcji = liczbaAkcji;
    }

    public double getZysk() {
        return zysk;
    }

    public void setZysk(double zysk) {
        this.zysk = zysk;
    }

    public double getPrzychod() {
        return przychod;
    }

    public void setPrzychod(double przychod) {
        this.przychod = przychod;
    }

    public double getKapitalWlasny() {
        return kapitalWlasny;
    }

    public void setKapitalWlasny(double kapitalWlasny) {
        this.kapitalWlasny = kapitalWlasny;
    }

    public double getKapitalZakladowy() {
        return kapitalZakladowy;
    }

    public void setKapitalZakladowy(double kapitalZakladowy) {
        this.kapitalZakladowy = kapitalZakladowy;
    }

    public int getWolumen() {
        return wolumen;
    }

    public void setWolumen(int wolumen) {
        this.wolumen = wolumen;
    }

    public float getObroty() {
        return obroty;
    }

    public void setObroty(float obroty) {
        this.obroty = obroty;
    }
}

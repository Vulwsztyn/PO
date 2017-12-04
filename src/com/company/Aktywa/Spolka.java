package com.company.Aktywa;

import java.util.Date;

public class Spolka {
    private String nazwa;
    private Date dataPierwszejWyceny;
    private double kursOtwarcia;
    private double minimalnyKurs;
    private double maksymalnyKurs;
    private int liczbaAkcji;
    private double zysk;
    private double przychod;
    private double kapitalWlasny;
    private double kapitalZakladowy;
    //liczba akcji,ktora zmienila wlasciciela
    private int wolumen;
    //wartosc transakcji wykonanych na akcjach
    private float obroty;

    public Spolka(String nazwa,double kursOtwarcia,int liczbaAkcji){
        this.nazwa=nazwa;
        this.kursOtwarcia=kursOtwarcia;
        this.liczbaAkcji=liczbaAkcji;
        obroty=0;
        wolumen=0;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getDataPierwszejWyceny() {
        return dataPierwszejWyceny;
    }

    public void setDataPierwszejWyceny(Date dataPierwszejWyceny) {
        this.dataPierwszejWyceny = dataPierwszejWyceny;
    }

    public double getKursOtwarcia() {
        return kursOtwarcia;
    }

    public void setKursOtwarcia(double kursOtwarcia) {
        this.kursOtwarcia = kursOtwarcia;
    }

    public double getMinimalnyKurs() {
        return minimalnyKurs;
    }

    public void setMinimalnyKurs(double minimalnyKurs) {
        this.minimalnyKurs = minimalnyKurs;
    }

    public double getMaksymalnyKurs() {
        return maksymalnyKurs;
    }

    public void setMaksymalnyKurs(double maksymalnyKurs) {
        this.maksymalnyKurs = maksymalnyKurs;
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

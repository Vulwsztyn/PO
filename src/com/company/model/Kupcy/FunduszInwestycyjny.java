package com.company.model.Kupcy;

public class FunduszInwestycyjny extends Kupiec{
    private String zarzadcaImie;

    public String getZarzadcaNazwisko() {
        return zarzadcaNazwisko;
    }

    public void setZarzadcaNazwisko(String zarzadcaNazwisko) {
        this.zarzadcaNazwisko = zarzadcaNazwisko;
    }

    private String zarzadcaNazwisko;

    public String getZarzadcaImie() {
        return zarzadcaImie;
    }

    public void setZarzadcaImie(String zarzadcaImie) {
        this.zarzadcaImie = zarzadcaImie;
    }

    public FunduszInwestycyjny(String nazwa){
        this.setNazwa(nazwa);
        zarzadcaImie ="Stefan";
        zarzadcaNazwisko="Schickbaum";
    }

    public void kup(){

    }
    public void sprzedaj(){

    }
}

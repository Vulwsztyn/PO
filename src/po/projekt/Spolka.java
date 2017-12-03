package po.projekt;

import java.util.Date;

public class Spolka {
    private String nazwa;
    private Date dataPierwszejWyceny;
    private float kursOtwarcia;
    private float minimalnyKurs;
    private float maksymalnyKurs;
    private int liczbaAkcji;
    private float zysk;
    private float przychod;
    private float kapitalWlasny;
    private float kapitalZakladowy;
    //liczba akcji,ktora zmienila wlasciciela
    private int wolumen;
    //wartosc transakcji wykonanych na akcjach
    private float obroty;

    public Spolka(){
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

    public float getKursOtwarcia() {
        return kursOtwarcia;
    }

    public void setKursOtwarcia(float kursOtwarcia) {
        this.kursOtwarcia = kursOtwarcia;
    }

    public float getMinimalnyKurs() {
        return minimalnyKurs;
    }

    public void setMinimalnyKurs(float minimalnyKurs) {
        this.minimalnyKurs = minimalnyKurs;
    }

    public float getMaksymalnyKurs() {
        return maksymalnyKurs;
    }

    public void setMaksymalnyKurs(float maksymalnyKurs) {
        this.maksymalnyKurs = maksymalnyKurs;
    }

    public int getLiczbaAkcji() {
        return liczbaAkcji;
    }

    public void setLiczbaAkcji(int liczbaAkcji) {
        this.liczbaAkcji = liczbaAkcji;
    }

    public float getZysk() {
        return zysk;
    }

    public void setZysk(float zysk) {
        this.zysk = zysk;
    }

    public float getPrzychod() {
        return przychod;
    }

    public void setPrzychod(float przychod) {
        this.przychod = przychod;
    }

    public float getKapitalWlasny() {
        return kapitalWlasny;
    }

    public void setKapitalWlasny(float kapitalWlasny) {
        this.kapitalWlasny = kapitalWlasny;
    }

    public float getKapitalZakladowy() {
        return kapitalZakladowy;
    }

    public void setKapitalZakladowy(float kapitalZakladowy) {
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

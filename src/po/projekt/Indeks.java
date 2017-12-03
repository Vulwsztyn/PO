package po.projekt;

import java.util.ArrayList;

public class Indeks {
    private String nazwa;
    private ArrayList<Spolka> listaSpolek;
    private float wyniki;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public ArrayList<Spolka> getListaSpolek() {
        return listaSpolek;
    }

    public void setListaSpolek(ArrayList<Spolka> listaSpolek) {
        this.listaSpolek = listaSpolek;
    }

    public float getWyniki() {
        return wyniki;
    }

    public void setWyniki(float wyniki) {
        this.wyniki = wyniki;
    }
}

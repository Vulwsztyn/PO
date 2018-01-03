package com.company.model.Rynki;

import com.company.model.Aktywa.Spolka;
import com.company.model.Aktywa.Surowiec;
import com.company.model.Aktywa.Waluta;
import com.company.model.ElementListyWidocznej;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Rynek extends ElementListyWidocznej{
    private String kraj;
    private Waluta waluta;
    private String miasto;
    private double marza;




    public double getMarza() {
        return marza;
    }

   public void setMarza(double marza) {
        this.marza = marza;
    }



    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public Waluta getWaluta() {
        return waluta;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

}

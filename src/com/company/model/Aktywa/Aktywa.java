package com.company.model.Aktywa;

import com.company.model.ElementListyWidocznej;
import com.company.model.Rynki.Rynek;
import javafx.beans.property.StringProperty;

public abstract class Aktywa extends ElementListyWidocznej{
    private Rynek rynek;
    private int ilosc;

    public int getIlosc() {
        return ilosc;
    }
    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void setRynek(Rynek rynek) {
        this.rynek = rynek;
    }

    public abstract StringProperty getTypProperty();
    public StringProperty getRynekNazwaProperty(){
        return this.rynek.getNazwaProperty();
    }

}

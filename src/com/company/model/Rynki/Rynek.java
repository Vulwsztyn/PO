package com.company.model.Rynki;

import com.company.model.Aktywa.Spolka;
import com.company.model.Aktywa.Surowiec;
import com.company.model.Aktywa.Waluta;
import com.company.model.ElementListyWidocznej;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Rynek extends ElementListyWidocznej{
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

    public StringProperty getTypProperty() {
        String typ=new String();
        if (this instanceof Gielda){
            typ="Giełda akcji";
        }
        else if(this instanceof RynekSurowcow){
            typ="Rynek Surowców";
        }
        else if(this instanceof RynekWalut){
            typ="Rynek Walut";
        }
        return new SimpleStringProperty(typ);
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

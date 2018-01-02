package com.company.model.Aktywa;

import com.company.model.ElementListyWidocznej;
import com.company.model.Rynki.Rynek;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aktywa extends ElementListyWidocznej{
    private Rynek rynek;

    public void setRynek(Rynek rynek) {
        this.rynek = rynek;
    }

    public StringProperty getTypProperty() {
        String typ=new String();
        if (this instanceof Spolka){
            typ="Akcja";
        }
        else if(this instanceof Surowiec){
            typ="Surowiec";
        }
        else if(this instanceof Waluta){
            typ="Waluta";
        }
        else {
            typ="błąd";
        }
        return new SimpleStringProperty(typ);
    }
    public StringProperty getRynekProperty(){
        return this.rynek.getNazwaProperty();
    }

}

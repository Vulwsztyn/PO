package com.company.model.Aktywa;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class JednostkaUczestnictwa extends Aktywa {
    public StringProperty getTypProperty() {
        return new SimpleStringProperty("Surowiec");
    }
}

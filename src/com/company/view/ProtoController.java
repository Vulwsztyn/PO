package com.company.view;

import com.company.model.Ekonomia;
import com.company.model.ElementListyWidocznej;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public abstract class ProtoController {
    // Reference to the Ekonomia class
    private Ekonomia ekonomia;

    /**
     * Is called by the Ekonomia class to give a reference back to itself.
     *
     * @param eko Ekonomia class
     */
    public void setEkonomia(Ekonomia eko) {
        this.ekonomia = eko;
    }
    public abstract void wypelnijTabelka();

    public Ekonomia getEkonomia() {
        return ekonomia;
    }
}

package com.company.view.Dodawanie;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.stage.Stage;

public class PanelDodawaniaController {
    @FXML
    ComboBox whatToAddChoice;
    @FXML
    ComboBox walutaBox;
    @FXML
    ComboBox typRynkuBox;


    private Stage dialogStage;

    @FXML
    private void initialize() {
        ObservableList<String> availableChoices = FXCollections.observableArrayList("Spolka","Surowiec","Waluta","Rynek","Inwestor","Fundusz");
        whatToAddChoice.setItems(availableChoices);
        whatToAddChoice.setValue("Spolka");
        ObservableList<String> typyRynkow=FXCollections.observableArrayList("Giełda","Rynek Surowców","Rynek Walut","Rynek Jendostek Uczestnictwa");
        typRynkuBox.setItems(typyRynkow);
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
}

package com.company.view.Zakladki;

import com.company.model.Rynki.Rynek;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RynkiController extends ProtoTabController {
    @FXML
    private TableView<Rynek> tabelka;
    @FXML
    private TableColumn<Rynek, String> nazwaColumn;
    @FXML
    private TableColumn<Rynek, String> typColumn;

    @FXML
    private Label gieldaNazwa;
    @FXML
    private Label gieldaKraj;
    @FXML
    private Label gieldaWaluta;
    @FXML
    private Label gieldaMiasto;
    @FXML
    private Label gieldaMarza;


    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public RynkiController() {
    }

    @FXML
    private void initialize() {
        nazwaColumn.setCellValueFactory(
                cellData -> cellData.getValue().getNazwaProperty());
        typColumn.setCellValueFactory(
                cellData -> cellData.getValue().getTypProperty());
        showVerseDetails(null);


        tabelka.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showVerseDetails(newValue));
    }

    private void showVerseDetails(Rynek wiersz) {
        if(wiersz!=null){
            gieldaNazwa.setText(wiersz.getNazwa());
            gieldaKraj.setText(wiersz.getKraj());
            gieldaWaluta.setText(wiersz.getWaluta().getNazwa());
            gieldaMiasto.setText(wiersz.getMiasto());
            gieldaMarza.setText(String.valueOf(wiersz.getMarza()));
        }
    }

    public void wypelnijTabelka() {
        tabelka.setItems(this.getEkonomia().getListaRynkow());
    }
}

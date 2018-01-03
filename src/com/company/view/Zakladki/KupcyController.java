package com.company.view.Zakladki;

import com.company.model.Aktywa.Aktywa;
import com.company.model.Kupcy.FunduszInwestycyjny;
import com.company.model.Kupcy.Inwestor;
import com.company.model.Kupcy.Kupiec;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

public class KupcyController extends ProtoTabController {
    @FXML
    private TableView<Kupiec> tabelka;
    @FXML
    private TableColumn<Kupiec, String> nazwaColumn;
    @FXML
    private TableColumn<Kupiec, String> typColumn;
    @FXML
    private TableColumn<Aktywa, String> gieldaColumn;

    //Inwertor Labels
    @FXML
    private Label inwesrotPESEL;
    @FXML
    private Label inwesrotImie;
    @FXML
    private Label inwesrotNazwisko;
    @FXML
    private Label inwesrotBudzet;

    //Fundusz Labels
    @FXML
    private Label funduszNazwa;
    @FXML
    private Label funduszZarzadca;
    @FXML
    private Label funduszBudzet;

    @FXML
    private GridPane gridInwestor;
    @FXML
    private GridPane gridFundusz;

    @FXML
    private TableView<Aktywa> posiadaneAktywa;
    @FXML
    private TableColumn<Aktywa, String> nazwaAktywaColumn;
    @FXML
    private TableColumn<Aktywa, String> iloscColumn;

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

    private void showVerseDetails(Kupiec wiersz) {
        if (wiersz != null) {
            if (wiersz instanceof Inwestor) {
                hideGrids(gridInwestor);
                inwesrotImie.setText(String.valueOf(((Inwestor) wiersz).getNazwa()));
                inwesrotNazwisko.setText(String.valueOf(((Inwestor) wiersz).getNazwisko()));
                inwesrotPESEL.setText(String.valueOf(((Inwestor) wiersz).getPESEL()));
                inwesrotBudzet.setText(String.valueOf(((Inwestor) wiersz).getBudzet()));

            } else if (wiersz instanceof FunduszInwestycyjny) {
                hideGrids(gridFundusz);
                funduszNazwa.setText(String.valueOf(((FunduszInwestycyjny) wiersz).getNazwa()));
                funduszBudzet.setText(String.valueOf(((FunduszInwestycyjny) wiersz).getBudzet()));
                funduszZarzadca.setText(String.valueOf(((FunduszInwestycyjny) wiersz).getZarzadca()));


            }
        }
        else{
            hideAllGrids();
        }
    }
    private void hideGrids(GridPane pane){
        hideAllGrids();
        pane.setVisible(true);

    }
    public void hideAllGrids(){
//        gridFundusz.setVisible(false);
//       gridInwestor.setVisible(false);

    }
    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public KupcyController() {
    }


    public void wypelnijTabelka() {
        tabelka.setItems(this.getEkonomia().getListaKupcow());
    }
}

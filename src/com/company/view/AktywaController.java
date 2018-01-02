package com.company.view;

import com.company.model.Aktywa.Aktywa;
import com.company.model.Aktywa.Spolka;
import com.company.model.Aktywa.Surowiec;
import com.company.model.Aktywa.Waluta;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

public class AktywaController extends ProtoController{
    @FXML
    private TableView<Aktywa> tabelka;
    @FXML
    private TableColumn<Aktywa, String> nazwaColumn;
    @FXML
    private TableColumn<Aktywa, String> typColumn;
    @FXML
    private TableColumn<Aktywa, String> rynekColumn;

    @FXML
    private GridPane gridWaluta;
    @FXML
    private GridPane gridSurowiec;
    @FXML
    private GridPane gridSpolka;

    //Spolka Labels
    @FXML
    private Label spolkaNazwa;
    @FXML
    private Label spolkaData;
    @FXML
    private Label spolkaKursOtwarcia;
    @FXML
    private Label spolkaKursAktualny;
    @FXML
    private Label spolkaKursMinimalny;
    @FXML
    private Label spolkaKursMaksymalny;
    @FXML
    private Label spolkaLiczbaAkcji;
    @FXML
    private Label spolkaZysk;
    @FXML
    private Label spolkaPrzychod;
    @FXML
    private Label spolkaKapitalWlasny;
    @FXML
    private Label spolkaKapitalZakladowy;
    @FXML
    private Label spolkaWolumen;
    @FXML
    private Label spolkaObroty;

    //Surowiec Labels
    @FXML
    private Label surowiecNazwa;
    @FXML
    private Label surowiecJednostka;
    @FXML
    private Label surowiecWaluta;
    @FXML
    private Label surowiecWartoscAktualna;
    @FXML
    private Label surowiecWartoscMinimalna;
    @FXML
    private Label surowiecWartoscMaksymalna;

    //Waluta Labels
    @FXML
    private Label walutaNazwa;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public AktywaController() {
    }

    @FXML
    private void initialize() {
        nazwaColumn.setCellValueFactory(
                cellData -> cellData.getValue().getNazwaProperty());
        typColumn.setCellValueFactory(
                cellData -> cellData.getValue().getTypProperty());
        rynekColumn.setCellValueFactory(
                cellData -> cellData.getValue().getRynekProperty());

        showVerseDetails(null);


        tabelka.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showVerseDetails(newValue));
    }

    private void showVerseDetails(Aktywa wiersz) {
        if (wiersz != null) {
            if (wiersz instanceof Spolka) {
                hideGrids(gridSpolka);
                spolkaNazwa.setText(String.valueOf(((Spolka) wiersz).getNazwa()));
                spolkaData.setText(String.valueOf(((Spolka) wiersz).getDataPierwszejWyceny()));
                spolkaKursOtwarcia.setText(String.valueOf(((Spolka) wiersz).getKursOtwarcia()));
                spolkaKursAktualny.setText(String.valueOf(((Spolka) wiersz).getKurs()));
                spolkaKursMinimalny.setText(String.valueOf(((Spolka) wiersz).getKursMinimalny()));
                spolkaKursMaksymalny.setText(String.valueOf(((Spolka) wiersz).getKursMaksymalny()));
                spolkaLiczbaAkcji.setText(String.valueOf(((Spolka) wiersz).getLiczbaAkcji()));
                spolkaZysk.setText(String.valueOf(((Spolka) wiersz).getZysk()));
                spolkaPrzychod.setText(String.valueOf(((Spolka) wiersz).getPrzychod()));
                spolkaKapitalWlasny.setText(String.valueOf(((Spolka) wiersz).getKapitalWlasny()));
                spolkaKapitalZakladowy.setText(String.valueOf(((Spolka) wiersz).getKapitalZakladowy()));
                spolkaWolumen.setText(String.valueOf(((Spolka) wiersz).getWolumen()));
                spolkaObroty.setText(String.valueOf(((Spolka) wiersz).getObroty()));
            } else if (wiersz instanceof Surowiec) {
                hideGrids(gridSurowiec);
                surowiecNazwa.setText(String.valueOf(((Surowiec) wiersz).getNazwa()));
                surowiecJednostka.setText(String.valueOf(((Surowiec) wiersz).getJednostkaHandlowa()));
                surowiecWaluta.setText(String.valueOf(((Surowiec) wiersz).getWaluta()));
                surowiecWartoscAktualna.setText(String.valueOf(((Surowiec) wiersz).getWartosc()));
                surowiecWartoscMinimalna.setText(String.valueOf(((Surowiec) wiersz).getWartoscMinimalna()));
                surowiecWartoscMaksymalna.setText(String.valueOf(((Surowiec) wiersz).getWartoscMaksymalna()));
            } else if (wiersz instanceof Waluta) {
                hideGrids(gridWaluta);
                walutaNazwa.setText(String.valueOf(((Waluta) wiersz).getNazwa()));
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
//        gridSpolka.setVisible(false);
//        gridSurowiec.setVisible(false);
//        gridWaluta.setVisible(false);
    }

        @Override
    public void wypelnijTabelka() {
        tabelka.setItems(this.getEkonomia().getListaAktywow());
    }
}

package com.company.view.Dodawanie;

import com.company.model.Ekonomia;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.*;

public class PanelDodawaniaController {
    @FXML
    ComboBox whatToAddChoice;
    @FXML
    ComboBox walutaBox;
    @FXML
    ComboBox typRynkuBox;


    @FXML
    TextField tfSpolkaNazwa;
    @FXML
    TextField tfSpolkaKurs;
    @FXML
    TextField tfSpolkaLiczbaAkcji;
    @FXML
    TextField tfSpolkaKapitalWlasny;
    @FXML
    TextField tfSpolkaKapitalZakladowy;
    @FXML
    TextField tfSpolkaWartosc;
    public Map<String,TextField> Spolkatfs = new HashMap<String, TextField>() {};


    private Stage dialogStage;
    Ekonomia ekonomia;

    @FXML
    private void initialize() {

        {
            Spolkatfs.put("Nazwa",tfSpolkaNazwa);
            Spolkatfs.put("Kurs",tfSpolkaKurs);
            Spolkatfs.put("Liczba Akcji",tfSpolkaLiczbaAkcji);
            Spolkatfs.put("Kapitał Własny",tfSpolkaKapitalWlasny);
            Spolkatfs.put("Kapitał Zakładowy",tfSpolkaKapitalZakladowy);
            Spolkatfs.put("Wartość",tfSpolkaWartosc);
        }
    }
    public void wypelnij(Ekonomia eko){
        this.ekonomia=eko;
        setComboBoxes();
        initLos();
    }

    public void setComboBoxes(){

        ObservableList<String> availableChoices = FXCollections.observableArrayList("Spolka","Surowiec","Waluta","Rynek","Inwestor","Fundusz");
        whatToAddChoice.setItems(availableChoices);
        whatToAddChoice.setValue("Spolka");
        ObservableList<String> typyRynkow=FXCollections.observableArrayList("Giełda","Rynek Surowców","Rynek Walut","Rynek Jendostek Uczestnictwa");
        typRynkuBox.setItems(typyRynkow);


    }

    public void initLos(){
    losFundusz();
    losInwestor();
    losRynek();
    losSpolka();
    losSurowiec();
    losWaluta();

    }

    public void losInwestor(){

    }

    public void losFundusz(){

    }
    public void losWaluta(){

    }
    public void losSpolka(){

        //tfSpolkaNazwa.setText(ekonomia.getLosowaRzecz("Firmy"));
        Spolkatfs.get("Nazwa").setText(ekonomia.getLosowaRzecz("Firmy"));
        List<String> lista = Arrays.asList("Kurs", "Liczba Akcji", "Kapitał Własny", "Kapitał Zakładowy");
        List<Double> mins = Arrays.asList(0.01,100.0,5000.0,10000.0);
        List<Double> maxs = Arrays.asList(5.0,10000.0,50000.0,100000.0);
        for(int i=0;i<lista.size();i++){
            setLosHajs(Spolkatfs.get(lista.get(i)),mins.get(i),maxs.get(i));

            }
        //"Wartość"
    }
    public void setLosHajs(TextField tf,double min,double max){
        tf.setText(String.valueOf(getRandomKwota(min,max)));
    }
    public void losRynek(){

    }
    public void losSurowiec(){

    }

    public double getRandomKwota(Double min, Double max){
        min*=100;
        max*=100;
        int min10=min.intValue();
        int max10=max.intValue();
        int wynik= new Random().nextInt(max10-min10);
        return wynik/100.0;

    }
    public int getRandomInt(int min,int max){
        return new Random().nextInt(max-min)+min;
    }
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
}

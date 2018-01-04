package com.company.view.Dodawanie;

import com.company.model.Ekonomia;
import com.company.util.RandomUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.*;

import static com.company.util.RandomUtil.*;

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

    @FXML
    TextField tfRynekNazwa;
    @FXML
    TextField tfRynekKraj;
    @FXML
    TextField tfRynekMiasto;
    @FXML
    TextField tfRynekUlica;
    @FXML
    TextField tfRynekMarza;

    @FXML
    TextField tfWalutaNazwa;
    @FXML
    TextField tfWalutaSkrot;
    @FXML
    TextField tfWalutaWartosc;

    @FXML
    TextField tfFunduszNazwa;
    @FXML
    TextField tfFunduszZarzadca;
    @FXML
    TextField tfFunduszBudzet;

    @FXML
    TextField tfInwestorImie;
    @FXML
    TextField tfInwestorNazwisko;
    @FXML
    TextField tfInwestorPESEL;
    @FXML
    TextField tfInwestorBudzet;

    @FXML
    TextField tfSurowiecNazwa;
    @FXML
    TextField tfSurowiecJednostka;
    @FXML
    TextField tfSurowiecWartosc;


    private Map<String,TextField> Spolkatfs = new HashMap<String, TextField>() {};
    private Map<String,TextField> Inwesrtotfs = new HashMap<String, TextField>() {};
    private Map<String,TextField> Fundusztfs = new HashMap<String, TextField>() {};
    private Map<String,TextField> Surowiectfs = new HashMap<String, TextField>() {};
    private Map<String,TextField> Walutatfs = new HashMap<String, TextField>() {};
    private Map<String,TextField> Rynektfs = new HashMap<String, TextField>() {};

    private Stage dialogStage;
    Ekonomia ekonomia;

    @FXML
    private void initialize() {
            Spolkatfs.put("Nazwa",tfSpolkaNazwa);
            Spolkatfs.put("Kurs",tfSpolkaKurs);
            Spolkatfs.put("Liczba Akcji",tfSpolkaLiczbaAkcji);
            Spolkatfs.put("Kapitał Własny",tfSpolkaKapitalWlasny);
            Spolkatfs.put("Kapitał Zakładowy",tfSpolkaKapitalZakladowy);
            Spolkatfs.put("Wartosc",tfSpolkaWartosc);

        Inwesrtotfs.put("Imie",tfInwestorImie);
        Inwesrtotfs.put("Nazwisko",tfInwestorNazwisko);
        Inwesrtotfs.put("PESEL",tfInwestorPESEL);
        Inwesrtotfs.put("Budzet",tfInwestorBudzet);

        Fundusztfs.put("Nazwa",tfFunduszNazwa);
        Fundusztfs.put("Zarzadca",tfFunduszZarzadca);
        Fundusztfs.put("Budzet",tfFunduszBudzet);


        Surowiectfs.put("Nazwa",tfSurowiecNazwa);
        Surowiectfs.put("Jednostka",tfSurowiecJednostka);
        Surowiectfs.put("Wartosc",tfSurowiecWartosc);

        Walutatfs.put("Nazwa",tfWalutaNazwa);
        Walutatfs.put("Skrot",tfWalutaSkrot);
        Walutatfs.put("Wartosc",tfWalutaWartosc);

        Rynektfs.put("Nazwa",tfRynekNazwa);
        Rynektfs.put("Kraj",tfRynekKraj);
        Rynektfs.put("Miasto",tfRynekMiasto);
        Rynektfs.put("Ulica",tfRynekUlica);
        Rynektfs.put("Marza",tfRynekMarza);



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
        Inwesrtotfs.get("Imie").setText(ekonomia.getRand().getLosowaRzecz("Imiona"));
        Inwesrtotfs.get("Nazwisko").setText(ekonomia.getRand().getLosowaRzecz("Nazwiska"));
        Inwesrtotfs.get("PESEL").setText(getRandomPESEL());
        Inwesrtotfs.get("Budzet").setText(getRandomKwotaasString(5000.0,50000.0));
    }

    public void losFundusz(){
        Fundusztfs.get("Nazwa").setText(ekonomia.getRand().getLosowaRzecz("Firmy"));
        Fundusztfs.get("Zarzadca").setText(ekonomia.getRand().getLosowaRzecz("Imiona")+" "+ekonomia.getRand().getLosowaRzecz("Nazwiska"));
        Fundusztfs.get("Budzet").setText(getRandomKwotaasString(5000.0,50000.0));
    }

    public void losWaluta(){
        Walutatfs.get("Nazwa").setText(ekonomia.getRand().getLosowaRzecz("Waluty"));
        Walutatfs.get("Skrot").setText(Walutatfs.get("Nazwa").getText().substring(0,3).toUpperCase());
        Walutatfs.get("Wartosc").setText((RandomUtil.getRandomKwotaasString(0.1,5.0)));
    }

    public void losSpolka(){

        //tfSpolkaNazwa.setText(ekonomia.getLosowaRzecz("Firmy"));
        Spolkatfs.get("Nazwa").setText(ekonomia.getRand().getLosowaRzecz("Firmy"));

        List<String> lista = Arrays.asList("Kurs" , "Kapitał Własny", "Kapitał Zakładowy");
        List<Double> mins = Arrays.asList(0.01,5000.0,10000.0);
        List<Double> maxs = Arrays.asList(5.0,50000.0,100000.0);
        for(int i=0;i<lista.size();i++){
            setLosHajs(Spolkatfs.get(lista.get(i)),mins.get(i),maxs.get(i));
            }
        Spolkatfs.get("Liczba Akcji").setText(getRandomIntasString(100,5000));
        Spolkatfs.get("Wartosc").setText(String.valueOf(Math.round(Integer.parseInt(Spolkatfs.get("Liczba Akcji").getText())*Double.parseDouble(Spolkatfs.get("Kurs").getText())*100)/100));
    }
    public void setLosHajs(TextField tf,double min,double max){

        tf.setText(getRandomKwotaasString(min,max));
    }
    public void losRynek(){
        Rynektfs.get("Nazwa").setText(ekonomia.getRand().getLosowaRzecz("Rynki"));
        Rynektfs.get("Kraj").setText(ekonomia.getRand().getLosowaRzecz("Kraje"));
        Rynektfs.get("Miasto").setText(ekonomia.getRand().getLosowaRzecz("Miasta"));
        Rynektfs.get("Ulica").setText(getUlicaSkrot()+" "+ekonomia.getRand().getLosowaRzecz("Ulice")+" "+getRandomIntasString(0,1000)+"/"+getRandomIntasString(0,1000));
        Rynektfs.get("Marza").setText(getRandomKwotaasString(0.01,0.2));
    }
    public void losSurowiec(){
        Surowiectfs.get("Nazwa").setText(ekonomia.getRand().getLosowaRzecz("Surowce"));
        Surowiectfs.get("Jednostka").setText(getJednostkaPrzedrostek()+ekonomia.getRand().getLosowaRzecz("Jednostki"));
        Surowiectfs.get("Wartosc").setText(getRandomKwotaasString(0.01,5000.0));
    }


    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
}

package com.company.model;

import com.company.model.Aktywa.Aktywa;
import com.company.model.Aktywa.Spolka;
import com.company.model.Aktywa.Surowiec;
import com.company.model.Aktywa.Waluta;
import com.company.model.Kupcy.FunduszInwestycyjny;
import com.company.model.Kupcy.Inwestor;
import com.company.model.Kupcy.Kupiec;
import com.company.model.Rynki.Gielda;
import com.company.model.Rynki.Rynek;
import com.company.model.Rynki.RynekSurowcow;
import com.company.model.Rynki.RynekWalut;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ekonomia {
    private int licznikWiadomosci=0;
    /**
     * The data as an observable list of Aktywa.
     */
    private ObservableList<Aktywa> listaAktywow = FXCollections.observableArrayList();
    /**
     * The data as an observable list of Rynek.
     */
    private ObservableList<Rynek> listaRynkow = FXCollections.observableArrayList();
    /**
     * The data as an observable list of Kupiec.
     */
    private ObservableList<Kupiec> listaKupcow = FXCollections.observableArrayList();

    public ObservableList<Aktywa> getListaAktywow() {
        return listaAktywow;
    }

    public ObservableList<Rynek> getListaRynkow() {
        return listaRynkow;
    }

    public ObservableList<Kupiec> getListaKupcow() {
        return listaKupcow;
    }

    public Ekonomia() {

    }

    public void Symulacja(){
        listaRynkow.add(new Gielda("Gielda1"));
        listaRynkow.add(new RynekSurowcow("Sur1"));
        listaRynkow.add(new RynekWalut("Walut1"));
        listaRynkow.forEach((a)->print(a.getNazwa()));
        listaAktywow.add(new Spolka("Hans", 13,3,listaRynkow.get(0)));
        listaAktywow.add(new Waluta("Denar",listaRynkow.get(2)));
        listaAktywow.add(new Surowiec("Koza",listaRynkow.get(1)));
        listaAktywow.forEach((a)->print(a.getNazwa()));
        listaKupcow.add(new Inwestor("Rudolf"));
        listaKupcow.add(new FunduszInwestycyjny("Kra Sp.z.o"));
        listaKupcow.forEach((a)->print(a.getNazwa()));

    }
    public void print(String text){
        licznikWiadomosci++;
        LocalDateTime now = LocalDateTime.now();
        String czas = DateTimeFormatter.ofPattern("HH:mm:ss").format(now);
        String spacje = new String(new char[11-2*Integer.toString(licznikWiadomosci).length()]).replace("\0", " ");
        System.out.println(licznikWiadomosci+spacje+czas+"   "+text);
    }
}

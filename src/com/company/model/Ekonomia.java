package com.company.model;

import com.company.Main;
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

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

    public transient Set<String> losoweImiona;
    public transient Set<String> losoweNazwiska;
    public transient Set<String> losoweFirmy = new HashSet<String>();
    public transient Set<String> losoweRynki;
    public transient Set<String> losoweSurowce;
    public transient Set<String> losoweWaluty;
    Main main;

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

    public Ekonomia(Main main) {
        this.main = main;
    }
    public void Symulacja(){
        initEkonomii();
        listaRynkow.add(new Gielda("Gielda1"));
        listaRynkow.add(new RynekSurowcow("Sur1"));

        listaRynkow.forEach((a)->print(a.getNazwa()));
        listaAktywow.add(new Spolka("Hans", 13,3,listaRynkow.get(1)));

        listaAktywow.add(new Surowiec("Koza",listaRynkow.get(2)));
        listaAktywow.forEach((a)->print(a.getNazwa()));

        listaKupcow.add(new FunduszInwestycyjny("Kra Sp.z.o"));
        listaKupcow.forEach((a)->print(a.getNazwa()));

    }

    public void initEkonomii(){
        wczytajLosowe();
        listaRynkow.add(new RynekWalut("Kaczogrodzki Rynek Walut"));
        listaAktywow.add(new Waluta("Pierwsza Dziesięciocentówka",1,listaRynkow.get(0)));
        listaKupcow.add(new Inwestor("Sknerus","McKwacz"));
    }

    public void wczytajLosowe() {

        wczytajZPliku(losoweFirmy, "Firmy");
    }

    public void wczytajZPliku(Set<String> lista,String loc){
        String dir="src/com/company/model/randomStuff/";
        String txt=".txt";
        loc=dir+loc+txt;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(loc));
            String line;
            int a=0;
            while((line=reader.readLine())!=null){
                lista.add(line);
                a++;
            }
            print(String.valueOf(a));
        }
        catch(IOException e){
            print("Nie znajduje pliku:{");
        }
    }

    public void print(String text){
        licznikWiadomosci++;
        LocalDateTime now = LocalDateTime.now();
        String czas = DateTimeFormatter.ofPattern("HH:mm:ss").format(now);
        String spacje = new String(new char[11-2*Integer.toString(licznikWiadomosci).length()]).replace("\0", " ");
        String s=licznikWiadomosci+spacje+czas+"   "+text+"\n";
        try {
            String newString = new String(s.getBytes(), "UTF8");
            main.getRootLayoutController().getConsoleOutputTextArea().appendText(newString);
        }
        catch(UnsupportedEncodingException e){
            System.out.println("Nie supportuje urf-8:{");
        }
    }
}

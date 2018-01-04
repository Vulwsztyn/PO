package com.company.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RandomUtil {
    public static double getRandomKwota(Double min, Double max){
        min*=100;
        max*=100;
        int min10=min.intValue();
        int max10=max.intValue();
        int wynik= new Random().nextInt(max10-min10);
        return wynik/100.0;

    }
    public static String getRandomKwotaasString(Double min, Double max){
        return String.valueOf(getRandomKwota( min,  max));
    }


    public static int getRandomInt(int min, int max){
        return new Random().nextInt(max-min)+min;
    }
    public static String getRandomIntasString(int min, int max){return String.valueOf(getRandomInt(min,max));}
    public static String getRandomPESEL(){
      StringBuilder PESEL= new StringBuilder();
      for (int i=0;i<9;i++){
          PESEL.append(getRandomIntasString(0, 10));
      }
      return PESEL.toString();
    };
    public static String getUlicaSkrot(){
        List<String> lista = Arrays.asList("Os.", "Ul.", "Al.", "al.", "Plac");
        int size = lista.size();
        int index = new Random().nextInt(size);
        return lista.get(index);
    };

    public static String getJednostkaPrzedrostek(){
        List<String> lista = Arrays.asList("Mili","Mega","Kilo","Mikro","Tera","Deka","Decy","Giga","Nano");
        int size = lista.size();
        int index = new Random().nextInt(size);
        return lista.get(index);
    };

    private transient Map<String, ArrayList<String>> losowe = new HashMap<String, ArrayList<String>>();

    public Map<String, ArrayList<String>> getLosowe() {
        return losowe;
    }
    public String getLosowaRzecz(String KtoraLista){
        int size = losowe.get(KtoraLista).size();
        int index = new Random().nextInt(size);
        return losowe.get(KtoraLista).get(index);
    }
    public void wczytajLosowe() {
        List<String> lista = Arrays.asList("Firmy", "Imiona", "Nazwiska", "Rynki", "Surowce", "Waluty","Kraje","Miasta","Ulice","Jednostki");
        lista.forEach((e)->losowe.put(e,wczytajZPlikuLosowe(e)));
    }

    public ArrayList<String> wczytajZPlikuLosowe( String loc){
        ArrayList<String> lista = new ArrayList<String>();
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
        }
        catch(IOException e){
            System.out.println("Nie znajduje pliku:{");
        }
        return lista;
}}

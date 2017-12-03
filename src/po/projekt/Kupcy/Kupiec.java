package po.projekt.Kupcy;

public abstract class Kupiec {
    private String imie;
    private String nazwisko;

    public abstract void kup();
    public abstract void sprzedaj();

    //Settery
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    //Gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}

package po.projekt.Kupcy;

public class Inwestor extends Kupiec {
    private String PESEL;
    private int budzetInwestycyjny;

    public void kup(){

    }
    public void sprzedaj(){

    }
    public void kupPosrednio(){

    }
    public void sprzedajPosrednio(){

    }

    //Gettery i Settery
    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public int getBudzetInwestycyjny() {
        return budzetInwestycyjny;
    }

    public void setBudzetInwestycyjny(int budzetInwestycyjny) {
        this.budzetInwestycyjny = budzetInwestycyjny;
    }
}

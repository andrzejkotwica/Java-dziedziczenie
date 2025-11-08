package ProgramGlowny;

public class Pojazd   {

    private String Numerejestracyjny;
    private String model;
    private String marka;
    private int rokProdukcji;

    public Pojazd(String nrumerejestracyjny, String model, String marka, int rokProdukcji) {
        Numerejestracyjny = nrumerejestracyjny;
        this.model = model;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }

    public String getNumerejestracyjny() {
        return Numerejestracyjny;
    }

    public void setNumerejestracyjny(String numerejestracyjny) {
        Numerejestracyjny = numerejestracyjny;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}

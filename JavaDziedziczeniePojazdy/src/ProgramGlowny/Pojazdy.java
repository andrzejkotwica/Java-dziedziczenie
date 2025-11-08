package ProgramGlowny;

public class Pojazdy {
    public static void main(String[] args) {
        Pojazd pojazd1 = new Pojazd("TSK222", "Opel", "Astra", 1999);
        Tools tool = new Tools();
        tool.printer(pojazd1);
    }
}

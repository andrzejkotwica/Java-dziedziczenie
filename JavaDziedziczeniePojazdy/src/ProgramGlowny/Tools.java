package ProgramGlowny;

public class Tools {



    public  void printer (Pojazd pojazd)
    {
        System.out.println("Numer rejestracyjny:" + pojazd.getNumerejestracyjny());
        System.out.println("Marka: " + pojazd.getMarka());
        System.out.println("Model: " + pojazd.getModel());
        System.out.println("Rok produkcji:  " + pojazd.getRokProdukcji());
    }
}

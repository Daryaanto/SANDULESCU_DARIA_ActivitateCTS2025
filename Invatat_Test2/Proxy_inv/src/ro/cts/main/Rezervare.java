package ro.cts.main;

public class Rezervare implements IRezervare{



    @Override
    public void rezerva(String nume, int nrPers) {
        System.out.println("Rezervare " + nume + " Nr pers: " + nrPers);

    }
}

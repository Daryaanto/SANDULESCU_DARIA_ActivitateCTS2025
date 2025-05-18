package ro.cts.modules;

public class Rezervare implements IRezervare {
    @Override
    public void rezerva(String nume, int nr) {
        System.out.println("Rezervare " + nume + " Nr pers: " + nr);
    }
}

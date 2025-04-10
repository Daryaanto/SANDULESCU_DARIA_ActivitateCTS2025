package cts.sandulescu.daria.factorymethod.modules;

public class Asistenta extends APersonalSpital{
    private int atentie;

    public Asistenta(String nume, int salariu, int atentie) {
        super(nume, salariu);
        this.atentie = atentie;
    }

    @Override
    public void atentie() {
        System.out.println("Asistenta: " + atentie);
    }
}

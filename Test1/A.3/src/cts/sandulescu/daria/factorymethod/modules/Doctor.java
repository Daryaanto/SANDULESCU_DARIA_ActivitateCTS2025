package cts.sandulescu.daria.factorymethod.modules;

public class Doctor extends APersonalSpital{
    private int atentie;

    public Doctor(String nume, int salariu, int atentie) {
        super(nume, salariu);
        this.atentie = atentie;
    }


    @Override
    public void atentie() {
        System.out.println("Doctor atentie: " + atentie);
    }
}

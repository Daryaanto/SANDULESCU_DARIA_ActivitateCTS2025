package cts.sandulescu.daria.factorymethod.modules;

public class Contabil extends APersonalSpital{
    private String ciocolata;

    public Contabil(String nume, int salariu, String ciocolata) {
        super(nume, salariu);
        this.ciocolata = ciocolata;
    }

    @Override
    public void atentie() {
        System.out.println("Fara atentie, dar ciocolata " + ciocolata);
    }
}

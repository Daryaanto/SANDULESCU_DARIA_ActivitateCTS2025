package cts.sandulescu.daria.factorymethod.modules;

public class Manager extends APersonalSpital{
    private String ciocolata;

    public Manager(String nume, int salariu, String ciocolata) {
        super(nume, salariu);
        this.ciocolata = ciocolata;
    }


    @Override
    public void atentie() {
        System.out.println("El e atent");
    }
}

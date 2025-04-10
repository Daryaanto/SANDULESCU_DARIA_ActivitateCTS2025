package cts.sandulescu.daria.factorymethod.modules;

public abstract class APersonalSpital {
    private String nume;
    private int salariu;


    public APersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("APersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    public abstract void atentie();
}

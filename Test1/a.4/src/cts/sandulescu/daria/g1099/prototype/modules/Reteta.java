package cts.sandulescu.daria.g1099.prototype.modules;

public class Reteta extends AReteta {

    public Reteta(String numePacient, String numeDoctor, String numeMedicament, boolean compensate, int datiFolosire) {
        super(numePacient, numeDoctor, numeMedicament, compensate, datiFolosire);
    }

    public Reteta() {
    }

    @Override
    public AReteta clonare() {
        Reteta ret = new Reteta();
        ret.numePacient = this.numePacient;
        ret.numeDoctor = this.numeDoctor;
        ret.numeMedicament = this.numeMedicament;
        ret.compensate = this.compensate;
        ret.datiFolosire = this.datiFolosire;
        return ret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", numeDoctor='").append(numeDoctor).append('\'');
        sb.append(", numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compensate=").append(compensate);
        sb.append(", datiFolosire=").append(datiFolosire);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void citire() {
        System.out.println("Citeste reteta");

    }


}

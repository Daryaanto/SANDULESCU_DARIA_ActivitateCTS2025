package cts.sandulescu.daria.g1099.prototype.modules;

public abstract class AReteta {

    protected String numePacient;
    protected String numeDoctor;
    protected String numeMedicament;
    protected boolean compensate;
    protected int datiFolosire;

    protected AReteta(String numePacient, String numeDoctor, String numeMedicament, boolean compensate, int datiFolosire) {
        this.numePacient = numePacient;
        this.numeDoctor = numeDoctor;
        this.numeMedicament = numeMedicament;
        this.compensate = compensate;
        this.datiFolosire = datiFolosire;
    }

    public AReteta() {
        this.numePacient = "nimeni";
        this.numeDoctor = "leontin";
        this.numeMedicament = "xanax";
        this.compensate = false;
        this.datiFolosire = 3;
    }



    public abstract AReteta clonare();
    public abstract void citire();

}

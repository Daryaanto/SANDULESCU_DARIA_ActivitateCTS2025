package cts.sandulescu.daria.g1099.classes;

import java.util.Arrays;

public abstract class ARezervare {

    protected String nume;
    protected int nrPaturi;
    protected float pret;
    protected int nrPersoane;
    protected String[] persoane;

    //optional
    protected boolean isFumator;
    protected boolean hasBalcon;
    protected int nrBai;

    protected ARezervare() {
        this.nume = "Leontin";

            this.nrPaturi = 1;

        this.pret = 0;
        this.nrPersoane = 0;
        this.persoane = new String[]{"nimeni"};
        this.isFumator = true;
        this.hasBalcon = false;
        this.nrBai = 0;
    }

    public ARezervare(String nume, int nrPaturi, float pret, int nrPersoane, String[] persoane, boolean isFumator, boolean hasBalcon, int nrBai) {
        this.nume = nume;
        this.nrPaturi = (nrPaturi > 0) ? nrPaturi : 1;
        this.pret = pret;
        this.nrPersoane = nrPersoane;
        this.persoane = Arrays.copyOf(persoane, persoane.length);
        this.isFumator = isFumator;
        this.hasBalcon = hasBalcon;
        this.nrBai=nrBai;
}



    public abstract ARezervare clonare();
}

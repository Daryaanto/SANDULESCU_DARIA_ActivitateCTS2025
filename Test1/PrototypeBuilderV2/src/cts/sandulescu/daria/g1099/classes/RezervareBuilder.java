package cts.sandulescu.daria.g1099.classes;

import java.util.Arrays;

public class RezervareBuilder implements IBuilder{



    protected String nume;
    protected int nrPaturi;
    protected float pret;
    protected int nrPersoane;
    protected String[] persoane;

    //optional
    protected boolean isFumator;
    protected boolean hasBalcon;
    protected int nrBai;

    public RezervareBuilder() {
        this.nume = "Leontin";
        this.nrPaturi = 2;
        this.pret = 250;
        this.nrPersoane = 2;
        this.persoane = new String[]{"leontin", "leontina"};
        this.isFumator = true;
        this.hasBalcon = true;
        this.nrBai = 1;
    }

    @Override
    public Rezervare buildRezervare(String nume, int nrPaturi, float pret) {
        return new Rezervare(nume,nrPaturi,pret,this.nrPersoane,this.persoane,this.isFumator,this.isFumator,this.nrBai);
    }



    @Override
    public IBuilder setNrPersoane(int nrPersoane) {
        this.nrPersoane=nrPersoane;
        return this;
    }

    @Override
    public IBuilder setPersoane(String[] persoane) {
        this.persoane = Arrays.copyOf(persoane, persoane.length);

        return this;
    }

    @Override
    public IBuilder setFumator(boolean fumator) {
        this.isFumator = fumator;
        return this;
    }

    @Override
    public IBuilder setHasBalcon(boolean hasBalcon) {
        this.hasBalcon = hasBalcon;
        return this;
    }

    @Override
    public IBuilder setNrBai(int nrBai) {
        this.nrBai = nrBai;
        return this;
    }
}

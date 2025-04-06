package ro.cts.classes;

public abstract class AMeniu {
    protected int nrProduse;
    protected String culoareCoperta;
    protected String nume;
    protected int nrPagini;
    protected float coperto;

    public AMeniu(int nrProduse, String culoareCoperta, String nume, int nrPagini, float coperto) {
        this.nrProduse = nrProduse;
        this.culoareCoperta = culoareCoperta;
        this.nume = nume;
        this.nrPagini = nrPagini;
        this.coperto = coperto;
    }

    public AMeniu() {
        this.nrProduse = 0;
        this.culoareCoperta = "neagra";
        this.nume = "anonim";
        this.nrPagini = 0;
        this.coperto = 0;
    }

    public abstract AMeniu clonare();
    public  abstract void comanda();


}

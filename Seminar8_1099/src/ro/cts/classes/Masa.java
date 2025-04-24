package ro.cts.classes;

public class Masa {
    private boolean esteLibera;
    private int nrMasa;
    private int nrPers;

    public Masa(boolean esteLibera, int nrMasa, int nrPers) {
        this.esteLibera = esteLibera;
        this.nrMasa = nrMasa;
        this.nrPers = nrPers;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPers() {
        return nrPers;
    }
}

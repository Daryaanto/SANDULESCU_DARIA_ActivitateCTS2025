package ro.cts.classes;

public class Firma {
    private String nume;
    private int cifra;
    private String adresa;
    private int nrAngajati;

    protected Firma(String nume, int cifra, String adresa, int nrAngajati) {
        this.nume = nume;
        this.cifra = cifra;
        this.adresa = adresa;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Firma{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cifra=").append(cifra);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}

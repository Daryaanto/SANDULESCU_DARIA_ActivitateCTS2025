package ro.cts.modules;

public class Produs {
    private float pret;
    private String nume;
    private boolean estePreparat;

    public Produs(float pret, String nume, boolean estePreparat) {
        this.pret = pret;
        this.nume = nume;
        this.estePreparat = estePreparat;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEstePreparat() {
        return estePreparat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("pret=").append(pret);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", estePreparat=").append(estePreparat);
        sb.append('}');
        return sb.toString();
    }
}

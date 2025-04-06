package ro.cts.classes;

public class Meniu extends AMeniu {

    public Meniu(int nrProduse, String culoareCoperta, String nume, int nrPagini, float coperto) {
        super(nrProduse, culoareCoperta, nume, nrPagini, coperto);
    }

    public Meniu() {
    }

    @Override
    public AMeniu clonare() {
        Meniu m= new Meniu();
        m.coperto=this.coperto;
        m.nume=this.nume;
        m.nrPagini=this.nrPagini;
        m.nrProduse=this.nrProduse;
        m.culoareCoperta=this.culoareCoperta;
        return m;
    }

    @Override
    public void comanda() {
        System.out.println("Adu un meniu, garcon!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meniu{");
        sb.append("nrProduse=").append(nrProduse);
        sb.append(", culoareCoperta='").append(culoareCoperta).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrPagini=").append(nrPagini);
        sb.append(", coperto=").append(coperto);
        sb.append('}');
        return sb.toString();
    }
}

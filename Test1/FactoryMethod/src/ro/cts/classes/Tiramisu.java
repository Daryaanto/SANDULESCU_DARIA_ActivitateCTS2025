package ro.cts.classes;

public class Tiramisu extends FelMancare{
    private boolean extraCoco;
    private int nrFelii;

    public Tiramisu(float pret, int cantitate, boolean extraCoco, int nrFelii) {
        super(pret, cantitate);
        this.extraCoco = extraCoco;
        this.nrFelii = nrFelii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tiramisu{");
        sb.append("extraCoco=").append(extraCoco);
        sb.append(", nrFelii=").append(nrFelii);
        sb.append(", pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}

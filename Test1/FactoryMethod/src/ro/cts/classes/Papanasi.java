package ro.cts.classes;

public class Papanasi extends FelMancare{
    private boolean cuGem;
    private String aroma;

    public Papanasi(float pret, int cantitate, boolean cuGem, String aroma) {
        super(pret, cantitate);
        this.cuGem = cuGem;
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Papanasi{");
        sb.append("cuGem=").append(cuGem);
        sb.append(", aroma='").append(aroma).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}

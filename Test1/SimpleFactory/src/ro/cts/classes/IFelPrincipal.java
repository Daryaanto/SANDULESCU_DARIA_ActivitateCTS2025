package ro.cts.classes;

public abstract class IFelPrincipal {
    private int cantitate;
    private float pret;
    private String restaurant;
    private boolean garnitura;

    public IFelPrincipal(int cantitate, float pret, String restaurant, boolean garnitura) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.restaurant = restaurant;
        this.garnitura = garnitura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IFelPrincipal{");
        sb.append("cantitate=").append(cantitate);
        sb.append(", pret=").append(pret);
        sb.append(", restaurant='").append(restaurant).append('\'');
        sb.append(", garnitura=").append(garnitura);
        sb.append('}');
        return sb.toString();
    }

    public abstract void serveste();
}

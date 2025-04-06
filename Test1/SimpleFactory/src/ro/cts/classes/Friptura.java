package ro.cts.classes;

public class Friptura extends IFelPrincipal{

    private String nivel;
    private String tip;

    public Friptura(int cantitate, float pret, String restaurant, boolean garnitura, String nivel, String tip) {
        super(cantitate, pret, restaurant, garnitura);
        this.nivel = nivel;
        this.tip = tip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Friptura{");
        sb.append("nivel='").append(nivel).append('\'');
        sb.append(", tip='").append(tip).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void serveste() {
        System.out.println("Mananc friptura calda!");
    }


}

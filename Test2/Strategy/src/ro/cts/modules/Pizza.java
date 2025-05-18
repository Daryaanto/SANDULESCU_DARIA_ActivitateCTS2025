package ro.cts.modules;

public class Pizza {
    private String pizzaName;
    private float pret;
    private float dimensiune;
    private IPizza tipBlat;

    public Pizza(String pizzaName, float pret, float dimensiune) {
        this.pizzaName = pizzaName;
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.tipBlat = new Subtire("Subtire");
    }

    public void setTipBlat(IPizza tipBlat) {
        this.tipBlat = tipBlat;
    }

    public void gatestePizza(String tipBlat){
        this.tipBlat.blat(tipBlat);
    }
}

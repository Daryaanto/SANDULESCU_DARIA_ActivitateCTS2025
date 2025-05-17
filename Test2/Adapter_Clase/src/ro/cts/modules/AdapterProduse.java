package ro.cts.modules;

public class AdapterProduse extends ProdusRestaurant implements IProdusDelivery{

    public AdapterProduse(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void livrareProdus() {
        super.aduNotaGrason();
    }
}

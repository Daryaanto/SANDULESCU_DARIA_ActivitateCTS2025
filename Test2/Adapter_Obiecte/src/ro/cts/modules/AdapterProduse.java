package ro.cts.modules;

public class AdapterProduse extends ProdusDelivery{
    private ProdusRestaurant produsOriginal;

    public AdapterProduse( ProdusRestaurant produsOriginal) {
        super(produsOriginal.getNume(), produsOriginal.getPret(),10);
        this.produsOriginal = produsOriginal;
    }

    public void livrareProdus() {
        produsOriginal.aduNotaGrason();
    }
}

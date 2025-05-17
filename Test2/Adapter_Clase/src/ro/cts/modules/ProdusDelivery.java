package ro.cts.modules;

public class ProdusDelivery implements IProdusDelivery {
    private String nume;
    private float pret;
    private int km;

    public ProdusDelivery(String nume, float pret, int km) {
        this.nume = nume;
        this.pret = pret;
        this.km = km;
    }
    @Override
    public void livrareProdus(){
        System.out.println("se livreaza produsul "+ this.nume);
        if(this.km<3){
            System.out.println("livrare gratuita");
        }
        else{
            System.out.println("livrarea costa "+this.pret/4);
        }
    }
}

package ro.cts.main;

import ro.cts.modules.AdapterProduse;
import ro.cts.modules.ProdusDelivery;
import ro.cts.modules.ProdusRestaurant;

public class Main {
    public static void produseLivrare(ProdusDelivery produsDelivery) {
        System.out.println("Livram produsul: ");
        produsDelivery.livrareProdus();
    }
    public static void main(String[] args) {
        ProdusDelivery produsDelivery1= new ProdusDelivery("cartofi prajiti",10,2);
        ProdusDelivery produsDelivery2= new ProdusDelivery("pizza",20,5);

        produseLivrare(produsDelivery1);
        produseLivrare(produsDelivery2);

        ProdusRestaurant produsRestaurant1= new ProdusRestaurant("friptura",50);
        ProdusRestaurant produsRestaurant2= new ProdusRestaurant("paste",40);

        produseLivrare(new AdapterProduse(produsRestaurant1));
        produseLivrare(new AdapterProduse(produsRestaurant2));

    }
}
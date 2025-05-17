package ro.cts.main;

import ro.cts.modules.AdapterProduse;
import ro.cts.modules.IProdusDelivery;
import ro.cts.modules.Livrator;
import ro.cts.modules.ProdusDelivery;

public class Main {
    public static void main(String[] args) {
        Livrator livrator= new Livrator("Amir", true);
        IProdusDelivery produsDelivery = new ProdusDelivery("pizza",30,2);

        livrator.glovo(produsDelivery);

        AdapterProduse adapterProduse= new AdapterProduse("burger",40);
        livrator.glovo(adapterProduse);
//        adapterProduse.aduNotaGrason();
    }
}
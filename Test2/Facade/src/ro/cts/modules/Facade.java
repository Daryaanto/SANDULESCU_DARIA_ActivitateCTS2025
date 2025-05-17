package ro.cts.modules;

import org.w3c.dom.ls.LSOutput;

public class Facade {
    public String statusProdus(Produs produs){
        Livrare livrator= new Livrare();
        Preluare preluare = new Preluare();
        if(produs.isEstePreparat()){
            if(preluare.esteRidicat(produs)){
                if(livrator.esteLivrat(produs)){
                    return produs.toString();
                }
                else{
                    return "Produsul se livreaza";

                }
            }
            else return "Produsul se ridica";
        }
        else {
            return "Produsul se prepara";
        }
    }
}

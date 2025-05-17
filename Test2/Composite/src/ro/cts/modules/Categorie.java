package ro.cts.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Categorie implements Structura{
    private String nume;
    private List<Structura> lista;


    public Categorie(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<Structura>();
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
        this.lista.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
this.lista.remove(structura);
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
       return this.lista.get(index);
    }

    @Override
    public void descriereStructura(String indent) {
        System.out.println(indent + "Categroia " + this.nume + ": ");
        for (Structura structura : this.lista) {
            structura.descriereStructura(indent + "\t");
        }
    }
}

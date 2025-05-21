package ro.cts.classes;

public class Ghiseu3 extends GhiseuAbstract{

    @Override
    public void recomanda(int nrPile) {
        if (nrPile>0){
            System.out.println("Poftiti aici");
        }
        else{
            System.out.println("Nu la mine, la colega");
            super.getNext().recomanda(nrPile);
        }
    }
}

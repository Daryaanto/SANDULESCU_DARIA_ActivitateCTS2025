package ro.cts.classes;

public class Ghiseu2 extends GhiseuAbstract{
    @Override
    public void recomanda(int nrPile) {
        if (nrPile>3){
            System.out.println("Poftiti aici");
        }
        else{
            System.out.println("Nu la mine, la colega");
            super.getNext().recomanda(nrPile);
        }
    }
}

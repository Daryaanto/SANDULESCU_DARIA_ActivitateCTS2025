package ro.cts.classes;

public abstract class GhiseuAbstract {
    private GhiseuAbstract next;

    public GhiseuAbstract getNext() {
        return next;
    }
    public void setNext(GhiseuAbstract next) {
        this.next = next;
    }

    public abstract void recomanda(int nrPile);
}

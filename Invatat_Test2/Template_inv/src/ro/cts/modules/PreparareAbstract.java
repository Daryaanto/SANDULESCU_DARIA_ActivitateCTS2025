package ro.cts.modules;

public abstract class PreparareAbstract {


    protected abstract void spala();
    protected abstract void taie();
    protected abstract void coace();
    protected abstract void serveste();


    public final void preparare() {
        System.out.println("Preparare: ");
        spala();
        taie();
        coace();
        serveste();
    }

}

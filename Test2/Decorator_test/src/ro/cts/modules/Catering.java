package ro.cts.modules;

public class Catering extends DecoratorLocale{


    public Catering(Local local) {
        super(local);
    }

    @Override
    protected void meniu() {
        System.out.println("La catering se serveste ciorba");
    }
}

package ro.cts.modules;

public class StreetFood extends DecoratorLocale{


    public StreetFood(Local local) {
        super(local);
    }

    @Override
    protected void meniu() {
        System.out.println("La StreetFood se servesc Burgeri");
    }
}

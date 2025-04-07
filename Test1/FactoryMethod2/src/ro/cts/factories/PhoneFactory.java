package ro.cts.factories;

import ro.cts.classes.Produs;
import ro.cts.classes.Samsung;
import ro.cts.classes.Telefoane;
import ro.cts.classes.iPhone;

public class PhoneFactory implements IFactory{
    private boolean edgeScreen;
    private int nrCamere;

    public PhoneFactory(boolean edgeScreen, int nrCamere) {
        this.edgeScreen = edgeScreen;
        this.nrCamere = nrCamere;
    }


    @Override
    public Produs getProduse(TipProdus p, int durata, String culoare) {
        return switch (p){
            case Telefoane.iPhone -> new iPhone(durata,culoare,nrCamere);
            case Telefoane.Samsung -> new Samsung(durata,culoare,edgeScreen);
            default -> null;
        };
    }
}

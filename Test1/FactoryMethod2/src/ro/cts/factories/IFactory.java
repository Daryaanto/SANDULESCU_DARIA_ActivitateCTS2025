package ro.cts.factories;

import ro.cts.classes.Produs;

public interface IFactory {
    public Produs getProduse(TipProdus p, int durata, String culoare);
}

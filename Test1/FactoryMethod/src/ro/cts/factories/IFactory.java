package ro.cts.factories;

import ro.cts.classes.FelMancare;

public interface IFactory {
    FelMancare getFelMancare(TipFelMancare tipFelMancare, float pret, int cantitate);
}

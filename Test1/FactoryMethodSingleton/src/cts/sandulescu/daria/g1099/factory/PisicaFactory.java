package cts.sandulescu.daria.g1099.factory;

import cts.sandulescu.daria.g1099.classes.AAnimal;
import cts.sandulescu.daria.g1099.classes.BritishShorthair;
import cts.sandulescu.daria.g1099.classes.MaineCoon;

public class PisicaFactory implements IFactory{

    private String mancarePreferata;
    private String decoratiune;

    public PisicaFactory(String mancarePreferata, String decoratiune) {
        this.mancarePreferata = mancarePreferata;
        this.decoratiune = decoratiune;
    }


    @Override
    public AAnimal getAnimal(ITipAnimal tipAnimal, String nume, int varsta) {
       return switch (tipAnimal) {
            case TipPisica.BritishShorthair -> new BritishShorthair(nume, varsta,mancarePreferata,decoratiune);
            case TipPisica.MaineCoon -> new MaineCoon(nume,varsta,mancarePreferata,decoratiune);
            default -> null;
        };
    }
}

package cts.sandulescu.daria.g1099.factory;

import cts.sandulescu.daria.g1099.classes.AAnimal;
import cts.sandulescu.daria.g1099.classes.Bichon;
import cts.sandulescu.daria.g1099.classes.Rottweiler;

public class CainiFactory implements IFactory {

    private int nivelLatrat;
    private int nrPlimbari;
    private static CainiFactory instance=null;

    private CainiFactory(int nivelLatrat, int nrPlimbari) {
        this.nivelLatrat = nivelLatrat;
        this.nrPlimbari = nrPlimbari;
    }

    public synchronized static CainiFactory getInstance(int nivelLatrat, int nrPlimbari) {
        if(instance==null) {
            instance=new CainiFactory(nivelLatrat,nrPlimbari);

        }
        return instance;

    }


    @Override
    public AAnimal getAnimal(ITipAnimal tipAnimal, String nume, int varsta) {
        return switch (tipAnimal){
            case TipCaine.Bichon -> new Bichon(nume,varsta, nivelLatrat, nrPlimbari);
            case TipCaine.Rottweiler -> new Rottweiler(nume,varsta, nivelLatrat, nrPlimbari);
            default -> null;
        };
    }
}

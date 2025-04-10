package cts.sandulescu.daria.factorymethod.factories;

import cts.sandulescu.daria.factorymethod.modules.APersonalSpital;
import cts.sandulescu.daria.factorymethod.modules.Contabil;
import cts.sandulescu.daria.factorymethod.modules.Manager;

public class NonMedicalFactory implements IFactory {
    private String ciocolata;

    public NonMedicalFactory(String ciocolata) {
        this.ciocolata = ciocolata;
    }

    @Override
    public APersonalSpital getPersonal(IPersonal tip, String nume, int salariu) {
        return switch (tip){
            case NonMedical.CONTABIL -> new Contabil(nume,salariu,ciocolata);
            case NonMedical.MANAGER -> new Manager(nume,salariu,ciocolata);
            default -> null;
        };
    }
}

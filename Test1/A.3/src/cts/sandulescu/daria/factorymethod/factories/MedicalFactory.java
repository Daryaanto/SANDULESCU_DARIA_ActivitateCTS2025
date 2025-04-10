package cts.sandulescu.daria.factorymethod.factories;

import cts.sandulescu.daria.factorymethod.modules.APersonalSpital;
import cts.sandulescu.daria.factorymethod.modules.Asistenta;
import cts.sandulescu.daria.factorymethod.modules.Doctor;

public class MedicalFactory implements IFactory {

    private int atentie;

    public MedicalFactory(int atentie) {
        this.atentie = atentie;
    }

    @Override
    public APersonalSpital getPersonal(IPersonal tip, String nume, int salariu) {
        return switch (tip){
            case Medical.ASISTENTA -> new Asistenta(nume,salariu,atentie);
            case Medical.DOCTOR -> new Doctor(nume,salariu,atentie);
            default -> null;
        };
    }
}

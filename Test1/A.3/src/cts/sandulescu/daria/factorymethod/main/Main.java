package cts.sandulescu.daria.factorymethod.main;

import cts.sandulescu.daria.factorymethod.factories.Medical;
import cts.sandulescu.daria.factorymethod.factories.MedicalFactory;
import cts.sandulescu.daria.factorymethod.factories.NonMedical;
import cts.sandulescu.daria.factorymethod.factories.NonMedicalFactory;
import cts.sandulescu.daria.factorymethod.modules.APersonalSpital;
import cts.sandulescu.daria.factorymethod.modules.Asistenta;

public class Main {
    public static void main(String[] args) {

        MedicalFactory medicalFactory=new MedicalFactory(1000);
        NonMedicalFactory nonMedicalFactory=new NonMedicalFactory("Leonidas");

        APersonalSpital asistenta= medicalFactory.getPersonal(Medical.ASISTENTA,"Leontina",5000);
        APersonalSpital doctor = medicalFactory.getPersonal(Medical.DOCTOR,"Leontin",15000);

        APersonalSpital contabil= nonMedicalFactory.getPersonal(NonMedical.CONTABIL,"Dragomir",6000);
        APersonalSpital patron=nonMedicalFactory.getPersonal(NonMedical.MANAGER,"Leon",20000);

        asistenta.atentie();
        doctor.atentie();
        contabil.atentie();
        patron.atentie();
    }
}
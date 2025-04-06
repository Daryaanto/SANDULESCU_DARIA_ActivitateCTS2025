package ro.cts.main;

import ro.cts.classes.Desert;
import ro.cts.classes.FelMancare;
import ro.cts.classes.Senvis;
import ro.cts.factories.FactoryDesert;
import ro.cts.factories.FactorySenvis;
import ro.cts.factories.IFactory;

public class Main {
    public static void main(String[] args) {
        IFactory fabricaDesert=new FactoryDesert(true, "afine", false, 2);
        IFactory fabricaSenvis=new FactorySenvis("sasesc", true, 1, "neagra");

        FelMancare papanasi= fabricaDesert.getFelMancare(Desert.Papanasi,25,500);
        FelMancare tiramisu=fabricaDesert.getFelMancare(Desert.Tiramisu,40,400);

        FelMancare senvisSalam=fabricaSenvis.getFelMancare(Senvis.SenvisSalam,15,250);
        FelMancare senvisSunca=fabricaSenvis.getFelMancare(Senvis.SenvisSunca,12,250);

        System.out.println(papanasi.toString());
        System.out.println(tiramisu.toString());
        System.out.println(senvisSalam.toString());
        System.out.println(senvisSunca.toString());


    }
}
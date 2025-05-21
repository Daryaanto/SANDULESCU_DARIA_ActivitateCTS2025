package ro.cts.main;

import ro.cts.classes.GrupParlamentar;
import ro.cts.classes.Parlamentar;
import ro.cts.classes.Structura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Structura partid1= new GrupParlamentar("PSD");
        Structura partid2= new GrupParlamentar("AUR");

        Structura membru1= new Parlamentar("Ponta");
        Structura membru2= new Parlamentar("Ciolacu");
        Structura membru3= new Parlamentar("Simion");
        Structura membru4= new Parlamentar("Nicusor");

        partid1.add(membru1);
        partid1.add(membru2);
        partid2.add(membru3);

        List<Structura> parlament = new ArrayList<>();
        parlament.add(partid1);
        parlament.add(partid2);
        parlament.add(membru4);

        for (Structura structura : parlament) {
            structura.descriere("");
        }
    }
}
package ro.cts.modules;

import ro.cts.main.IRezervare;
import ro.cts.main.Rezervare;
import ro.cts.main.RezervareProxy;

public class Main {
    public static void main(String[] args) {

        IRezervare rezervare=new Rezervare();
        IRezervare rezervareProxy= new RezervareProxy();

        rezervare.rezerva("Daria",3);
        rezervareProxy.rezerva("Daria",3);

    }
}
package ro.cts.main;

import ro.cts.modules.IRezervare;
import ro.cts.modules.ProxyNumeClient;
import ro.cts.modules.Rezervare;
import ro.cts.modules.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new RezervareProxy(rezervare);
        proxy.rezerva("Mihai Popescu", 2);
        proxy.rezerva("Gigel Ionescu", 5);

        IRezervare proxyCompus = new ProxyNumeClient(proxy);
        proxyCompus.rezerva("Pop Irina", 2);
        proxyCompus.rezerva("Pop", 5);
        proxyCompus.rezerva("Pop Irina", 5);
    }
}
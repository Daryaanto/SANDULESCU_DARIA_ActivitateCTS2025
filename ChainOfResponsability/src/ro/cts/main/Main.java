package ro.cts.main;

import ro.cts.classes.*;

public class Main {
    public static void main(String[] args) {
        AInfoTransport troleibuz= new Troleibuz();
        AInfoTransport tramvai= new Tramvai();
        AInfoTransport autobuz= new Autobuz();
        AInfoTransport metrou= new Metrou();

        troleibuz.setNext(autobuz);
        autobuz.setNext(tramvai);
        tramvai.setNext(metrou);

        troleibuz.recomandaTransport(2);
        troleibuz.recomandaTransport(14);
        troleibuz.recomandaTransport(7);
        troleibuz.recomandaTransport(4);


    }
}
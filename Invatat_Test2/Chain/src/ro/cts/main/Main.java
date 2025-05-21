package ro.cts.main;

import ro.cts.classes.*;

public class Main {
    public static void main(String[] args) {

        GhiseuAbstract ghiseu1=new Ghiseu1();
        GhiseuAbstract ghiseu2=new Ghiseu2();
        GhiseuAbstract ghiseu3=new Ghiseu3();
        GhiseuAbstract ghiseu4=new Ghiseu4();

        ghiseu1.setNext(ghiseu2);
        ghiseu2.setNext(ghiseu3);
        ghiseu3.setNext(ghiseu4);

        ghiseu1.recomanda(7);
        ghiseu1.recomanda(4);
        ghiseu1.recomanda(2);
        ghiseu1.recomanda(0);


    }
}
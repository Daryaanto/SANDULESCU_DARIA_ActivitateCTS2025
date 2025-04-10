package cts.sandulescu.daria.g1099.prototype.main;

import cts.sandulescu.daria.g1099.prototype.modules.AReteta;
import cts.sandulescu.daria.g1099.prototype.modules.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta retetaPr=new Reteta("Leon","Leontin","nurofen",true,10);
        Reteta retetaPr2=new Reteta("Ion","Yona","ceva",true,1);

        AReteta reteta=retetaPr.clonare();
        System.out.println(retetaPr2);

        System.out.println(retetaPr);
        System.out.println(reteta);

        reteta.citire();
        retetaPr.citire();
        retetaPr2.citire();

    }
}
package cts.sandulescu.daria.g1099.main;

import cts.sandulescu.daria.g1099.classes.AAnimal;
import cts.sandulescu.daria.g1099.classes.Bichon;
import cts.sandulescu.daria.g1099.factory.*;

public class Main {
    public static void main(String[] args) {

        IFactory dogs =  CainiFactory.getInstance(100,2);
        IFactory dogs2 = CainiFactory.getInstance(10,6);
        IFactory cats = new PisicaFactory("peste","fundita");
        IFactory cats2 = new PisicaFactory("lapte","clopotel");

        AAnimal bichon=dogs.getAnimal(TipCaine.Bichon,"Elsa",10);
        AAnimal rottweiler= dogs2.getAnimal(TipCaine.Rottweiler,"Max",2);

        AAnimal british=cats.getAnimal(TipPisica.BritishShorthair,"Korra", 2);
        AAnimal maine= cats2.getAnimal(TipPisica.MaineCoon,"Aldo", 6);


        System.out.println(maine);
        System.out.println(british);
        System.out.println(bichon);
        System.out.println(rottweiler);
    }
}
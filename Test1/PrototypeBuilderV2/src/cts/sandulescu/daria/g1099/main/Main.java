package cts.sandulescu.daria.g1099.main;

import cts.sandulescu.daria.g1099.classes.ARezervare;
import cts.sandulescu.daria.g1099.classes.IBuilder;
import cts.sandulescu.daria.g1099.classes.Rezervare;
import cts.sandulescu.daria.g1099.classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {

        ARezervare rezervare= new Rezervare("Andrei", 2,1000,2,new String[]{"pers1", "pers2"},true,true,1);

        ARezervare rezervare1=rezervare.clonare();

        System.out.println(rezervare);
        System.out.println(rezervare1);

        System.out.println("---------------------------------");

        IBuilder builder = new RezervareBuilder();
        Rezervare rezervare2= builder.buildRezervare("Leon",2,100);
        Rezervare rezervare3= builder.setFumator(true).setNrBai(2).setPersoane(new String[]{"Ion", "Ioana"}).buildRezervare("Ady",2,100);
        System.out.println(rezervare2);
        System.out.println(rezervare3);

        ARezervare rezervare4=rezervare3.clonare();
        System.out.println(rezervare4);




    }
}
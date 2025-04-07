package ro.cts.main;

import ro.cts.classes.IBuilder;
import ro.cts.classes.Rezervare;
import ro.cts.classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {

        IBuilder rezervareBuilder = new RezervareBuilder("Leontin");

        Rezervare rezervare1;

        Rezervare rezervare2;

        IBuilder rezervareBuilder2 = new RezervareBuilder("Ana");

        rezervare1=rezervareBuilder.setNrPersoane(4).setFumator(true).getRezervare();
        System.out.println(rezervare1);


        rezervare2=rezervareBuilder2.setOra("17:00").getRezervare();
        System.out.println(rezervare2);

    }
}
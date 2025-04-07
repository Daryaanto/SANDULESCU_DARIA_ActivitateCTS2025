package ro.cts.main;

import ro.cts.classes.Firma;
import ro.cts.classes.RegistrulCometrului;

public class Main {
    public static void main(String[] args) {

        RegistrulCometrului registrulCometrului= new RegistrulCometrului("9-5",50000000);
        Firma firma1 = registrulCometrului.getFirma("Leontin SRL", 2000,"romana",500);
        Firma firma2 = registrulCometrului.getFirma("Leontin SRL", 1,"ceva",50);
        Firma firma3 = registrulCometrului.getFirma("ELECTRICA SA", 1000,"cevaul",40000);

        System.out.println(firma1);
        System.out.println(firma2);
        System.out.println(firma3);

    }
}
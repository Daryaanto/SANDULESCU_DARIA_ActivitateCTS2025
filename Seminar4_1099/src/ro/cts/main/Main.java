package ro.cts.main;

import ro.cts.pachet.seminar4.clase.Supa;
import ro.cts.pachet.seminar4.clase.SupaCiuperci;
import ro.cts.pachet.seminar4.factory.Factory;
import ro.cts.pachet.seminar4.factory.TipuriSupe;
import ro.cts.rezervarePrototype.clase.ARezervare;
import ro.cts.rezervarePrototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory(200,10);
        Supa supa=factory.getSupa(TipuriSupe.Legume, "bors, legume", 100);
        supa.preparareSupa();

        Supa supa2= factory.getSupa(TipuriSupe.Ciuperci, "ciuperci, legume", 100);
        supa2.preparareSupa();

        Supa supa3= factory.getSupa(TipuriSupe.Vita, "vita, legume", 100);
        supa3.preparareSupa();

        System.out.println("-----------------------------------------");

        Rezervare rezervare=new Rezervare("John",5,"10112025","3");
        System.out.println(rezervare.toString());

        ARezervare rezervare1=rezervare.copiereRezervare();
        System.out.println(rezervare1.toString());
    }
}
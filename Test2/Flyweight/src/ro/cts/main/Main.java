package ro.cts.main;

import ro.cts.module.Extra;
import ro.cts.module.Meniu;

public class Main {
    public static void main(String[] args) {

        Meniu meniu = new Meniu();

        meniu.getProdus("Pizza", 30);
        meniu.getProdus("Burgeri", 40);
        meniu.getProdus("Paste", 10);
        meniu.getProdus("Friptura", 80);

        Extra extra1= new Extra(false,"ketchup",0);
        Extra extra2= new Extra(true,"ketchup",3);

        try{
            meniu.getProdus("Pizza").detaliiProdus(extra1);
            meniu.getProdus("Burgeri").detaliiProdus(extra2);
            meniu.getProdus("Paste").detaliiProdus(extra1);
            meniu.getProdus("Friptura");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
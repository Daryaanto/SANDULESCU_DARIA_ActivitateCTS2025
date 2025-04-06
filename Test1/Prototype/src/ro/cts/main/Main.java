package ro.cts.main;

import ro.cts.classes.AMeniu;
import ro.cts.classes.Meniu;

public class Main {
    public static void main(String[] args) {

        Meniu meniu1=new Meniu(10,"rosu","Hanu lu manuc",12,3.5f);
        System.out.println(meniu1.toString());

        AMeniu meniu2 = meniu1.clonare();
        System.out.println(meniu2.toString());
    }
}
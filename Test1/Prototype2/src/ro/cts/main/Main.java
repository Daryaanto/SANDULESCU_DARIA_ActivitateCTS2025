package ro.cts.main;

import ro.cts.classes.ATelefon;
import ro.cts.classes.Telefon;

public class Main {
    public static void main(String[] args) {

        Telefon t = new Telefon("iphone", 12, "07777", true);
        System.out.println(t.toString());

        ATelefon t2=t.clonare();
        System.out.println(t2.toString());
    }
}
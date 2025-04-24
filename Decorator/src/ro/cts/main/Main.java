package ro.cts.main;

import ro.cts.classes.Nota;
import ro.cts.classes.NotaDePlata;
import ro.cts.classes.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args) {

        Nota notaDePlata= new NotaDePlata(500);
        notaDePlata.printare();

        Nota notaRev=new NotaDePlataRevelion(notaDePlata);
        notaRev.printare();
    }
}
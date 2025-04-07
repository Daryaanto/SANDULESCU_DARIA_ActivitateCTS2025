package ro.cts.main;

import ro.cts.classes.ATelefon;
import ro.cts.classes.Factory;
import ro.cts.classes.Samsung;
import ro.cts.classes.Telefoane;

public class Main {
    public static void main(String[] args) {

        Factory service= new Factory(false,2);

        ATelefon galaxyS23= service.getObject(Telefoane.Samsung,"07nam", 13);
        ATelefon iphone15=service.getObject(Telefoane.iPhone,"07am",18);

        galaxyS23.suna();
        iphone15.suna();
        System.out.println(galaxyS23);
        System.out.println(iphone15);


    }
}
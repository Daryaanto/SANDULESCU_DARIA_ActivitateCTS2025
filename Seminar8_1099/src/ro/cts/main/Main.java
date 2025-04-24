package ro.cts.main;

import ro.cts.classes.Masa;
import ro.cts.classes.Ospatar;
import ro.cts.classes.Picolo;
import ro.cts.classes.Receptionist;

public class Main {
    public static void main(String[] args) {

Masa masa1= new Masa(true,20,4);
Masa masa2= new Masa(true,23,5);
Masa masa3= new Masa(true,24,6);
Masa masa4= new Masa(false,23,4);
        Receptionist receptionist= new Receptionist();

        System.out.println(receptionist.poateLuaLocLaMasa(masa1));
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));
        System.out.println(receptionist.poateLuaLocLaMasa(masa3));
        System.out.println(receptionist.poateLuaLocLaMasa(masa4));

    }
}
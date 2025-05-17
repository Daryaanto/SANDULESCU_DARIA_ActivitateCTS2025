package ro.cts.main;

import ro.cts.modules.Catering;
import ro.cts.modules.Local;
import ro.cts.modules.Restaurant;
import ro.cts.modules.StreetFood;

public class Main {
    public static void main(String[] args) {
Local local = new Restaurant("La birlic");
Local catering= new Catering(local);
Local streetFood= new StreetFood(local);

local.serveste();
catering.serveste();
streetFood.serveste();
    }
}
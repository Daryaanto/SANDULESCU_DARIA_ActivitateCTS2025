package ro.cts.main;

import ro.cts.modules.Client;
import ro.cts.modules.Localuri;
import ro.cts.modules.Observer;
import ro.cts.modules.Restaurant;

public class Main {
    public static void main(String[] args) {

        Observer client1=new Client("Leontin");
        Observer client2=new Client("Leontina");
        Observer client4=new Client("Leon XIV");

        Localuri restaurant = new Restaurant("La Birlic");

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client4);

        restaurant.rezervaMasa();

        restaurant.stergeObserver(client4);
        System.out.println();
        restaurant.rezervaMasa();



    }
}
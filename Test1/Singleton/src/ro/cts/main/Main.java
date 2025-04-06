package ro.cts.main;

import ro.cts.classes.ManagerRestaurant;

public class Main {
    public static void main(String[] args) {

        ManagerRestaurant managerRestaurant= ManagerRestaurant.getInstance("Daria", 1,2500,0);

        System.out.println(managerRestaurant.toString());

        ManagerRestaurant manager2= ManagerRestaurant.getInstance("Adi", 2,2500,0);
        System.out.println(manager2.toString());

    }
}
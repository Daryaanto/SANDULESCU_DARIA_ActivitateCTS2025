import ro.cts.modules.Facade;
import ro.cts.modules.Produs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produs produs1= new Produs(1,"shaorma", true);
        Produs produs2= new Produs(2,"pizza", true);
        Produs produs3= new Produs(3,"burger", false);
        Produs produs4= new Produs(4,"paste", true);

        List<Produs> produsList= new ArrayList<Produs>();
        produsList.add(produs1);
        produsList.add(produs2);
        produsList.add(produs3);
        produsList.add(produs4);

        Facade facade = new Facade();
        for (Produs produs: produsList) {
            System.out.println(facade.statusProdus(produs));
        }

    }
}
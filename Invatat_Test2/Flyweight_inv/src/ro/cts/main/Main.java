package ro.cts.main;

import ro.cts.modules.Hotel;
import ro.cts.modules.IPachet;
import ro.cts.modules.Optionale;
import ro.cts.modules.Pachet;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        IPachet pachet1= new Pachet(1,"Daria",2);
        IPachet pachet2= new Pachet(2,"Adi",3);
        IPachet pachet3= new Pachet(3,"Leontin",4);

        Optionale opt1= new Optionale(true,10);
        Optionale opt2= new Optionale(false,20);


        Hotel hotel= new Hotel();
        hotel.putPachet(1,pachet1);
        hotel.putPachet(2,pachet2);
        hotel.putPachet(3,pachet3);

        hotel.getPachet(1).rezerva(opt1);
        hotel.getPachet(2).rezerva(opt2);

    }
}
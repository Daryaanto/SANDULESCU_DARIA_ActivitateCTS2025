package ro.cts.modules;

import java.util.HashMap;

public class Hotel {

private HashMap<Integer, IPachet> hotel;

    public Hotel() {
        hotel=new HashMap<>();
    }

    public IPachet putPachet(int id, IPachet pachet) {
        if(!hotel.containsKey(id)){
            hotel.put(id, pachet);
        }

    return hotel.get(id);
    }

    public IPachet getPachet(int id) {
        if(hotel.containsKey(id)){
            return hotel.get(id);

        }
        else {
            throw new IllegalArgumentException("Pachet not found");
        }
    }
}

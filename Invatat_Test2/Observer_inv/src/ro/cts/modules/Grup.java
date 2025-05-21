package ro.cts.modules;

import java.util.ArrayList;
import java.util.List;

public abstract class Grup implements Expeditor{
    String name;
    List<Observer> membrii;

    public Grup(String name) {
        this.name = name;
        this.membrii = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        membrii.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
membrii.remove(o);
    }

    @Override
    public void sendMesaj(String mesaj) {
 for (Observer o : membrii) {
     o.primesteMesaj(mesaj);
 }
    }

    public abstract void intraNotificare();

}

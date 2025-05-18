package ro.cts.modules;

import java.util.ArrayList;
import java.util.List;

public abstract class Localuri implements Subject{


    private String denumire;
private List<Observer> clienti;


    public Localuri(String denumire) {
        this.denumire = denumire;
        this.clienti = new ArrayList<Observer>();
    }

    public String getDenumire() {
        return denumire;
    }

    public List<Observer> getClienti() {
        return clienti;
    }

    @Override
    public void adaugaObserver(Observer observer) {
this.clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
this.clienti.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
for (Observer observer : this.clienti) {
    observer.primesteMesaj(mesaj);
}
    }


    public abstract void rezervaMasa();
}

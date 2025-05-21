package ro.cts.modules;

public interface Expeditor {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void sendMesaj(String mesaj);
}

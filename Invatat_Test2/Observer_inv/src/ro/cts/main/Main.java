package ro.cts.main;

import ro.cts.modules.Expeditor;
import ro.cts.modules.GrupWhatsapp;
import ro.cts.modules.MembruGrup;
import ro.cts.modules.Observer;

public class Main {
    public static void main(String[] args) {

        Observer membru1= new MembruGrup("Daria","07",22);
        Observer membru2= new MembruGrup("Adi","07",22);
        Observer membru3= new MembruGrup("Ana","07",22);

        Expeditor grup1= new GrupWhatsapp("Grupa 1099");

        grup1.addObserver(membru1);
        grup1.addObserver(membru2);
        grup1.addObserver(membru3);

        grup1.sendMesaj("ceva");
        ((GrupWhatsapp) grup1).intraNotificare();
    }
}
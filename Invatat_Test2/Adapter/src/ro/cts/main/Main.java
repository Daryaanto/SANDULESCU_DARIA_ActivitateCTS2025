package ro.cts.main;

import ro.cts.classes.*;

public class Main {
    public static void main(String[] args) {

        Telefon telefon = new Telefon("samsun","07");

        iMicroSD microSD= new mircoSD(16,"ADATA", "SAMSUN");

//        SDcard sdCard= new SDcard(16,"HP");

        telefon.afiseaza(microSD);
        System.out.println();
        telefon.afiseaza(new Adapter(16,"LG"));


    }
}
package ro.cts.main;

import ro.cts.classes.Cash;
import ro.cts.classes.Client;
import ro.cts.classes.Voucher;
import ro.cts.classes.iPlata;

public class Main {
    public static void main(String[] args) {


        Client client = new Client("Dan");
        iPlata plata = new Cash(100);
        iPlata vouchere= new Voucher(10,40);

        client.platesteMasa(80);
        client.setMetodaPlata(plata);
        client.platesteMasa(80);
        client.setMetodaPlata(vouchere);
        client.platesteMasa(80);
    }
}
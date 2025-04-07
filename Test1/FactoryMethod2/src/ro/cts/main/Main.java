package ro.cts.main;

import ro.cts.classes.Laptopuri;
import ro.cts.classes.Produs;
import ro.cts.classes.Telefoane;
import ro.cts.factories.IFactory;
import ro.cts.factories.LaptopFactory;
import ro.cts.factories.PhoneFactory;

public class Main {
    public static void main(String[] args) {

        IFactory telefoaneShop= new PhoneFactory(true,3);
        IFactory laptopShop= new LaptopFactory(1500,"darya");

        Produs samsung= telefoaneShop.getProduse(Telefoane.Samsung,13,"mov");
        Produs iphone=telefoaneShop.getProduse(Telefoane.iPhone,9,"black");

        Produs lenovo=laptopShop.getProduse(Laptopuri.Lenovo,4,"gri");
        Produs hp=laptopShop.getProduse(Laptopuri.HP,6,"white");

        samsung.utilizeaza();
        iphone.utilizeaza();
        lenovo.utilizeaza();
        hp.utilizeaza();

    }
}
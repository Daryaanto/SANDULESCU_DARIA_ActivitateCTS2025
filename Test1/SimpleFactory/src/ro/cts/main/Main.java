package ro.cts.main;

import ro.cts.classes.Factory;
import ro.cts.classes.Feluri;
import ro.cts.classes.Friptura;
import ro.cts.classes.IFelPrincipal;

public class Main {
    public static void main(String[] args) {

        Factory bucatarie=  Factory.getInstance("well done", "carne rosie");

        IFelPrincipal friptura= bucatarie.getProdus(Feluri.Friptura,450,60,"Caru cu Bere",true);
        IFelPrincipal peste= bucatarie.getProdus(Feluri.Peste,250,45,"Caru cu Bere",false);

        System.out.println(friptura);
        System.out.println(peste);

        friptura.serveste();
        peste.serveste();

        Factory bucatarie2=  Factory.getInstance("medium", "carne alba");

        IFelPrincipal friptura2= bucatarie2.getProdus(Feluri.Friptura,450,60,"Caru cu Bere",true);
        IFelPrincipal peste2= bucatarie2.getProdus(Feluri.Peste,250,45,"Caru cu Bere",false);

        System.out.println(friptura2);
    }
}
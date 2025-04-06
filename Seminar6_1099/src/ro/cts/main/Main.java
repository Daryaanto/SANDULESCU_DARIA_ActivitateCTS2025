package ro.cts.main;


import ro.cts.classes.Adapter;
import ro.cts.classes.Medicament_farmacie;
import ro.cts.classes.Medicament_spital;

public class Main {
    public static void vinde_medicament(Medicament_farmacie medicament){
        medicament.cumpara_medicament();
    }
    public static void main(String[] args) {
        Medicament_farmacie medicament_farmacie= new Medicament_farmacie("Coldrex", 30,true,"20/20/2025");
        vinde_medicament(medicament_farmacie);

        Medicament_spital medicament_spital= new Medicament_spital("Coldrex1", 30);
//        medicament_spital.achizitioneaza_medicament();

        Adapter adapter=new Adapter(medicament_spital);
//        adapter.cumpara_medicament();
        vinde_medicament(adapter);
    }
}
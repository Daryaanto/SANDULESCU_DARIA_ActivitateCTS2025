package ro.cts.main;

import ro.cts.modules.Categorie;
import ro.cts.modules.Produs;
import ro.cts.modules.Structura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

try{
    Structura categorie1= new Categorie("Bauturi");
    Structura categorie2= new Categorie("Fel principal");
    Structura categorie3= new Categorie("Deserturi");

    Structura produs1 = new Produs("Friptura", 50);
    Structura produs2 = new Produs("Ciorba", 20);
    Structura produs3 = new Produs("Papanasi", 10);
    Structura produs4 = new Produs("Clatite", 15);
    Structura produs5 = new Produs("Vin", 150);
    Structura produs6 = new Produs("Paine", 5);

    categorie1.adaugaNod(produs5);
    categorie2.adaugaNod(produs1);
    categorie2.adaugaNod(produs2);
    categorie3.adaugaNod(produs3);
    categorie3.adaugaNod(produs4);

    List<Structura> meniu= new ArrayList<Structura>();
    meniu.add(categorie1);
    meniu.add(categorie2);
    meniu.add(categorie3);
    meniu.add(produs6);
    for(Structura s : meniu){
        s.descriereStructura("");
    }


} catch (Exception e) {
    throw new RuntimeException(e);
}
    }
}
package ro.cts.main;

import ro.cts.modules.Preparare;
import ro.cts.modules.PreparareAbstract;

public class Main {
    public static void main(String[] args) {

        PreparareAbstract preparat= new Preparare("Friptura cu legume");

        preparat.preparare();
    }
}
package ro.cts.factories;

import ro.cts.classes.*;

public class LaptopFactory implements IFactory {
    private int putereGaming;
    private String username;


    public LaptopFactory(int putereGaming, String username) {
        this.putereGaming = putereGaming;
        this.username = username;
    }


    @Override
    public Produs getProduse(TipProdus tip, int durataBaterie, String culoare) {
        return switch (tip){
            case Laptopuri.HP -> new HP(durataBaterie,culoare,username);
            case Laptopuri.Lenovo -> new Lenovo(durataBaterie,culoare,putereGaming);
            default -> null;
        };
    }
}

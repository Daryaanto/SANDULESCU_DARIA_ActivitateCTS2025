package ro.cts.main;

import ro.cts.modules.*;

public class Main {
    public static void main(String[] args) {

        IPizza blatSubtire= new Subtire("Subtire");
        IPizza blatPr= new Prezidentiabil(true);
        IPizza blatIt= new Italian(50);

        Pizza pizza= new Pizza("Capriciosa", 60, 50);

        pizza.gatestePizza("Subtire");
        pizza.setTipBlat(blatPr);
        pizza.gatestePizza("Capriciosa");
        pizza.setTipBlat(blatIt);
        pizza.gatestePizza("Capriciosa");


    }
}
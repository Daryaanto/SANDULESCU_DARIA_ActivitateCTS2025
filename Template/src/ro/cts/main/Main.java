package ro.cts.main;

import ro.cts.classes.Tramvai;
import ro.cts.classes.TramvaiAbstract;

public class Main {
    public static void main(String[] args) {

        TramvaiAbstract tramvaiul16=new Tramvai(16);

        System.out.println("incepe turul");
        tramvaiul16.tur();
        System.out.println("");
        System.out.println("incepe returul");

        tramvaiul16.retur();
    }
}
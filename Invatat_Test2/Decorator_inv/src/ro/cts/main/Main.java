package ro.cts.main;

import ro.cts.module.Felicitare;
import ro.cts.module.FelicitareDecorata;
import ro.cts.module.IFelicitare;

public class Main {
    public static void main(String[] args) {

        IFelicitare felicitare = new Felicitare("Adi");
        IFelicitare felicitareDecorata= new FelicitareDecorata(felicitare);

        felicitare.mesaj();
        felicitareDecorata.mesaj();

    }
}
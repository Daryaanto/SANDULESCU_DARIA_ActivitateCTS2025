package ro.cts.module;

public class FelicitareDecorata extends DecoratorAbstract{


    public FelicitareDecorata(IFelicitare felicitare) {
        super(felicitare);
    }

    @Override
    public void mesajSpecific() {
        System.out.println("Mesaj specific");    }
}

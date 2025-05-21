package ro.cts.module;

public abstract class DecoratorAbstract implements IFelicitare{

    private IFelicitare felicitare;

    public DecoratorAbstract(IFelicitare felicitare) {
        this.felicitare = felicitare;
    }

    @Override
    public void mesaj() {
felicitare.mesaj();
mesajSpecific();
    }
    public abstract void mesajSpecific();
}

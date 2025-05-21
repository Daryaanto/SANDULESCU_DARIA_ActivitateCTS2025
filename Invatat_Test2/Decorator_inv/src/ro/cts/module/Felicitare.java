package ro.cts.module;

public class Felicitare implements IFelicitare{

    private String destinatar;

    public Felicitare(String destinatar) {
        this.destinatar = destinatar;
    }

    public String getDestinatar() {
        return destinatar;
    }

    @Override
    public void mesaj() {
        System.out.println("Felicitare catre: " + destinatar);
    }
}

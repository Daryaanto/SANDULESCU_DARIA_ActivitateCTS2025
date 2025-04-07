package ro.cts.classes;

public class Factory {
    private boolean edgeScreen;
    private int cameras;

    public Factory(boolean edgeScreen, int cameras) {
        this.edgeScreen = edgeScreen;
        this.cameras = cameras;
    }

    public ATelefon getObject(Telefoane t, String numarTelefon, int diagonala) {
        switch (t) {
            case Telefoane.Samsung -> {return new Samsung(numarTelefon, diagonala, edgeScreen);}
            case Telefoane.iPhone -> {return new iPhone(numarTelefon,diagonala,cameras);}
            default -> {
                return null;
            }
        }
    }
}

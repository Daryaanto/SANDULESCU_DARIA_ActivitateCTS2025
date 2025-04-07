package ro.cts.classes;

public class Samsung extends ATelefon{
    private boolean edgeScreen;

    public Samsung(String numarTelefon, int diagonala, boolean edgeScreen) {
        super(numarTelefon, diagonala);
        this.edgeScreen = edgeScreen;
    }


    @Override
    public void suna() {
        System.out.println("Call from my Samsung");
    }
}

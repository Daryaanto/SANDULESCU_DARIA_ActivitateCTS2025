package ro.cts.classes;

public class Samsung extends Produs{
    private boolean edgeScreen;

    public Samsung(int durataBaterie, String culoare, boolean edgeScreen) {
        super(durataBaterie, culoare);
        this.edgeScreen = edgeScreen;
    }


    @Override
    public void utilizeaza() {
        System.out.println("Call from samsung");
    }
}

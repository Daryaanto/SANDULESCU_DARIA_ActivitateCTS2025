package ro.cts.classes;

public class Lenovo extends Produs{
    private int putereGaming;

    public Lenovo(int durataBaterie, String culoare, int putereGaming) {
        super(durataBaterie, culoare);
        this.putereGaming = putereGaming;
    }


    @Override
    public void utilizeaza() {
        System.out.println("Playing on Lenovo");
    }
}

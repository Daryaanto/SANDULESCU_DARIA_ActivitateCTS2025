package ro.cts.classes;

public abstract class Produs {
    private int durataBaterie;
    private String culoare;

    public Produs(int durataBaterie, String culoare) {
        this.durataBaterie = durataBaterie;
        this.culoare = culoare;
    }

    public abstract void utilizeaza();
}

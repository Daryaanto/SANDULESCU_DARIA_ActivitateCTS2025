package ro.cts.classes;

public class Telefon {
    private String marca;
    private String numar;

    public Telefon(String marca, String numar) {
        this.marca = marca;
        this.numar = numar;
    }

    public void afiseaza(iMicroSD microSD){
        System.out.println("Telefon marca: " + marca+ " cu cardul: ");
        microSD.acceseazaMicroSD();
    }
}

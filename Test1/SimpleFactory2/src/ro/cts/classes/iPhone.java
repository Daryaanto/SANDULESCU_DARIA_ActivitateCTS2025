package ro.cts.classes;

public class iPhone extends ATelefon{
    private int cameras;

    public iPhone(String numarTelefon, int diagonala, int cameras) {
        super(numarTelefon, diagonala);
        this.cameras = cameras;
    }


    @Override
    public void suna() {
        System.out.println("Call from my iPhone");
    }
}

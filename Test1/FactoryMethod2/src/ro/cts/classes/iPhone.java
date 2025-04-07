package ro.cts.classes;

public class iPhone extends Produs{
    private int nrCamere;

    public iPhone(int durataBaterie, String culoare, int nrCamere) {
        super(durataBaterie, culoare);
        this.nrCamere = nrCamere;
    }


    @Override
    public void utilizeaza() {
        System.out.println("Call from iPhone");
    }
}

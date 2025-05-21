package ro.cts.modules;

public class Pachet implements IPachet{

    private int cod;
    private String nume;
    private int nrPers;

    public Pachet(int cod, String nume, int nrPers) {
        this.cod = cod;
        this.nume = nume;
        this.nrPers = nrPers;
    }

    @Override
    public void rezerva(Optionale o) {
        System.out.println("S-a facut rezervarea");
        System.out.println(o.toString());

    }
}

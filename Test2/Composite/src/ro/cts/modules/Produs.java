package ro.cts.modules;

public class Produs implements Structura {
    private String nume;
    private float pret;

    public Produs(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void adaugaNod(Structura structura) throws Exception {
    throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void descriereStructura(String indent) {
        System.out.println(indent + "Produs " + this.nume + " Pret: " + this.pret);

    }
}

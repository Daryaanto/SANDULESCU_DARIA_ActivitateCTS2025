package ro.cts.modules;

public class Client implements IClient{

    private int varsta;
    private String nume;
    private float bani;


    public Client(int varsta, String nume, float bani) {
        this.varsta = varsta;
        this.nume = nume;
        this.bani = bani;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public float getBani() {
        return bani;
    }

    @Override
    public void cumparaTigari(int varsta, float pret) {
        if(bani>pret)
            System.out.println("Poftim tzigari boss");
        else
            System.out.println("Valea d-aici saracule");
    }
}

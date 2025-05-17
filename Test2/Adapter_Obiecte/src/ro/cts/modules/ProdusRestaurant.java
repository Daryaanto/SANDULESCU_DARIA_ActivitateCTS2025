package ro.cts.modules;

public class ProdusRestaurant {
    private String nume;
    private float pret;

    public ProdusRestaurant(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void comandaProdus() {
        System.out.println("ati comandat "+ this.nume);
    }

    public void aduNotaGrason(){
        comandaProdus();
        System.out.println("aveti de platit "+this.pret);
    }
}

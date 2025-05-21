package ro.cts.classes;

public class Client {
    private String nume;
    private iPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new Card(100);
    }

    public void setMetodaPlata(iPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteMasa(float pret){
        metodaPlata.alegeTipPlata(pret);
    }
}

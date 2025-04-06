package ro.cts.classes;

public class Medicament_spital {

    private String nume;
    private int pret;

    public Medicament_spital(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    private void prezinta_reteta(){
        System.out.println("Aceasta este reteta pt "+ nume);
    }

    public void achizitioneaza_medicament(){
        prezinta_reteta();
        System.out.println("Medicamentul " +nume+ " costa "+pret);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}

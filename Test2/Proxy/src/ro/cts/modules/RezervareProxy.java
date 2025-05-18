package ro.cts.modules;

public class RezervareProxy implements IRezervare {
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }



    @Override
    public void rezerva(String nume, int nr) {
        if(nr >= 4){
            rezervare.rezerva(nume, nr);
        } else {
            System.out.println("Nu este nevoie de rezervare!");
        }
    }
}

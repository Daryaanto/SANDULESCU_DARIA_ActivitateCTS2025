package ro.cts.main;

public class RezervareProxy implements IRezervare {

    private Rezervare rezervare;


    @Override
    public void rezerva(String nume, int nrPers) {
        if(nrPers<4)
            System.out.println("nu puteti rezerva");
        else
            rezervare.rezerva(nume,nrPers);
    }
}

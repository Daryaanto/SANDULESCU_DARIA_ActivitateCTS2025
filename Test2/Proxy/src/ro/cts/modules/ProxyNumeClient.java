package ro.cts.modules;

public class ProxyNumeClient implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare){
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String nume, int nr) {
        if(nume.length() > 5){
            this.rezervare.rezerva(nume, nr);
        }
        else{
            System.out.println("Nu va este permisa rezervarea.");
        }
    }
}

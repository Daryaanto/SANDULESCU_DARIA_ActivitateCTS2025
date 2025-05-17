package ro.cts.modules;

public class Livrare {
    public boolean esteLivrat(Produs p){
        return p.getPret()%4==0;
    }
}

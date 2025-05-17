package ro.cts.modules;

public class Preluare {
    public boolean esteRidicat(Produs produs){
        return produs.getPret()%2==0;
    }
}

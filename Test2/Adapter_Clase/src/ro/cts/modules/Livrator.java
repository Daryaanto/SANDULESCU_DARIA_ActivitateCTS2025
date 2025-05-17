package ro.cts.modules;

public class Livrator {
    private String nume;
    private boolean isNepalez;

    public Livrator(String nume, boolean isNepalez) {
        this.nume = nume;
        this.isNepalez = isNepalez;
    }

    public void glovo(IProdusDelivery produsDelivery){
        System.out.println(this.nume + " va livreaza: ");
        produsDelivery.livrareProdus();
        if(isNepalez){
            System.out.println("english please");
        }
        else
            System.out.println("poftim, bossule");
    }
}

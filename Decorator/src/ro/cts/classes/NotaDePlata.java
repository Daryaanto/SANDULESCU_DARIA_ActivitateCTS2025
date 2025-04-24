package ro.cts.classes;

public class NotaDePlata implements Nota {
    private int totalPlata;

    public NotaDePlata(int totalPlata) {
        this.totalPlata = totalPlata;
    }

    @Override
    public void printare() {
        System.out.println("total plata: "+totalPlata);
    }
}

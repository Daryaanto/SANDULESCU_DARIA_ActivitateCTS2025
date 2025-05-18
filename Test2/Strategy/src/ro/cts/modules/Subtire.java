package ro.cts.modules;

public class Subtire implements IPizza {
    private String blatClient;

    public Subtire(String tipBlat) {
        this.blatClient = tipBlat;
    }

    @Override
    public void blat(String tipBlat) {
        if(this.blatClient.equals(tipBlat)){
            System.out.println("Va servim blatul "+this.blatClient);
        }
        else{
            System.out.println("Alegeti alt blat");
        }
    }
}

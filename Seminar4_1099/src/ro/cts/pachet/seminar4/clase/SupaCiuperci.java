package ro.cts.pachet.seminar4.clase;

public class SupaCiuperci extends Supa{

    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }



    @Override
    public double calculPret() {
        double pret=this.getPretPerSutaGr()*cantitateCiuperci/100;
        return super.calculPret()+pret;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Sunt o supa de ciuperci");

    }
}

package ro.cts.pachet.seminar4.clase;

public class SupaVita extends Supa {

    public double pretExtra;


    public SupaVita(int gramaj, double pretPerSutaGr, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public double calculPret() {
        return super.calculPret()+pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Sunt o supa de vita");
    }
}

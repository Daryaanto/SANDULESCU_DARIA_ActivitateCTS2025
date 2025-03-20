package ro.cts.pachet.seminar4.clase;

public class SupaLegume extends Supa{
    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaGr, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public double calculPret() {
        return super.calculPret()+(gramajCrutoane/100)*gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Sunt o supa de legume");
    }
}

package ro.cts.pachet.seminar4.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaGr;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGr, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
        this.ingrediente = ingrediente;
    }

    public abstract void preparareSupa();
    public  double calculPret(){
        return pretPerSutaGr*gramaj/100;
    };

    public double getPretPerSutaGr() {
        return pretPerSutaGr;
    }
}

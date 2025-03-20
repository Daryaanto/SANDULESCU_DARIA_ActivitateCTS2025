package ro.cts.pachet.seminar4.factory;
import ro.cts.pachet.seminar4.clase.Supa;
import ro.cts.pachet.seminar4.clase.SupaCiuperci;
import ro.cts.pachet.seminar4.clase.SupaLegume;
import ro.cts.pachet.seminar4.clase.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPerSutaGr;

    public Factory(int gramaj, double pretPerSutaGr) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
    }

    public Supa getSupa(TipuriSupe supe, String ingrediente, double extraSupa) {
        switch (supe){
            case Legume:
                SupaLegume supaLegume = new SupaLegume(gramaj,pretPerSutaGr,ingrediente,extraSupa);
                return supaLegume;
            case Ciuperci:
                SupaCiuperci supaCiuperci= new SupaCiuperci(gramaj,pretPerSutaGr,ingrediente,extraSupa);
                return supaCiuperci;
            case Vita:
                SupaVita supaVita= new SupaVita(gramaj,pretPerSutaGr,ingrediente,extraSupa);
                return supaVita;

                default:
                    return null;
        }
    }
}

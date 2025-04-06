package ro.cts.factories;

import ro.cts.classes.FelMancare;
import ro.cts.classes.Senvis;
import ro.cts.classes.SenvisSalam;
import ro.cts.classes.SenvisSunca;

public class FactorySenvis implements IFactory {


    private String tipSalam;
    private boolean salata;

    private int feliiSunca;
    private String tipPaine;

    public FactorySenvis(String tipSalam, boolean salata, int feliiSunca, String tipPaine) {
        this.tipSalam = tipSalam;
        this.salata = salata;
        this.feliiSunca = feliiSunca;
        this.tipPaine = tipPaine;
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tipFelMancare, float pret, int cantitate) {
        return switch (tipFelMancare){
            case Senvis.SenvisSalam -> new SenvisSalam(pret,cantitate,tipSalam,salata);
            case Senvis.SenvisSunca -> new SenvisSunca(pret,cantitate,feliiSunca,tipPaine);
            default -> null;
        };
    }

}

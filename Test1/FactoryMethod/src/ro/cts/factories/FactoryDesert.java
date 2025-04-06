package ro.cts.factories;

import ro.cts.classes.Desert;
import ro.cts.classes.FelMancare;
import ro.cts.classes.Papanasi;
import ro.cts.classes.Tiramisu;

public class FactoryDesert implements IFactory {
    private boolean cuGem;
    private String aroma;

    private boolean extraCoco;
    private int nrFelii;

    public FactoryDesert(boolean cuGem, String aroma, boolean extraCoco, int nrFelii) {
        this.cuGem = cuGem;
        this.aroma = aroma;
        this.extraCoco = extraCoco;
        this.nrFelii = nrFelii;
    }

    public void setCuGem(boolean cuGem) {
        this.cuGem = cuGem;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setExtraCoco(boolean extraCoco) {
        this.extraCoco = extraCoco;
    }

    public void setNrFelii(int nrFelii) {
        this.nrFelii = nrFelii;
    }

    @Override
    public FelMancare getFelMancare(TipFelMancare tipFelMancare, float pret, int cantitate) {
        return switch (tipFelMancare){
            case Desert.Papanasi -> new Papanasi(pret,cantitate,cuGem,aroma);
            case Desert.Tiramisu -> new Tiramisu(pret,cantitate,extraCoco,nrFelii);
            default -> null;

        };
    }
}

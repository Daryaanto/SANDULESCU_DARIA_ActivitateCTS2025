package ro.cts.module;

public class Extra {
    private boolean faraCeapa;
    private String tipSos;
    private float extraGramaj;

    public Extra(boolean faraCeapa, String tipSos, float extraGramaj) {
        this.faraCeapa = faraCeapa;
        this.tipSos = tipSos;
        this.extraGramaj = extraGramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Extra{");
        sb.append("faraCeapa=").append(faraCeapa);
        sb.append(", tipSos='").append(tipSos).append('\'');
        sb.append(", extraGramaj=").append(extraGramaj);
        sb.append('}');
        return sb.toString();
    }
}

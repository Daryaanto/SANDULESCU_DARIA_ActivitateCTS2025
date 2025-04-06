package ro.cts.classes;

public class Medicament_farmacie {
    private String nume;
    private int pret;
    private boolean stoc;
    private String data_exp;

    public Medicament_farmacie(String nume, int pret, boolean stoc, String data_exp) {
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
        this.data_exp = data_exp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament_farmacie{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", stoc=").append(stoc);
        sb.append(", data_exp='").append(data_exp).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void cumpara_medicament(){
        System.out.println(this.toString());
    }
}

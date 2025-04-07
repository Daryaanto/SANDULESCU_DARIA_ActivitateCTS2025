package ro.cts.classes;

public class Telefon extends ATelefon {

    public Telefon(String marca, int model, String numarTel, boolean dualSim) {
        super(marca, model, numarTel, dualSim);
    }

    public Telefon() {
    }

    @Override
    public ATelefon clonare() {
        Telefon telefon = new Telefon();
        telefon.dualSim=this.dualSim;
        telefon.model=this.model;
        telefon.numarTel=this.numarTel;
        telefon.marca=this.marca;

        return telefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefon{");
        sb.append("numarTel='").append(numarTel).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", model=").append(model);
        sb.append(", dualSim=").append(dualSim);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void suna() {
        System.out.println("Suna...");
    }
}

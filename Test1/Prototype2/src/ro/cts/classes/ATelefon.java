package ro.cts.classes;

public abstract class ATelefon {
    protected String marca;
    protected int model;
    protected String numarTel;
    protected boolean dualSim;

    public ATelefon(String marca, int model, String numarTel, boolean dualSim) {
        this.marca = marca;
        this.model = model;
        this.numarTel = numarTel;
        this.dualSim = dualSim;
    }

    public ATelefon() {
        this.marca = "samsung";
        this.model = 23;
        this.numarTel = "09999";
        this.dualSim = true;
    }

    public abstract ATelefon clonare();
    public abstract void suna();
}

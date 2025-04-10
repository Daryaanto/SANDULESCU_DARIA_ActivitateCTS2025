package cts.sandulescu.daria.g1099.builder.models;

public class InternareBuilder implements IBuilder{

    private String nume;

    //opt

    private boolean patRabatabil;

    private boolean hasMicDejun;

    public InternareBuilder(String nume, boolean patRabatabil, boolean hasMicDejun) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.hasMicDejun = hasMicDejun;
    }

    public InternareBuilder() {
        this.patRabatabil = false;
        this.hasMicDejun = false;
    }

    @Override
    public Internare buildInternare(String nume) {

        return new Internare(nume, patRabatabil, hasMicDejun);
    }

    @Override
    public IBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public IBuilder setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
        return this;
    }
}

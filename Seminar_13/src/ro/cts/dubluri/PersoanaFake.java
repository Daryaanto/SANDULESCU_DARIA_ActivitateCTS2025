package ro.cts.dubluri;

import ro.cts.seminar.IPersoana;

public class PersoanaFake implements IPersoana {

    int valoareVarsta;

    public void setValoareVarsta(int valoareVarsta) {
        this.valoareVarsta = valoareVarsta;
    }

    @Override
    public String getSex() {
        return "";
    }

    @Override
    public int getVarsta() {
        return this.valoareVarsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}

package ro.cts.dubluri;

import ro.cts.seminar.IPersoana;

public class PersoanaStub implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 65;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }

}

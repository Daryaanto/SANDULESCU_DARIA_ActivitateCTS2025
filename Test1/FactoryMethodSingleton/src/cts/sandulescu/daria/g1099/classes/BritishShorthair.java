package cts.sandulescu.daria.g1099.classes;

public class BritishShorthair extends AAnimal{
    private String mancarePreferata;
    private String decoratiune;

    public BritishShorthair(String nume, int varsta, String mancarePreferata, String decoratiune) {
        super(nume, varsta);
        this.mancarePreferata = mancarePreferata;
        this.decoratiune = decoratiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BritishShorthair{");
        sb.append("mancarePreferata='").append(mancarePreferata).append('\'');
        sb.append(", decoratiune='").append(decoratiune).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}

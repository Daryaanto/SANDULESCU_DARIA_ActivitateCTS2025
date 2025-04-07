package ro.cts.classes;

public abstract class ATelefon {
    private String numarTelefon;
    private int diagonala;

    public ATelefon(String numarTelefon, int diagonala) {
        this.numarTelefon = numarTelefon;
        this.diagonala = diagonala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ATelefon{");
        sb.append("numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", diagonala=").append(diagonala);
        sb.append('}');
        return sb.toString();
    }

    public abstract void suna();
}

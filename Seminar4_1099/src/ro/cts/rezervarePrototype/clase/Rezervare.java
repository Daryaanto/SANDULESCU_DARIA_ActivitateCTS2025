package ro.cts.rezervarePrototype.clase;

public class Rezervare extends ARezervare{

    public Rezervare() {
    }

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    @Override
    public void descriere() {
        System.out.println("Rezervare");
    }

    @Override
    public ARezervare copiereRezervare() {
        Rezervare r = new Rezervare();
        r.numeClient=this.numeClient;
        r.nrPersoane=this.nrPersoane;
        r.data=this.data;
        r.ora=this.ora;
        return r;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                '}';
    }
}

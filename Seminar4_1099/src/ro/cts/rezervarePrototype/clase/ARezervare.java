package ro.cts.rezervarePrototype.clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare() {
        this.numeClient = "";
        this.nrPersoane = 0;
        this.data = "";
        this.ora = "";
    }

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if (numeClient.length()>3){
            this.numeClient = numeClient;

        }else this.numeClient = "N/A";
        if (nrPersoane>3)
        {
            this.nrPersoane = nrPersoane;
        }
        else{
            this.nrPersoane = 20;
        }
        if (data.length()==8){
            this.data = data;
        }
        else this.data = "N/A";
        this.ora = ora;
    }

    public abstract void descriere();

    public abstract ARezervare copiereRezervare();
}

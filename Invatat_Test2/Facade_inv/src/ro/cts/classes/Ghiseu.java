package ro.cts.classes;

public class Ghiseu {
    private int nrGhiseu;
    private int nrActe;
    private boolean esteLiber;


    public Ghiseu(int nrGhiseu, int nrActe, boolean esteLiber) {
        this.nrGhiseu = nrGhiseu;
        this.nrActe = nrActe;
        this.esteLiber = esteLiber;
    }

    public int getNrGhiseu() {
        return nrGhiseu;
    }

    public int getNrActe() {
        return nrActe;
    }

    public boolean isEsteLiber() {
        return esteLiber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ghiseu{");
        sb.append("nrGhiseu=").append(nrGhiseu);
        sb.append(", nrActe=").append(nrActe);
        sb.append('}');
        return sb.toString();
    }


}

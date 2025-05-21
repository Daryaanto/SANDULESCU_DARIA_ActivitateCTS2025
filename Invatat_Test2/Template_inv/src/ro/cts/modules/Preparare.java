package ro.cts.modules;

public class Preparare extends PreparareAbstract{
    private String denumire;

    public Preparare(String denumire) {
        this.denumire = denumire;
    }

    @Override
    protected void spala() {
        System.out.println("Spala legumele");
    }

    @Override
    protected void taie() {
        System.out.println("Taie legumele si carnea");
    }

    @Override
    protected void coace() {
        System.out.println("Baga la cuptor");
    }

    @Override
    protected void serveste() {
        System.out.println("Pofta mare!");
    }
}

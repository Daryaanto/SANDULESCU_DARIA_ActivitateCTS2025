package ro.cts.classes;

public class Tramvai extends TramvaiAbstract{

    private int nrLinie;

    public Tramvai(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    protected void opresteInS1() {
        System.out.println("A ajuns la pipera");
    }

    @Override
    protected void opresteInS2() {
        System.out.println("A ajuns la mobexpert");

    }

    @Override
    protected void opresteInS3() {
        System.out.println("A ajuns in tei");

    }

    @Override
    protected void opresteInS4() {
        System.out.println("A ajuns la lizeanu");

    }

    @Override
    protected void opresteInS5() {
        System.out.println("A ajuns la batistei");

    }

    @Override
    protected void opresteInS6() {
        System.out.println("A ajuns la sf vineri");

    }


}

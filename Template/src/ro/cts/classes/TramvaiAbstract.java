package ro.cts.classes;

public abstract class TramvaiAbstract {

    protected abstract void opresteInS1();
    protected abstract void opresteInS2();
    protected abstract void opresteInS3();
    protected abstract void opresteInS4();
    protected abstract void opresteInS5();
    protected abstract void opresteInS6();

    public final void tur(){
        opresteInS1();
        opresteInS2();
        opresteInS3();
        opresteInS4();
        opresteInS5();
        opresteInS6();
    };
    public final void retur(){
        opresteInS6();
        opresteInS5();
        opresteInS4();
        opresteInS3();
        opresteInS2();
        opresteInS1();
    };


}

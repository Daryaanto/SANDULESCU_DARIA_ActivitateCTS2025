package ro.cts.seminar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class getVarstaTest {

   private Persoana persoana;



    @Before
    public void setUp() throws Exception {
        this.persoana = new Persoana();
    }

    @Test
    public void getVarstaRight() {
        this.persoana = new Persoana("Daria", "6021110400000");
        assertEquals(22, persoana.getVarsta());

    }
    @Test
    public void getVarstaRight2() {
        this.persoana = new Persoana("Darian", "1981110400000");
        assertEquals(26, persoana.getVarsta());
    }
    @Test
    public void getVarstaBoundary() {
        this.persoana = new Persoana("Darian", "1991231400000");
        assertEquals(25, persoana.getVarsta());
    }

    @Test(expected = ExceptieCnpInvalid.class)
    public void getVarstaError() {
        this.persoana = new Persoana("Darian", "19914231400000");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCnpInvalid.class)
    public void getVarstaCardinality() {
        this.persoana = new Persoana("Darian", "52501231400000");
        assertEquals(0, persoana.getVarsta());
    }


}
package ro.cts.seminar;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.cts.dubluri.PersoanaFake;
import ro.cts.dubluri.PersoanaStub;
import ro.cts.tests.TesteBoundary;
import ro.cts.tests.TesteRight;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(TesteBoundary.class)

    public void aplicaDiscountVarstnici(){
        IPersoana persoana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Roma", 2000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(1800, pachetTuristic.getPret(),0.1);

    }

    @Test
    @Category(TesteRight.class)

    public void discountRightOver(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareVarsta(70);
        PachetTuristic p= new PachetTuristic(persoana,"Frankfurt", 2000.0);
        p.aplicaDiscountVarstnici(25);
        assertEquals(1500.0,p.getPret(),0.1);


    }

    @Test
    @Category(TesteRight.class)

    public void discountRightUnder(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setValoareVarsta(20);
        PachetTuristic p= new PachetTuristic(persoana,"Koln", 2000.0);
        p.aplicaDiscountVarstnici(25);
        assertEquals(2000.0,p.getPret(),0.1);


    }

}
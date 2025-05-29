package ro.cts.seminar;

import org.junit.Test;

import static org.junit.Assert.*;

public class getSexTest {

    @Test
    public void getSexRight() {
        Persoana persoana = new Persoana("darian", "12344444444");
        assertEquals("M",persoana.getSex());
    }
    @Test
    public void getSexRight2() {
        Persoana persoana = new Persoana("daria", "22344444444");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void getSexBoundary() {
        Persoana persoana = new Persoana("daria", "82344444444");
        assertEquals("F",persoana.getSex());
    }
}
package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tridy.Batoh;
import tridy.Predmet;

import static org.junit.Assert.*;
import java.io.IOException;


public class BatohTest {

    private Batoh b;

    @Before
    public void setUp() throws IOException {
        b = new Batoh();
    }

    @Test
    public void testPridaniPredmetuDoBatohu() throws IOException {

        Predmet pacidlo = new Predmet("koupelna", "pacidlo");

        Assert.assertEquals(0, b.getPredmety().size());

        b.pridatDoBatohu(pacidlo);

        Assert.assertEquals(1, b.getPredmety().size());
        Assert.assertEquals("pacidlo", b.getPredmety().get(0).getNazevPr());
        assertTrue(pacidlo.isJeVzaty());
    }
}

package fi.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LuokkaTest {

    @Test
    public void testaaLuokanLuonti() throws Exception {
        Luokka olio = new Luokka();
        assertNotNull("Olio ei ole null", olio);
        assertNull("Luodun olion sana-kenttä on null", olio.getSana());
    }

    @Test
    public void isotteluTesti() {
        Luokka olio = new Luokka();
        olio.setSana("pieni");
        assertEquals("Isoiksi muuttaminen onnistuu",
                "PIENI", olio.getIsoSana());
    }

    @Test
    public void isoSana() {
        Luokka olio = new Luokka();
        olio.setSana("iso");
        assertEquals("Iso sana", "ISO",
                olio.getIsoSana());
    }
}
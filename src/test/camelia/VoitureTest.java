package camelia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    @Test
    public void testVoiture(){
        Voiture v = new Voiture("bmw",54712);
        assertEquals("bmw",v.getMarque());
        assertEquals(54712,v.getPrix());

    }
}

package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    @Test
    public void testVoiture(){
        Voiture v = new Voiture("bmw",54712);
        assertEquals("bmw",v.getMarque());
        assertEquals(54712,v.getPrix());
    }

    @Test
    public void testMarque() {
        Voiture v = new Voiture("c1", 36521);
        v.setMarque("citroen");
        assertEquals("citroen", v.getMarque());
    }
    @Test
    public void testPrix() {
        Voiture v = new Voiture("bmw", 40000);
        v.setPrix(6000);
        assertEquals(6000, v.getPrix());}

}

package service;

import data.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

    @Test
    public void testService(){
        Service s = new Service();
        Voiture v = new Voiture("T-Roc", 10);
        s.ajouter(v);
        assertEquals(v,s.getVoiture().get(0));
    }

    @Test
    public void testPrix(){
        Service s = new Service();

        Voiture v1 = new Voiture("bmw",100);
        Voiture v2 = new Voiture("bmw",50);
        Voiture v3 = new Voiture("bmw",100);
        Voiture v4 = new Voiture("bmw",100);
        Voiture v5 = new Voiture("bmw",100);
        Voiture v6 = new Voiture("citroen",2000000);

        s.ajouter(v1);
        s.ajouter(v2);
        assertEquals(150,s.prix());
        s.ajouter(v3);
        s.ajouter(v4);
        s.ajouter(v5);
        assertEquals(428.0,s.prix());
        s.ajouter(v6);
        assertEquals(1980450,s.prix());

    }
}

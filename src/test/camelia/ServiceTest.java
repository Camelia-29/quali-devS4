package camelia;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    @Test
    public void testService(){
        Service voitures = new Service();

        Voiture v1 = new Voiture("bmw",100);
        Voiture v2 = new Voiture("bmw",50);
        Voiture v3 = new Voiture("bmw",100);
        Voiture v4 = new Voiture("bmw",100);
        Voiture v5 = new Voiture("bmw",100);
        Voiture v6 = new Voiture("citroen",100);

        voitures.ajouter(v1);
        voitures.ajouter(v2);
        voitures.ajouter(v3);
        voitures.ajouter(v4);
        voitures.ajouter(v5);
        voitures.ajouter(v6);

    }
}

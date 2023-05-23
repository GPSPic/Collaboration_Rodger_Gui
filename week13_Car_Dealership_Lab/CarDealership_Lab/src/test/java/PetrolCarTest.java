import cars.PetrolCar;
import engines.PetrolEngine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    PetrolEngine petrolEngine;

    @Test
    public void hasPetrolEngine(){
        petrolEngine = new PetrolEngine();
        petrolCar = new PetrolCar("Guimobile", 10.01);
        System.out.println(petrolCar.getEngines());
//        assertEquals(petrolEngine, petrolCar.getEngines());
    }

}

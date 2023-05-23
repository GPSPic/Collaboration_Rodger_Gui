package cars;

import java.util.ArrayList;
import engines.Engine;
import engines.PetrolEngine;

public class PetrolCar extends Car{

    private ArrayList<Engine> engines;
    private PetrolEngine petrolEngine;

    public PetrolCar(String make, double price){
        super(make, price);
        this.engines = new ArrayList<Engine>() {{
            add(petrolEngine);
        }};
    }

}

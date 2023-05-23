package cars;

import java.util.ArrayList;
import engines.Engine;
import engines.PetrolEngine;

public class PetrolCar extends Car{

//    private ArrayList<Engine> engines;
//    private PetrolEngine petrolEngine = new PetrolEngine();

    public PetrolCar(String make, double price){
        super(make, price);
        PetrolEngine petrolEngine = new PetrolEngine();
        this.addEngine(petrolEngine);
    }

}

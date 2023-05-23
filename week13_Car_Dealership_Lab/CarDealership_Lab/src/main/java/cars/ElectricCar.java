package cars;

import engines.ElectricEngine;

public class ElectricCar extends Car {

    private ElectricEngine electricEngine = new ElectricEngine();

    public ElectricCar(String name, double price){
        super(name, price);
        this.addEngine(electricEngine);
    }

}

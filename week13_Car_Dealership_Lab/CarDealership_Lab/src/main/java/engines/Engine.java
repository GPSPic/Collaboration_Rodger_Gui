package engines;

public abstract class Engine {

    private FuelType fuel;

    public Engine(FuelType fuel){
        this.fuel = fuel;
    }

    public FuelType getFuel() {
        return fuel;
    }

}

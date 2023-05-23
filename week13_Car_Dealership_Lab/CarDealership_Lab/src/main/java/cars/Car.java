package cars;
import engines.Engine;

import java.util.ArrayList;

public abstract class Car {

    private String make;
    private ArrayList<Engine> engines;
    private double price;
    private double damageValue;

    public Car(String make, double price){
        this.make = make;
        this.price = price;
        this.damageValue = 0;
        this.engines = new ArrayList<>();
    }

    public String getMake() {
        return make;
    }

    public ArrayList<Engine> getEngines() {
        return engines;
    }

    public double getPrice() {
        return price;
    }

    public double getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(double damageValue) {
        this.damageValue += damageValue;
    }

    public void sufferDamage(int damageValue) {
        this.setDamageValue(damageValue);
        this.price -= this.damageValue;
    }

    public void repairCar() {
        this.price += this.damageValue;
        this.setDamageValue(0);
    }

    public void addEngine(Engine engine){
        this.engines.add(engine);
    }
}

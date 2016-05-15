package StrategyPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class CarVehicle extends Vehicle {
    public CarVehicle() {
        this.setGoAlgorithm(new GoByDriving());
    }
}

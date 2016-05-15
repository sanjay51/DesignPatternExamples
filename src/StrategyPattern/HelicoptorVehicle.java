package StrategyPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class HelicoptorVehicle extends Vehicle {
    public HelicoptorVehicle() {
        this.setGoAlgorithm(new GoByFlying());
    }
}

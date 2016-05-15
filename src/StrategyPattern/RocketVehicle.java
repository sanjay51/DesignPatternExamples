package StrategyPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class RocketVehicle extends Vehicle {
    public RocketVehicle() {
        this.setGoAlgorithm(new GoByFlyingRocketSpeed());
    }
}

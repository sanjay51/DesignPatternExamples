package StrategyPattern;

import org.testng.annotations.Test;

/**
 * Created by sanjav on 5/15/16.
 */
public class test {

    @Test
    public void testPattern() {
        CarVehicle car = new CarVehicle();
        HelicoptorVehicle helicoptor = new HelicoptorVehicle();
        RocketVehicle rocket = new RocketVehicle();

        car.go();
        helicoptor.go();
        rocket.go();
    }
}

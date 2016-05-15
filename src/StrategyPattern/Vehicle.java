package StrategyPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public abstract class Vehicle {
    GoAlgorithm goAlgorithm;

    public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
        this.goAlgorithm = goAlgorithm;
    }

    public void go() {
        this.goAlgorithm.go();
    }
}

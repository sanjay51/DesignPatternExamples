package StrategyPattern;

/**
 * Created by sanjav on 5/15/16.
 */
public class GoByDriving implements GoAlgorithm {
    @Override
    public void go() {
        System.out.println("I'm driving.");
    }
}

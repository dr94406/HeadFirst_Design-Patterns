package designPattern.StrategyPattern.SimUduck;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("꽥");
    }
}
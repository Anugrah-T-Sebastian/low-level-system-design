package DesignPattern.StrategyPattern.WithStrategyPattern.Strategy;

public class GoodsDriveStratergy implements DriveStratergy {

    @Override
    public void drive() {
        System.out.println("Goods drive capability");
    }
    
}

package DesignPattern.StrategyPattern.WithStrategyPattern.Strategy;

public class PassengerDriveStratergy implements DriveStratergy{

    @Override
    public void drive() {
        System.out.println("passenger drive capability");
    }
    
}

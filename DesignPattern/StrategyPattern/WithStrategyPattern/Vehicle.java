package DesignPattern.StrategyPattern.WithStrategyPattern;

import DesignPattern.StrategyPattern.WithStrategyPattern.Strategy.DriveStratergy;

public class Vehicle {

    DriveStratergy driveStratergy;

    Vehicle(DriveStratergy o ) {
        this.driveStratergy = o;
    }
    
    public void drive() {
        driveStratergy.drive();
    }
}

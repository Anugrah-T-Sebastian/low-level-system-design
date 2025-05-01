package DesignPattern.StrategyPattern.WithStrategyPattern;

import DesignPattern.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStratergy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDriveStratergy());
    }

        
}

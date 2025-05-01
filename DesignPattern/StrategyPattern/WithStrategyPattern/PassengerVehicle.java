package DesignPattern.StrategyPattern.WithStrategyPattern;

import DesignPattern.StrategyPattern.WithStrategyPattern.Strategy.PassengerDriveStratergy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new PassengerDriveStratergy());
    }

   
}

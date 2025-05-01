package DesignPattern.StrategyPattern.WithStrategyPattern;

import DesignPattern.StrategyPattern.WithStrategyPattern.Strategy.GoodsDriveStratergy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new GoodsDriveStratergy());
    }
    
}

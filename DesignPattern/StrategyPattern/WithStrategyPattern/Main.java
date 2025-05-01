package DesignPattern.StrategyPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new GoodsVehicle();
        Vehicle vehicle2 = new PassengerVehicle();
        Vehicle vehicle3 = new SportsVehicle();

        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();
    }
}

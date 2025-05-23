package DesignPattern.FatoryPattern.Factory;

public class ShapeFactory {
    public Shape getShape(String input) {
        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}

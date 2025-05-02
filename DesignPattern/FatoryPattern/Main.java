package DesignPattern.FatoryPattern;

import DesignPattern.FatoryPattern.Factory.Shape;
import DesignPattern.FatoryPattern.Factory.ShapeFactory;

public class Main {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle = shapeFactory.getShape("CIRCLE");
    Shape suquare = shapeFactory.getShape("SQUARE");
}

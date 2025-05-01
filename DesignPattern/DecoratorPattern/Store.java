package DesignPattern.DecoratorPattern;

import DesignPattern.DecoratorPattern.BaseClass.BasePizza;
import DesignPattern.DecoratorPattern.BaseClass.Margherita;
import DesignPattern.DecoratorPattern.Decorator.ExtraChesse;
import DesignPattern.DecoratorPattern.Decorator.Mushroom;

public class Store {
    public static void main(String[] args) {
        BasePizza pizza1 = new Mushroom(new ExtraChesse(new Margherita()));

        System.out.println();
        System.out.println();
        System.out.println("Total price of pizza: " + pizza1.cost());
    }
}

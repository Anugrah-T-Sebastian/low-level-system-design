package DesignPattern.DecoratorPattern.Decorator;

import DesignPattern.DecoratorPattern.BaseClass.BasePizza;

public class Mushroom extends ToppingDecorator {
    
   public Mushroom(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.getBasePizza().cost() + 15;
    }
    
}

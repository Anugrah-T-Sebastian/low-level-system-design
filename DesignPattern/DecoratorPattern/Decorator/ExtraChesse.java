package DesignPattern.DecoratorPattern.Decorator;

import DesignPattern.DecoratorPattern.BaseClass.BasePizza;

public class ExtraChesse extends ToppingDecorator {
    
    public ExtraChesse(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.getBasePizza().cost() + 10;
    }
    
}

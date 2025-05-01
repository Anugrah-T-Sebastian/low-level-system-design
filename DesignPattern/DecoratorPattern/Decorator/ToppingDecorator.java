package DesignPattern.DecoratorPattern.Decorator;

import DesignPattern.DecoratorPattern.BaseClass.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    BasePizza basePizza;

    public ToppingDecorator(BasePizza pizza) {
        this.basePizza = pizza;
    }

    public BasePizza getBasePizza() {
        return basePizza;
    }
    
}

package decoratorpattern.Decorator;

import decoratorpattern.Components.BasePizza;

public class Mushroom extends ToppingsDecorator
{

    public Mushroom(BasePizza basePizza)
    {
        super(basePizza);
    }

    @Override
    public int cost()
    {
        return this.basePizza.cost() + 20;
    }
}

package decoratorpattern.Decorator;

import decoratorpattern.Components.BasePizza;

public class ExtraCheese extends ToppingsDecorator
{

    public ExtraCheese(BasePizza basePizza)
    {
        super(basePizza);
    }

    @Override
    public int cost()
    {
        return this.basePizza.cost() + 50;
    }
}

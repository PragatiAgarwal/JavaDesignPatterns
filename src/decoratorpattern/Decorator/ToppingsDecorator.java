package decoratorpattern.Decorator;

import decoratorpattern.Components.BasePizza;
import java.io.FileReader;

public abstract class ToppingsDecorator implements BasePizza
{
    BasePizza basePizza;

    public ToppingsDecorator(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }

}

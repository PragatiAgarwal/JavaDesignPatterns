package decoratorpattern;

import decoratorpattern.Components.Margherita;
import decoratorpattern.Decorator.ExtraCheese;
import decoratorpattern.Decorator.Mushroom;

public class DriverClass
{
    public static void main(String []args)
    {

        int totalCost = new Mushroom(new ExtraCheese(new ExtraCheese((new Margherita())))).cost();
        System.out.println(totalCost);
    }
}

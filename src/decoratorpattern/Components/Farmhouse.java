package decoratorpattern.Components;

public class Farmhouse implements BasePizza
{

    @Override
    public int cost()
    {
        return 200;
    }
}

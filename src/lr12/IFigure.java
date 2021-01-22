package lr12;

public interface IFigure {
    double Volume();
}

class Sphere implements IFigure
{
    double radius = 1;
    public double Volume()
    {
        double volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
        return volume;
    }
}

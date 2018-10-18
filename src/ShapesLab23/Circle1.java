public class Circle extends Shape
{
    private int radius;

    public Circle(int radius)
    {
        super("Circle")
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.pi*Math.sqrt(radius);
    }
    public double getPerimeter()
    {
        return 2*Math.pi*radius;
    }
}
package pr1t1;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        super();
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return width*length;
    }

    @Override
    public double getPerimeter()
    {
        return 2*width + 2*length;
    }

    @Override
    public String toString()
    {
        return "Shape: rectangle, width: " + getWidth() + ", length: " + getLength() + ", " + super.toString();
    }
}

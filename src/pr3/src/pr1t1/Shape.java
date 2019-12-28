package pr1t1;

public abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape()
    {
        color = "none";
        filled = false;
    }

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return  color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled()
    {
        this.filled = filled;
    }

    @Override
    public String toString()
    {
        if (filled)
            return "color: " + color + ", filled: yes";
        else
            return "color: " + color + ", filled: no";
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

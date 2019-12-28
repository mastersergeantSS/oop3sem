package pr1t1;

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return width;
    }

    public void setSide(double side)
    {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString()
    {
        if (filled)
            return "Shape: Square, " + "Side: " + getLength() + ", color: " + color + ", filled: yes";
        else
            return "Shape: Square, " + "Side: " + getLength() + ", color: " + color + ", filled: no";

    }
}

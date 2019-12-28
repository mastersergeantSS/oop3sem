package pr3t4;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean sameSpeed()
    {
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed)
            return  true;
        else
            return  false;
    }

    @Override
    public String toString()
    {
        return "Movable Rectangle, top left point: " + topLeft.x + ", " + topLeft.y +
                ", bottom right point: " + bottomRight.x + ", " + bottomRight.y;
    }

    @Override
    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
}

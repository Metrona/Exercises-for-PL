public class MyRectangle
{
    private MyPoint top;
    private MyPoint bottom;

    public MyRectangle(int x1, int y1, int x2, int y2)
    {
        this.top = new MyPoint(x1, y1);
        this.bottom = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint top, MyPoint bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }
    
    public int getTopX()
    {
        return top.getX();
    }

    public int getTopY()
    {
        return top.getY();
    }

    public int getBottomX()
    {
        return bottom.getX();
    }

    public int getBottomY()
    {
        return bottom.getY();
    }

    public double getWidth()
    {
        return bottom.distance(top.getX(), bottom.getY());
    }

    public double getHeight()
    {
        return top.distance(top.getX(), bottom.getY());
    }

    public double getPerimeter()
    {
        return getWidth() * 2 + getHeight() * 2;
    }

    public double getArea()
    {
        return getWidth() * getHeight();
    }

    public String toString()
    {
        return "MyRectangle[Top = " + top.toString() + ", Bottom = " + bottom.toString() + ", Width = " + getWidth() + ", Height = " + getHeight() + "]";
    }
}

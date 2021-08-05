public class MyPoint 
{
    private int x = 0;
    private int y = 0;

    public MyPoint()
    {

    }

    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() 
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int[] getXY()
    {
        int[] points = new int[2];
        points[0] = x;
        points[1] = y;
        return points;
    }

    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y)
    {
        int xdiff = this.x - x;
        int ydiff = this.y - y;
        return Math.sqrt((xdiff*xdiff)+(ydiff*ydiff));
    }

    public double distance(MyPoint another)
    {
        int xdiff = this.x - another.x;
        int ydiff = this.y - another.y;
        return Math.sqrt((xdiff*xdiff)+(ydiff*ydiff));
    }

    public double distance()
    {
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }

    public MyPoint[] allocation()
    {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++)
        {
            points[i] = new MyPoint(i+1, i+1);
        }
        return points;
    }
}

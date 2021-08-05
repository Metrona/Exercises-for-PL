public class LineSub extends Point
{
    private Point end;
    
    public LineSub (int beginX, int beginY, int endX, int endY)
    {
       super(beginX, beginY);
       this.end = new Point(endX, endY);
    }

    public LineSub (Point begin, Point end) 
    {
       super(begin.getX(), begin.getY());
       this.end = end;
    }

    public String toString()
    {
        return "Line: (" + super.toString() + ", " + end.toString() + ")";
    }
    
    public Point getBegin()
    {
        Point p = new Point(super.getX(), super.getY());
        return p;
    }

    public Point getEnd()
    {
        return end;
    }

    public void setBegin(Point begin)
    {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public void setEnd(Point end)
    {
        this.end = end;
    }

    public int getBeginX()
    {
        return super.getX();
    }

    public int getBeginY()
    {
        return super.getY();
    }

    public int getEndX()
    {
        return end.getX();
    }

    public int getEndY() 
    {
        return end.getY();
    }
    
    public void setBeginX(int x) 
    {
        super.setX(x);
    }

    public void setBeginY(int y)
    {
        super.setY(y);
    }

    public void setBeginXY(int x, int y)
    {
        super.setXY(x, y);
    }

    public void setEndX(int x)
    {
        end.setX(x);
    }

    public void setEndY(int y)
    {
        end.setY(y);
    }

    public void setEndXY(int x, int y)
    {
        end.setXY(x, y);
    }
    
    public int getLength()
    {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return (int) Math.round(Math.sqrt(xDiff*xDiff + yDiff*yDiff));
    }
    public double getGradient()
    {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.atan2(yDiff, xDiff);
    }
    //Composition is better in this instance due to complications involving getting and setting the points both to begin with and when trying to modify 
}
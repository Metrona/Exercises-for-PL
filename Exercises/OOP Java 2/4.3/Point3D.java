public class Point3D extends Point2D
{
    private float z = 0.0f;

    public Point3D(float x, float y, float z)
    {
        super(x, y);
        this.z = z;
    }

    public Point3D()
    {
        super();
    }

    public float getZ()
    {
        return z;
    }

    public void setZ(float z)
    {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z)
    {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ()
    {
        float[] points = new float[3];
        points[0] = super.getX();
        points[1] = super.getY();
        points[2] = z;
        return points;
    }

    @Override
    public String toString()
    {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}

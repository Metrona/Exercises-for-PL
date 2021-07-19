public class TestMyRectangle
{
    public static void main(String[] args)
    {
        MyRectangle r1 = new MyRectangle(-5, 6, 0, 0);
        System.out.println(r1);

        MyPoint p1 = new MyPoint(6, 6);
        MyPoint p2 = new MyPoint(4, 4);
        MyRectangle r2 = new MyRectangle(p1, p2);
        System.out.println(r2);

        System.out.println(r1.getTopX());
        System.out.println(r1.getTopY());
        System.out.println(r1.getBottomX());
        System.out.println(r1.getBottomY());
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());

        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
    }
}

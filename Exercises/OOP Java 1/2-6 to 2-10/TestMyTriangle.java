public class TestMyTriangle 
{
    public static void main(String[] args)
    {
        MyTriangle t1 = new MyTriangle(5, 5, 2, 2, 0, 0);
        System.out.println(t1);

        MyPoint p1 = new MyPoint(6, 6);
        MyPoint p2 = new MyPoint(4, 4);
        MyPoint p3 = new MyPoint(2, 2);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);

        MyTriangle t3 = new MyTriangle(0, 0, 0, 0, 0, 0);
        System.out.println(t3);

        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
        System.out.println(t2.getType());
        System.out.println(t3.getType());
    }
}

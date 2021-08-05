public class TestMyCircle
{
    public static void main(String[] args)
    {
        MyCircle c1 = new MyCircle(5, 5, 2);
        System.out.println(c1);

        MyPoint p1 = new MyPoint(6, 6); 
        MyCircle c2 = new MyCircle(p1, 5);
        System.out.println(c2);
        
        c1.setRadius(4);
        c1.setCenterX(8);
        c1.setCenterY(6);
        System.out.println("radius is: " + c1.getRadius());
        System.out.println("x is: " + c1.getCenterX());
        System.out.println("y is: " + c1.getCenterY());
        System.out.println("center is: " + c1.getCenter());
        c1.setCenterXY(3, 0);
        System.out.println(c1.getCenterXY()[0]);
        System.out.println(c1.getCenterXY()[1]);
        System.out.println(c1);

        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
        System.out.println(c1.distance(c2));
    }
}

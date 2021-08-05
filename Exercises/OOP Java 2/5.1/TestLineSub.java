public class TestLineSub
{
    public static void main(String[] args)
    {
        Line l1 = new Line(1, 1, 2, 3);
        System.out.println(l1);

        Point p1 = new Point(4, 8);
        Point p2 = new Point(10, 2);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        l1.setBeginX(12);
        l1.setBeginY(3);
        l1.setEndX(5);
        l1.setEndY(1);
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());

        l1.setBegin(p1);
        l1.setEnd(p2);
        System.out.println(l2.getBegin());
        System.out.println(l2.getEnd());

        l2.setBeginXY(4, 10);
        l2.setEndXY(3, 7);
        System.out.println(l1);

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }    
}

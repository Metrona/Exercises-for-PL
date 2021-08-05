public class TestLine
{
    public static void main(String[] args)
    {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        l1.setBeginX(5);
        l1.setBeginY(6);
        l1.setEndX(8);
        l1.setEndY(11);
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());

        l1.setBegin(p1);
        l1.setEnd(p2);
        System.out.println(l2.getBegin());
        System.out.println(l2.getEnd());

        l2.setBeginXY(10, 4);
        l2.setEndXY(7, 3);
        System.out.println(l1);

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
 }
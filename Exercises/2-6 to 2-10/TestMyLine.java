public class TestMyLine
{
    public static void main(String[] args)
    {
        MyLine l1 = new MyLine(5, 5, 0, 0);
        System.out.println(l1);

        MyPoint p1 = new MyPoint(6, 6); 
        MyPoint p2 = new MyPoint(-1, -1);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);
        
        l1.setBeginX(8);
        l1.setBeginY(6);
        l1.setEndX(-1);
        l1.setEndY(-2);
        System.out.println("x is: " + l1.getBeginX());
        System.out.println("y is: " + l1.getBeginY());
        System.out.println("x is: " + l1.getEndX());
        System.out.println("y is: " + l1.getEndY());
        l1.setBeginXY(3, 0);
        l1.setEndXY(-4, -8);
        System.out.println(l1.getBeginXY()[0]);
        System.out.println(l1.getBeginXY()[1]);
        System.out.println(l1.getEndXY()[0]);
        System.out.println(l1.getEndXY()[1]);
        System.out.println(l1);

        System.out.println(l1.getLength());
        System.out.println(l1.gradient());
    }      
}

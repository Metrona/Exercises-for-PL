public class TestShape
{
    public static void main(String[] args)
    {
        Shape s1 = new Shape("green", false);
        System.out.println(s1);

        Shape s2 = new Shape(); 
        System.out.println(s2);
        
        s1.setColor("yellow");
        s1.setFilled(true);
        System.out.println("Color is: " + s1.getColor());
        System.out.println("Filled is: " + s1.isFilled());
    }      
}

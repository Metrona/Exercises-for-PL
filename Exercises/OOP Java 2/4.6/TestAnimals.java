public class TestAnimals
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Chuchu"); 
        System.out.println(d1);
        d1.greets();

        Cat c1 = new Cat("Mimi");
        System.out.println(c1);
        c1.greets();

        Dog d2 = new Dog("DD");
        System.out.println(d2);
        d2.greets(d1);
    }      
}

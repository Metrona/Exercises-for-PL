public class Cylinder
{
   private Circle base;
   private double height;
   
   public Cylinder()
   {
      base = new Circle();
      height = 1.0; 
   }

   public Cylinder(double height)
   {
      base = new Circle();
      this.height = height;
   }

   public Cylinder(double radius, double height)
   {
      base = new Circle(radius);
      this.height = height;
   }

   public double getHeight()
   {
      return height; 
   }
  
   public double getVolume()
   {
      return base.getArea()*height; 
   }

   public String toString()
   {
      return "Cylinder: subclass of " + base.toString() + " height=" + height;
   }

   //inhereitance is better in this instance due to the repetition of making the circle while making the cylinder when using composition where inhereitance doesn't require this repetition 
}
// This class uses a DebugCircle class
// to instantiate a Circle object

import java.util.Scanner;

public class DebugFour1
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int radius;

      System.out.print("Enter a radius for a circle >> ");
      radius = input.nextInt();

      DebugCircle c = new DebugCircle(radius);
      c.showData();
   }
}

class DebugCircle
{
   private int radius;
   private final double PI = 3.14159;

   public DebugCircle(int r)
   {
      radius = r;
   }

   public int getRad()
   {
      return radius;
   }

   public int getDiam()
   {
      return 2 * radius;
   }

   public double getArea()
   {
      return PI * radius * radius;
   }

   public void showData()
   {
      System.out.println("The radius is " + radius);
      System.out.println("The diameter is " + getDiam());
      System.out.println("The area is " + getArea());
   }
}

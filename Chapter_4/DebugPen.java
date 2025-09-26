public class DebugPen
{
   private String color;
   private String point;
   
   public DebugPen()
   {
      color = "black";
      point = "fine";
   }

   public DebugPen(String color, String point)
   {
      this.color = color;
      this.point = point;
   }

   public String getColor()
   {
      return color;
   }

   public String getPoint()
   {
      return point;
   }

   public void showData()
   {
      System.out.println("Pen Color: " + color + " | Point: " + point);
   }

   public static void main(String[] args)
   {
      DebugPen pen1 = new DebugPen();
      pen1.showData();

      DebugPen pen2 = new DebugPen("blue", "medium");
      pen2.showData();

      DebugPen pen3 = new DebugPen("red", "bold");
      pen3.showData();
   }
}


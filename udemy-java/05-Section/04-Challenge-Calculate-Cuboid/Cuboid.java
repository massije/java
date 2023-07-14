import java.lang.*;
import java.util.Scanner;

class Cuboid {
   
   public static void main(String args[]){
   
      Scanner sc = new Scanner(System.in);
      
      int height, length, breadth;
      int totalArea, volumen;
      
      System.out.println("Enter height's value:");
      height = sc.nextInt();
      
      System.out.println("Enter lenght's value:");
      length = sc.nextInt();
      
      System.out.println("Enter breadth's value:");
      breadth = sc.nextInt();
      
      System.out.printf("%d %d %d",height, length, breadth);
      
      totalArea = 2*(length * height) + 2*(breadth * height) + 2*(length * breadth);
      volumen = length * breadth * height;
      
      System.out.println("the total area is: " + totalArea);
      System.out.println("the volumen is: " + volumen);
       
   }

}
import java.lang.*;
import java.util.Scanner;

class CalculateArea {
   
   public static void main(String arg[]){
   
      Scanner scn = new Scanner(System.in);
      
      int base, height;
      float area;
      
      System.out.println("Triangle's base: ");
      base = scn.nextInt();
      
      System.out.println("Triangle's height: ");
      height = scn.nextInt();
      
      // por defecto el resultado sera de tipo double.
      area = (float)(1f/2f)*base*height; // important: nunca poner 1/2 primero, ya que
      // al ser numero enteros, el resultado no sera 0.5, sino que sera 0 y al multiplicar
      // nuestro resultado sera 0.
      // pero si queremos el 1/2 si o si tienes que poner el 1f/2f para que opere con numeros
      // float y asi si nos pueda dar 0.5.
      
      System.out.println("The area is " + area);
   
   }

}
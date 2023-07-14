import java.lang.*;
import java.util.Scanner;

class CalculateAreaTriangle{

   public static void main(String args[]){
   
      Scanner sc = new Scanner(System.in);
      
      int a,b,c;
      float s,area;
      
      System.out.println("Ingrese el lado a: ");
      a = sc.nextInt();
      
      System.out.println("Ingrese el lado b: ");
      b = sc.nextInt();
      
      System.out.println("Ingrese el lado c: ");
      c = sc.nextInt();
      
      s = (1f/2f)*(a+b+c);
      area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));// la clase Math esta disponible en el paquete "lang"
      
      System.out.printf("The area of triangle is %.2f", area);
   
   
   }

}
import java.lang.*;
import java.util.Scanner;


class QuadraticEquation {

   public static void main(String args[]){
   
      Scanner sc = new Scanner(System.in);
      
      int a,b,c;
      float r1, r2;
      
      System.out.println("Enter a's value: ");
      a = sc.nextInt();
      
      System.out.println("Enter b's value: ");
      b = sc.nextInt();
      
      System.out.println("Enter c's value: ");
      c = sc.nextInt();
      
      r1 = (-b + (float)Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
      r2 = (-b - (float)Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
      
      System.out.println("r1: " + r1);
      System.out.println("r2: " + r2);
   
   }

}
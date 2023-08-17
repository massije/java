import java.lang.*;
import java.util.Scanner;

class Tests{

   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      
      /*
      String name = "Jorge";
      int x1 = 20;
      int x2 = 30;
      int result = x1 + x2;
      
      System.out.println(name + x1 + x2);+
      System.out.println("The sum of " + x1 + " and " + x2 + " is " + (x1 + x2));
      
      
      double n = 1.2523;
      int x = 40;
      char d = 'A';
      
      System.out.printf("%-10s %n", d);
      
      
      // comparando Strings
      String str1 = new String("Java Program");
      String str2 = new String("Java Program");
      
      if (str1 == str2){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
      
      
      
      */
      // creando string de varias formas
      
      String str1 = "Hello";
      String str2 = new String("Hi");
      
      char c[] = {'H','o','l','a'};
      String str3 = new String(c);
      
      byte b[] = {65,66,67,68};
      String str4 = new String(b);
      
      System.out.println(str1);
      System.out.println(str2);
      System.out.println(str3);
      System.out.println(str4);
      
      
      
   
   }

}
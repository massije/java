import java.lang.*;
import java.util.Scanner;

class Tests {
   public static void main(String[] args) {
      for (int line = 1; line <= 5; line++) {
         for (int raya = 0; raya <= 5 - line; raya++) {
            System.out.print("-");
         }
         for (int i = 1; i <= (2 * line - 1); i++) {
            System.out.print(2 * line - 1);
         }
         for (int raya = 0; raya <= 5 - line; raya++) {
            System.out.print("-");
         }
         System.out.println();
      }
   }
}
import java.lang.*;
import java.util.Scanner;

class Tests {
   public static void main(String[] args) {
   
   for (int linea = 1; linea <= 4; linea++) { 
      // figura __/
      for (int space = 1; space <= (12 - 3 * linea); space++) {
         System.out.print(" ");
      }
      System.out.print("__/");
      
      // figura de 2 puntos :
      for (int colon = 1; colon <= (3 * linea - 3); colon++) {
         System.out.print(":");
      }
      
      // figura ||
      for (int rayaVertical = 1; rayaVertical <= 2; rayaVertical++) {
         System.out.print("|");
      }
      
      // figura de 2 puntos :
      for (int colon = 1; colon <= (3 * linea - 3); colon++) {
         System.out.print(":");
      }
      
      // figura \__
      System.out.print("\\__");
      
      System.out.println();
   }

//    for (int linea = 1; linea <= 4; linea++) {
//       
//    }
//    
   
          
//          __/||\__
//       __/:::||:::\__
//    __/::::::||::::::\__
// __/:::::::::||:::::::::\__
// |""""""""""""""""""""""""|

// 12 de distancia hasta esto ||


   }
   
   public static void packCuatroLineasVerticales() {
      for (int linea = 1; linea <= 4; linea++){
         for ( int espacio = 1; espacio <= 9; espacio++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   public static void packDoceLineasVerticales() {
      for (int pack = 1; pack <= 3; pack++) {
         packCuatroLineasVerticales();
      }
   }
   
   public static void piramide() {
   
   
   }
   
   
}
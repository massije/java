import java.lang.*;
import java.util.Scanner;

class Tests {

   static final String TUBO = "||";
   static final char ESPACIO = ' ';
   static final String ladoIzquierdo = "_/";
   static final String ladoDerecho = "\\_";
   
   public static void main(String[] args) {
      dibujarTorre();
   }
   
   public static void dibujarTorre() {
      dibujarCuatroLineasVerticales();
      dibujarPiramide();
      dibujarPiramideInvertida();
      dibujarDoceLineasVerticales();
      dibujarPiramide();
   }
   
   public static void dibujarDoceEspacios() {
      for (int espacio = 1; espacio <= 12; espacio++) {
         System.out.print(ESPACIO);
      }
   }
   
   public static void dibujarCuatroLineasVerticales() {
      for (int linea = 1; linea <= 4; linea++){
         dibujarDoceEspacios();
         System.out.println(TUBO);
      }
   }
   
   public static void dibujarDoceLineasVerticales() {
      for (int grupo = 1; grupo <= 3; grupo++) {
         dibujarCuatroLineasVerticales();
      }
   }
   
   public static void dibujarPiramideInvertida() {
      String uveInvertida = "/\\";
      for (int linea = 1; linea <= 4; linea++) {
         for (int space = 1; space <= (2 * linea - 2); space++) {
            System.out.print(ESPACIO);
         }
         //Figura \_
         System.out.print(ladoDerecho);
         // Figura /\
         for (int vInvertida = 1; vInvertida <= (11 - (2 * linea - 2)); vInvertida++) {
            System.out.print(uveInvertida);
         }
         System.out.println(ladoIzquierdo);
      }
   }
   
   public static void dibujarPiramide() {
      char rayaVertical = '|';
      char dosPuntos = ':';
      char barraBaja = '_';
      char comillaDoble = '\"';
      for (int linea = 1; linea <= 4; linea++) { 
         // figura __/
         for (int space = 1; space <= (12 - 3 * linea); space++) {
            System.out.print(ESPACIO);
         }
         System.out.print(barraBaja + ladoIzquierdo);
         // figura de 2 puntos :
         for (int colon = 1; colon <= (3 * linea - 3); colon++) {
            System.out.print(dosPuntos);
         }
         System.out.print(TUBO);
         // figura de 2 puntos :
         for (int colon = 1; colon <= (3 * linea - 3); colon++) {
            System.out.print(dosPuntos);
         }
         // figura \__
         System.out.println(ladoDerecho + barraBaja);
      }
      // figura |""""""""""""""""""""""""|
      System.out.print(rayaVertical);
      for (int comillas = 1; comillas <= 24; comillas++) {
         System.out.print(comillaDoble);
      }
      System.out.println(rayaVertical);
   }
}
import java.lang.*;
import java.util.Scanner;

/******************************************************************************************************************
 * 
 * Nombre: Jorge Martin Del Pino Contreras 
 * Fecha: 15/10/2023 
 * Modulo: Programación. 
 * UD1. 
 * Tarea: PROG01 - Tarea evaluativa 02: Programa que crea una figura simétrica 
 * Autoevaluación: https://docs.google.com/document/d/1KPFIshehQb2mBDWfngPgqkrnEbVzVSoQQSrSzSTrtfA/edit?usp=sharing
 *                 https://www.youtube.com/watch?v=iPZrICQ5XcE
 * Descripción del programa: El programa imprime por consola una figura simétrica que tiene forma de torre.
 *                           Y esta torre a su vez esta compuesta por otras figuras o simbolos independientes 
 *                           que de forma conjunta forman la torre.
 *
 *******************************************************************************************************************/
 
// Creamos la clase. El nombre debe coincidir con el del fichero .java
class Tests {
  // Creamos método main. Siempre debe existir y siempre se define igual.

  
   public static void main(String[] args) {
      cuadrado("jorge martin");
   }
   
   public static void cuadrado(String palabra) {
      int tamanioPalabra = palabra.length();
      dibujarGuiones(tamanioPalabra);
      for (int fila = 1; fila <= tamanioPalabra; fila++) {
         revertirPalabra(palabra);
         System.out.println();
      }
      dibujarGuiones(tamanioPalabra);
   }

   public static void dibujarGuiones(int tamanio) {
      int newTamanio = tamanio * 2 + 2;
      for (int column = 1; column <= newTamanio; column++) {
         System.out.print("-");
      }
      System.out.println();
   }
   
   public static void revertirPalabra(String palabra) {
     char letra;
     int tamanio = palabra.length() - 1;
     System.out.print("|");
      for (int column = 0; column <= tamanio; column++) {
         letra = palabra.charAt(tamanio - column);
         System.out.print(letra + " ");
      }
      System.out.print("|");
   }
}
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
   
      int numero = 5;
      
      int resultado = tablaMultiplicar(numero);
      
      System.out.println("el resultado es : " + resultado);
      
      int nuevoResultado = resultado + 10;
      
      System.out.println("el resultado es : " + nuevoResultado);
      
   
   }   
   
   public static int tablaMultiplicar(int numeroRecibido) {
      int total = 0;
      for (int i = 1; i <= 10; i++) {
         int resultado = numeroRecibido * i;
         System.out.println(numeroRecibido + " x " + i + " = " + resultado);
         total += resultado;
      }
      return total;
   }

                        

}
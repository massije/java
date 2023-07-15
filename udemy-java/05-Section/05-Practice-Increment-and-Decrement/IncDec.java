import java.lang.*;
import java.util.Scanner;

class IncDec {

   public static void main(String[] args){
   
      // En estas dos operaciones tanto el pre increment or post increment son lo mismo
      // o dan el mismo resultado pero solo si los usas solos, es decir sin ninguna otra variable
      // a su alrededor.
      
      System.out.println("Increment");
      int x = 5;
      x++;
      System.out.println(x);
      
      x = 5;
      ++x;
      System.out.println(x);
      
      // pero cuando involucras otra variable, el comportamiento de ambas cambia.
      x = 5;
      int y;
      
      y = ++x;// lo que ocurre en esta linea es que al usar el pre increment
      // primero se realizara el incremento a la variable x y luego se asignara
      // el valor actualizado a y.
      // es decir x pasa a ser 6 y luego este nuevo valor(6) se le asigna a la 
      // variable  "y" y por eso el valor de ella es 6.
      System.out.println("x's value: " + x);
      System.out.println("y's value: " + y);
      
      x = 5; y = 0;
      
      y = x++;// lo que ocurre en esta linea es que al usar el post increment
      // primero se asigna el valor original de la variable x a la variable "y"
      // y despues se realiza el incremento a la variable x.
      // es decir y pasa a ser 5 porque ese es el valor original de x y despues
      // se realiza la operacion de incremento a x y pasaria a ser 6.
      
      System.out.println("x's value: " + x);
      System.out.println("y's value: " + y);
      
      // ESTE MISMO COMPORTAMIENTO OCURRE CON LOS OPERADORES DE DECREMENTO
      
      System.out.println("Decrement");
      
      // using pre decrement
      int z = 3;
      
      --z;
      
      System.out.println(z);
      
      //using post decrement
      z = 3;
      z--;
      System.out.println(z);
      
      //using pre decrement with other variables
      z = 3;
      int c;
      
      c = --z;
      System.out.println("z's value: " + z);
      System.out.println("c's value: " + c);
      
      //using post decrement with other variables
      z = 3;
      c = 0;
      c = z--;
      System.out.println("z's value: " + z);
      System.out.println("c's value: " + c);
   
   }

}
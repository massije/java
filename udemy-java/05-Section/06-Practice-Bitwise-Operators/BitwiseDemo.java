import java.lang.*;


class BitwiseDemo{
   
   public static void main(String[] args){
   
      // using AND
   
      /*
      int x = 10;
      int y = 6;
      int z;
      
      z = x & y;
      
      System.out.println("z = " + z); // el resultado sera 2
      */
      
      // ahora haremos lo mismo que arriba pero esta vez con número binarios, ya que 
      // los enteros nos permiten inicializar una variable en binario
      // para ello tenemos que poner el primero "0b" + el numero en binario.
      
      /*
      int x = 0b00001010; // a pesar de ponerlo en binario, el numero sera imprimido en decimal por defecto.
      int y = 0b00000110;
      int z;
      
      z = x & y; // comprobamos que nos da el mismo resultado que en el fragmento de arriba. 2
      
      System.out.println(z);
      */
      
      // using OR
      
      /*
      int x = 0b1111; // este es el número 15
      int y = 0b101010; // este es el número 42
      int z;
      
      z = x | y; // el resultado es 47
      
      System.out.println(z);
      */
      
      // using XOR
      
      /*
      int x = 0b1111; // este es el número 15
      int y = 0b101010; // este es el número 42
      int z;
     
      z = x ^ y; // el resultado es 37
      
      System.out.println(z);
      */
      
      // using LEFT SHIFT
      /*
      int x = 0b1; // valor en decimal de 1
      
      int y;
      
      y = x << 2; // el resultado es 2
      
      System.out.println(y);
      */
      
      // using RIGHT SHIFT 
      
      int x = 0b1000;
      int y;
      
      y = x >> 2; && // el resultado es 2
      
      System.out.println(y);
       
      
   
   }

}
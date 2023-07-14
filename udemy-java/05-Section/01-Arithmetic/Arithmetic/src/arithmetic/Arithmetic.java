
package arithmetic;

public class Arithmetic {

    public static void main(String[] args) {
        
        /*
        int a = 14, b = 5;
        
        int c = a / b;
        int r = a % b;
        
        // Aquí aunque el resultado deberia ser 2.8 es 2, y esto es debido a que
        estamos dividiendo dos valores enteros por lo que el resultado será entero.
        System.out.println(c); 
        
        // Aqui el resultado es 4 porque es el resto de la divis´
        System.out.println(r);
        */
        
        /*
        int a = 14, b = 5;
        
        // Ahora si que el resultado es 2.8 y es porque hemos hecho que la 
        // variable sea de tipo float porque el resultado que nos dara a / b es 
        // float y luego hay que hacer y aquí usamos el casting en una variable
        // y asi luego pueda suceder la coercion por detras.
        
        // El casting es un procedimiento para transformar una variable primitiva
        // de un tipo a otro, o transformar un objeto de una clase a otra clase 
        //siempre y cuando haya una relación de herencia entre ambas
        float c = (float)a / b;
        
        System.out.println(c);
        */
        
        /*
        float a = 14.3f, b = 3.2f;
        
        float r = a % b; // el operador para hallar el resto tambien funciona 
        // con los numeros flotantes o decimales.
        
        System.out.println(r);
        */
        
        /*
        byte a = 10;
        short b = 15;
        
        int c = a + b; // Siempre que operemos con valores de tipo entero,
        // ya sea char, byte , short , int, el tipo de la variable que
        // almacenara el valor sera de tipo int.
        // y esto es porque "a"(tiene un 1 byte de size) y "b"(tiene 2 bytes de size)
        // entonces 3 bytes no puede ser almacenador ni en variables de tipo byte
        // o variables de tipo short.
        // es por ello que tenemos que poner una varaible de tipo entero pero con mayor capacidad 
        // de almacenamiento, como lo es int o long.
        
        System.out.println(c);
        */
        
        /*
        float a = 12.5f;
        long b = 1234;
        
        float c = a * b; // Tiene que ser float o double ya que a pesar que la 
        // variable de tipo long es mas grande en size, no podra almacenar 
        // numero con parte decimal, es por ello que tiene que ser o float o 
        // double
        
        System.out.println(c);
        */
        
        /*
        float a = 12.5f;
        double b = 123;
        
        double c = a * b; // Tiene que ser double ya que al ser las dos variables
        // de tipo flotante, se coge el tipo de varible del que tiene mayor size.
        
        
        System.out.println(c);
        */
        
        /*
        char a = 40;
        int b = 25;
        
        char c = (char)(a + b); // aqui si hemos podido poner char pero porque 
        // hemos hecho un casting a todo el resultado. es decir hemos pasado 
        // el resultado que era un int a char.
        int d = a + b; // Aquí no se puede poner char porque el resultado es un int
        // por lo que el tipo de variable debe ser int.
        
        System.out.println(c);
        */
        
          
    }
    
}

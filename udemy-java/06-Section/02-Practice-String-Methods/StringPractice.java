import java.lang.*;

class StringPractice{

   public static void main(String[] args){
   
      /*
      String str = new String("netbeans");
      
      System.out.println(str);
      
      int len = str.length();
      
      System.out.println(len);
      
      String str1 = str.toUpperCase();
      str = str.toUpperCase();
      
      System.out.println(str1);
      System.out.println(str);
      
      System.out.println(str == str1);
      
      String str2 = new String("   netbeans   ");
      
      System.out.println(str2);
      
      String str3 = str2.trim();
      
      System.out.println(str3);
      
      
      String str4 = str.substring(1,7);
      
      System.out.println(str4);
      
      String str5 = str.toLowerCase().replace('b','p');
      
      System.out.println(str5);
      */
      
      /*
      String str = "Mr. Shahrukh Khan";
      
      boolean answer = str.startsWith("Mr.");
    
      System.out.println(answer);
      System.out.println(str.startsWith("Shah"));
      System.out.println(str.startsWith("Shah", 4));
      System.out.println(str.endsWith("Khan"));
      System.out.println(str.charAt(4));
      
      for(int i=0; i<str.length(); i++){
         System.out.println(str.charAt(i));
      }
      */
      
      /*
      String str = "www.udemy.co.in";
      
      System.out.println(str.indexOf('.'));
      System.out.println(str.indexOf('.',4));
      System.out.println(str.indexOf("udemy"));
      System.out.println(str.lastIndexOf('.'));
      System.out.println(str.lastIndexOf('.',11));
      System.out.println(str.lastIndexOf('.',8));
      System.out.println(str.lastIndexOf("udemy"));
      */
      
      /*
      String str1 = "Pyramid";
      String str2 = "Pyramid";
      String str3 = "pyramid";
      String str4 = new String("Pyramid");
      
      System.out.println(str1.equals(str2));
      System.out.println(str1 == str2);
      System.out.println(str1 == str3);
      System.out.println(str1.equals(str3));
      System.out.println(str1.equalsIgnoreCase(str3));
      System.out.println(str4);
      System.out.println(str4.equals(str1));
      System.out.println(str4 == str1);
      */
      
      String str1 = "china wall";
      String str2 = new String("china wall");
      String str3 = new String("China Wall");
      
      System.out.println(str2.compareTo(str1)); // --> Este metodo devuevle 0 si son iguales
      System.out.println(str1.compareToIgnoreCase(str2));// --> Lo mismo que arriba pero con con
      // la diferencia de ingora si la cadena es mayuscula o minuscula.
      System.out.println(str1.contains(" wall")); // --> este metodo comprueba si una cadena contiene
      // la cadena que le hemos dicho que haga.
      System.out.println(str1.concat(" "+str2)); // --> Esta cadena nos permite concatenar o unir Strings
      
      int number = 1997;
      System.out.println("Esta es una variable de tipo int: " + number);
      
      String number_to_string = String.valueOf(number);
      System.out.println("Esta es una varible de tipo string: " + number_to_string);
      
   }

}
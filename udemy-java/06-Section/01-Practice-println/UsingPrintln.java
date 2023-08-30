import java.lang.*;

class UsingPrintln{
   
   public static void main(String[] args){
   
      int x1 = 20;
      int x2 = 30;
      float a1 = 23f;
      double a2 = 24;
      char letter = 'A'; // 65 in ASCII
      
      int result = x1 + (int)a1;
      float otherResult = a1 + (float)a2;
      double resultOther = a1 + a2;
   
      System.out.println(a1 + " is of type " + ((Object)a1).getClass().getSimpleName());
      System.out.println("The result is " + result);
      System.out.println("The second result is " + otherResult);
      System.out.println("The third result is " + resultOther);
      System.out.println(20 + letter); // The result is 85 because is dealed like a mathematic operation
      System.out.println(letter + 20); // here the same. And it's because the varible letter is a dealed a integer
   
   }

}
package recersion;
import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      while(true){
         System.out.println("Enter a number of the nth fibonacci number:");
         int n = in.nextInt();
         in.close();
         System.out.println(fibTail(n));   
      }
   } 

   public static int fib(int n){
      if (n <= 2) return 1;
      return fib(n-2)+fib(n-1);
   }

   public static int fibIter(int a, int b, int n){
      if ( n <= 2 ) {
         return b;
      } else {
         return fibIter( b, a+b, n-1 );
      }
   }

   public static int fibTail(int n) {
      return fibIter(1, 1, n);
   }
}

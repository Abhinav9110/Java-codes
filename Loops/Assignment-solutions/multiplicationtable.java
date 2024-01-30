// Write a Java program to print a multiplication table for a given number 'n'.
//Solution:
import java.util.Scanner;
class Multiplication{


   public static void main(String[] args) {
       System.out.print("Enter the Number:");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("The Multiplication table of above number is:" );
       for (int i = 1; i <= 10; i++) {




           System.out.println( n + "*" + i + "=" + n * i);
       }
   }
}



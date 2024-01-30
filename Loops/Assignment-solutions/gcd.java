//Write a Java program to find the GCD  of two numbers using a loop.
//Solution:
import java.util.Scanner;
class greatestCommonDivisor{


   public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1st Number:");
       int n1 = sc.nextInt();
       System.out.println("Enter 2nd Number:");
       int n2 = sc.nextInt();
       while(n1!=n2){
           if(n1>n2){
               n1=n1-n2;
           }
           else
               n2=n2-n1;
       }
       System.out.println("The GCD of first and second Number is :"+n2);
   }
}

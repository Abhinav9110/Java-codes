//Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
//Solution:

import java.util.Scanner;
class FibonacciSeries{
   public static void main(String args[])
   {
       System.out.println("Enter the Number of terms to Print:");
       Scanner sc = new Scanner(System.in);


       int n = sc.nextInt();
       int n1=0,n2=1,n3,i;
       System.out.print(n1+" "+n2);


       for(i=2;i<n;++i)
       {
           n3=n1+n2;
           System.out.print(" "+n3);
           n1=n2;
           n2=n3;
       }
   }
}


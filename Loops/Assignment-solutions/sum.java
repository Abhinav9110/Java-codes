//Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
//Solution:
import java.util.Scanner;
class Number{


   public static void main(String[] args){
       System.out.print("Enter the Number:");
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       int sum=0;
       for(int i=1;i<=n;i++){
           sum+=i;
       }
       System.out.print("The Sum of Natural number is "+sum);
   }
}

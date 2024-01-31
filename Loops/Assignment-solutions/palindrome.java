//Q4. Write a Java program to check if a given string is a palindrome or not using a loop.
//Solution:
import java.util.Scanner;
class Palindrome{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String:");
       String a = sc.nextLine();
       boolean flag=true;
       a=a.toLowerCase();
       for(int i=0;i<a.length()/2;i++){
           if(a.charAt(i)!=a.charAt(a.length()-1-i)){
               flag=false;
               break;
           }
       }
       if(flag){
           System.out.print("The given string is Palindrome:"+a);
       }
       else
           System.out.println("The given string is not Palindrome");
   }
}



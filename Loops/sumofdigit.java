package Loop;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        int sum=0;
        while(n!=0){
            int s=n%10;
            sum+=s;
            n/=10;

        }
        System.out.println(sum);

    }
}

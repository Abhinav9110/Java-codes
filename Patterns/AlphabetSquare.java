package Pattern;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int x=sc.nextInt();

//        for( int i=1;i<=x;i++){
//            for(int j=1;j<=x;j++){
//                System.out.print((char)(j+64) +" ");
//
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {



            }

            System.out.println(i+ " ");

        }
    }
}

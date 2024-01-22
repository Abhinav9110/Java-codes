package conditionals;
import java.util.Scanner;
public class divisiblebyFive {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        if (a% 5==0) System.out.println("Divisible by 5");
        else
            System.out.println("Not divisible by 5");


    }
}

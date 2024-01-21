package conditionals;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cost price");
        int cp= scan.nextInt();

        System.out.println("Enter selling price");
        int sp= scan.nextInt();

        if(sp>cp) System.out.println("profit is"+(sp-cp));
        if(cp>sp) System.out.println("Loss");


    }
}

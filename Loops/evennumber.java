package Loop;

public class evennumber {
    public static void main(String[] args) {
        System.out.println("Even number between 1 to 100");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}

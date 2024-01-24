package Loop;

public class divisibleby5and3 {
    public static void main(String[] args) {
        System.out.println("Even number between 1 to 100");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3==0) {
                System.out.println(i + " ");
            }
        }
    }
}

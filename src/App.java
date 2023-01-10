import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter with a int number");
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();

        System.out.println("Multiplication Table of " + x);
        for (int i = 0; i <= x; i++) {
            int mult = i * x;
            String text = i + " x " + x + " = " + mult;
            System.out.println(text);
        }
    }
}

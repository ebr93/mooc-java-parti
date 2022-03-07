
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(scanner.nextLine());

        int a = n1 + n2;
        int s = n1 - n2;
        int m = n1 * n2;

        double d = 1.0 * n1 / n2;

        System.out.println(n1 + " + " + n2 + " = " + a);

        System.out.println(n1 + " - " + n2 + " = " + s);

        System.out.println(n1 + " * " + n2 + " = " + m);

        System.out.println(n1 + " / " + n2 + " = " + d);

    }
}

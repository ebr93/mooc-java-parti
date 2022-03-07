
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while (true) {
            System.out.println("Give a number:");
            int n1 = Integer.valueOf(scanner.nextLine());

            if (n1 == 0) {
                break;
            } 
            if (n1 > 0 || n1 < 0) {
                number = number + 1;
            }
        }
        System.out.println("Number of numbers: " + number);
    }
}

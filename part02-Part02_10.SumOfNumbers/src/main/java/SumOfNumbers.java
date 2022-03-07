
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variable of numbers that are added
        int n1 = 0;
        //loop
        while (true) {
            System.out.println("Give a number:");
            //variable that the user inputs
            int n2 = Integer.valueOf(scanner.nextLine());

            //Condition to break block if 0 is entered
            if (n2 == 0) {
                break;
            }
            //allows to keep addition of n1 by adding the value input of n2
            n1 = n1 + n2;
        }
        //Prints out the sum of numbers (n1)
        System.out.println("Sum of the numbers: " + n1);
    }
}

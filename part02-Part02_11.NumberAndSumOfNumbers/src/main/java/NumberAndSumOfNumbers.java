
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //The 2variables that will help us keep track 
        //of Input and Addition of numbers.
        int numberInput = 0;
        int numberAddition = 0;

        //Loop
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //Condition to break the code once 0 is input as variable
            if (number == 0) {
                break;
            }
            //Adapting the variables within this loop 
            //to track the desired information.
            numberInput = numberInput + 1;
            numberAddition = numberAddition + number;
        }
        System.out.println("Number of numbers: " + numberInput);
        System.out.println("Sum of the numbers: " + numberAddition);
    }
}

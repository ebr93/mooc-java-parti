
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double addition = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            
            int input = Integer.valueOf(scanner.nextLine());

            //It was simple to add the AVERAGE formula within the Condition Break
            //and it was meant to keep the code simple, instead of having too many variables around
            if (input == 0) {
                addition = addition / count;
                break;
            }
            count = count + 1;
            addition = addition + input;
        }
        System.out.println("Average of the numbers: " + addition);
    }
}
/*
Seems I was wrong about my approach, instead I should of put the AVERAGE formula within the Print out at the end
CORRECT APPROACH:
System.out.println("Average of the numbers: " + (1.0 * addition / count));
*/

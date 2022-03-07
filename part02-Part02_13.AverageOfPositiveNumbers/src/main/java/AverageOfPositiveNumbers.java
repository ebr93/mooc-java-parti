
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input < 0) {
                continue;

            }

            count = count +1;
            sum = sum + input;
        }

        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / count);
        }
    }
}
/*
I pretty much got this correct on the first try.
For the Line Print out I had to add conditions in order to only print out the appropriate response. If I would not
have done that the (count == 0) AND a (Nan) would have printed out together. To avoid that I had to add an else.

To  only count positive integers I had to add a condition for negative numbers, which would just restart the loop.
Since I made sum a double then I did not have to add a decimal within the prinout. As the example provided does not 
include doubles at all. This is the way they did it:
        } else {
            System.out.println(1.0 * sum / count);
*/
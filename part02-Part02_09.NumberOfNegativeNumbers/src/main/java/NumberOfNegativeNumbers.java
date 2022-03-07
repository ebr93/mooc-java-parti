
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while (true) {
            System.out.println("Give a number:");
            int n1 = Integer.valueOf(scanner.nextLine());

            if (n1 == 0) {
                break;
            } 
            //This was not the simplest way, could've instead left the other 2
            //if statements and left this without one. Just (number)
            if (n1 < 0) {
                number = number + 1;
            }
            if (n1 > 0) {
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + number);
    }
}

/*
In this case it turns out that we only want to count negative numbers.
To make it work we have to set up our conditional statements to count
negative number input by setting the rule (n1 <0). 
number = number + 1
Helps count the input of negative numbers for this exercise. Variable was 
made before the loop so it is able to be printed out outside the loop.

I also think I was able to write my code in the most simple way possible by not 
making unnecesary else statements. 

To make positives keep going is by doing the (continue;) command, it helps to 
restart it. In this case we use the command (break;) to stop the 
counting and print out the input of negative numbers.
*/

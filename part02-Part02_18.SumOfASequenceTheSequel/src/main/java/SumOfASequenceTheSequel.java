
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int number = first; number <= last; number++) {
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}

/*
MY ANSWER

        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int sum= 0;
                                                            //Loop will stop once (first) is greater to (last), stoping at equal value
        while (first <= last) {
                                                            // in this case (sum) will have added the value of (first) each loop
            sum += first;
                                                            // (first) will have +1 value added each loop
            first ++;
        }
        System.out.println("The sum is " + sum);



MOOCS answer has 4 variables, instead of the 3 I use. 

They have (int number = first). Makes it easier to maneuver. 

        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        int sum = 0;
 
        int number = first;

    // Since number has the same value as first it keeps adding itself until it is greater than (last)
    // Sum has all the value 

        while (number <= last) {
            sum += number;
            number++;
        }
 
        System.out.println("The sum is " + sum);
*/
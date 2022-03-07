
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        int n = 0;

        /* I was messing up with the loop as I input the wrong symbol:
                    sum < last
        This means it run the program but stopped one before, so the value on n was smaller by the last number ran
        which would of been equivalent to number input a (last)
        */ 
        
        for (int sum = 1; sum <= last; sum++) {
            n += sum;
        }
        System.out.println("The sum is " + n);
    }
}
/*
MOOC Solution 
        int lastNumber = Integer.valueOf(scanner.nextLine());
 
        int sum = 0;
        int n = 1;
        while (n <= lastNumber) {
            sum += n;
            n++;
        }
 
        System.out.println("The sum is " + sum);
*/
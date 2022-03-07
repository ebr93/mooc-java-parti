
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(6, 14);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int numberPrint = 0;
        while (numberPrint <= end) {
            numberPrint+=3;

            if (beginning <= numberPrint && numberPrint <= end) {
                System.out.println(numberPrint);
            }

        }

    }

}

/* 
MOOC ANSWER TOOK A DIFFERENT APPROACH, BY NOT USING AN EXTRA VARIABLE AGAIN
THEIRS ADDS VALUE TO (BEGINNING) BY 1 AND IF ITS(% 3 == 0) THEN IT PRINTS
MY ORIGINAL THOUGHT PROCESS WAS SOMETHING LIKE THIS. BETTER ANSWER TBH

    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
 
            beginning = beginning + 1;
*/
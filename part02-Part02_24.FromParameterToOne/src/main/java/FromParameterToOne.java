import javax.swing.plaf.synth.SynthSpinnerUI;

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number) {
        int subtractNumber = 1;
        while (1 <= number) {
            System.out.println(number);
            number = number - subtractNumber;
        }

    }

}

// ERROR 1: I was making (subtractNumber) into a positive, which kept adding instead by:
//  making (subtractNumber --) which then reacted to (number - subtractNumber);
// the 2 negative signs made it into a positive
// ERROR 2: by allowing (subtractNumber) to stay its negative value increased by -1, ruining pattern
// ERROR 3: I needed (Sysout) to happen before the expression (number = number - subtractNumber;)

/*
MOOC SOLUTION

    public static void printFromNumberToOne(int number) {
        while (number >= 1) {
            System.out.println(number);
            number = number - 1;

Their solution is cleaner than mine, added 1 variable that didn't need to be added.
*/
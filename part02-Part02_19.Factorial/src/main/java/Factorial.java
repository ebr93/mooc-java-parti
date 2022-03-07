
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int product = 1;

        //Both methods pretty much require the same variables, there is a slight difference
        //(for) requires the ONE variable to be included within loop condition 3 times!!!
        //(while) has all variables defined outside and are stated in a different order
        //VARIABLE THAT WILL BE PRINTED OUT HAS TO BE DEFINED OUTSIDE THE LOOP
        int variable = 1;
        while (variable <= number) {
            product = product * variable;
            
            variable++;
        }

        System.out.println("Factorial: " + product);
    }
}

/*
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        int product = 1;

        int variable = 1;

        when (variable <= number) {
            product = product * variable;

            variable++;
        }

        System.out.println("Factorial: " + product);

llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        int product = 1;

        for (int variable = 1; variable <= number; variable++) {
            product = product * variable;
        }

        System.out.println("Factorial: " + product);

        I WAS GETTING CONFUSED WITH THE (FOR) LOOP, VARIABLE++ IS NOT 
        INPUTTED UNTIL THE (PRODUCT * VARIABLE) HAPPENS FIRST
        THEN (VARIABLE++)

        ORDER OF EVENTS:
        1. (PRODUCT * VARIABLE)
        2. (VARIABLE++)
*/

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int tracker = 0;
        int even = 0;
        int odd = 0;

        // IF YOU TECHNICALLY HAVE A BUTTON OR 1 NUMBER/VARIABLE THAT WILL SHUT DOWN THE PROGRAM 
        // THEN ITS EASIER TO DO (BOOLEAN)/(TRUE) VALUE. OTHERWISE IF ITS DEPENDANT OF INPUTS THEN
        // VARIABLES/MATHEMATICAL CONDITIONS WILL BE IT.
        while (true) {

            /*
            So it seems I can use multiple (if) statements which will qualify and act depending if
            the CONDITION is TRUE OR NOT
            I have a few errors
            1. I used too many if statements, coould've turned it down to 2
            2. (sum += input;) and (tracker++) DID NOT NEED AN IF STATEMENT
            3. I could of subtract TRACKER - EVEN to get ODD number count
            4. I shoul have created a VARIABLE FOR AVERAGE, instead of doing the math in print out

            5. OVERALL I NEED TO GET CLEANER WITH MY CODE
            */
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            } 

            sum += input;
            tracker++; 
            if (input % 2 == 0) {
                even++;
            } 
            if (input % 2 != 0) {
                odd++;
            }

        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + tracker);
        System.out.println("Average: " + (1.0 * sum / tracker));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

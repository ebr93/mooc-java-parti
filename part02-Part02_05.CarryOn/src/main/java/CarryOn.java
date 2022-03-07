
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        All the parts that will be in the loop have to be included
        within it. Statement (true) will keep it going unless meeting the condition
        of "no" in which case the loop will stop.
        */

        while (true) {
            System.out.println("Shall we carry on?");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                break;
            }
        }

    }
}

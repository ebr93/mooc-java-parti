
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //(trakcer) counts how many words are inputted in the loop, it gets a +1 before loop restarts. If no words are input then it remains 0.
        int tracker = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
            break;
            }

            tracker++;
        }

        System.out.println(tracker);

    }
}

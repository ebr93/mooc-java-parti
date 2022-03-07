
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(" ");
            for (String part : parts) {
                System.out.println(part);
                break; 
            
            }
        }

    }
}

/* DONT KNOW WHY THIS DIDNT WORK THE FIRST TIME

            String[] parts = input.split(" ");
            System.out.println(parts[0]);

*/

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();

            if(input.equals("")) {
                break;
            }

            String[] nameAge = input.split(","); 
            if (Integer.valueOf(nameAge[1]) > oldest) {
                oldest = Integer.valueOf(nameAge[1]);
            }
            // (Integer.valueOf(nameAge[1]) turns a numeric String into an INTEGER, 
            //which allows the comparison with the INTEGER (oldest). 
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}

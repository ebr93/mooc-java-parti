
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")){
                break;
            }

            String[] parts = input.split(" ");
            System.out.println(parts[parts.length - 1]);
        }
        //Converted the string into an ARRAY by separating inputs with a space
        //  (parts[parts.length - 1]) pretty much gives me total number of elements,
        // have to subtract minus 1 to get the correct element number. arrays start counting from 0.
    }
}

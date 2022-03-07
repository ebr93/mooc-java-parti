
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 4) {
                break;
            } 
        }

    }
}

/*
In order to create a loop the command "while" allows it to happen. We can give conditions to terminate 
or keep the code going in a loop. In this case it will stop once number is equal to 4.
Conditions such as the question and value of the number are expressed after the command (while)
*/
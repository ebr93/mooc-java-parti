
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        // In here we can note that within the Conditional (if) we have to use the specific
        // command (equals) for p1. Strings require (equals). Numbers can just use (=)

        System.out.println("Enter the first string:");
        String p1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String p2 = scan.nextLine();

        if (p1.equals(p2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}

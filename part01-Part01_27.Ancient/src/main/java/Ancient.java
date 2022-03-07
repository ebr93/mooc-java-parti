
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());

        System.out.println(""); // Empty Line
        if (2015 > year) {
            System.out.println("Ancient history");
        }
    }
}

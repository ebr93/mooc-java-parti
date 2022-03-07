
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int high1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int low = Integer.valueOf(scanner.nextLine());

        for (int count = low; count <= high1; count++) {
            System.out.println(count);
        }
    }
}
/*
Solution that MOOC came up with for 2nd part:
Their solution pretty much sets a condition to break once 
Beginning variable is greater than End variable. This allows it to stop and leave the previous
one, which is at the equivalent value of End.

        System.out.print("Where to? ");
        int end = Integer.valueOf(scanner.nextLine());

        int beginning = Integer.valueOf(scanner.nextLine());
        while (true) {
            if (beginning > end) {
                break;
            }
 
            System.out.println(beginning);
            beginning++;
*/
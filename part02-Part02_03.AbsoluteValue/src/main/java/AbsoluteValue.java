
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.valueOf(scanner.nextLine());
        
        if (n1 < 0) {
            System.out.println(n1 * -1);
        }   else {
            System.out.println(n1);
        }
    }
}
/* the answer provided by the Mooc included this 
if (n1 < 0) {
    value = value * -1;
}
This ends up doing the same thing as mine, but without the else statement, or breaking it down into 2 conditionals
The second part pretty much updates the value of n1 before it is printed out in Sysout. It's more efficient.
*/
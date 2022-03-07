
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine());

        for (int x = 0; x <= input; x++) {
            System.out.println(x);
        }
    }
}

/*abstract
I ended up using a (for loop) which is correct, but the example given used a (while loop)
In a (while loop) variables have to be defined before being used within the loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int highest = Integer.valueOf(scanner.nextLine());
        int printing = 0;
        while (printing <= highest) {
            System.out.println(printing);
            printing++;
        }
    }
*/
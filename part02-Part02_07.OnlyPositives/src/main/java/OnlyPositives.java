
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (num == 0) {
                break;
            } else {
                System.out.println(num * num);
            }
        }

    }
}

/*
Turns out my method for this problem is the most complexed solution. The (else/if) blocks tend to be confusing 
and complicated. In order to keep things simple just use simple commands. 2 (if) commands would of had the same result
while being short and concise.
DURING DESIGN AND IMPLEMENTATION OF PROGRAM, IT IS DESIRABLE TO AIM FOR A SITUATION
IN WHICH EVERY SINGLE PART OF THE PROGRAM HAS A SINGLE, CLEAR TASK.
*/
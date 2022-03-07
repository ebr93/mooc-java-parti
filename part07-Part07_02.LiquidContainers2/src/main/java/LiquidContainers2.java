
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first) ;
            System.out.println("Second: " + second);
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            //use (final) to avoid java.lang.ArrayIndexOutOfBoundsException issue
            final String[] parts = input.split(" ");
            final String command = parts[0];
            final int amount = Integer.valueOf(parts[1]);
 
            //if amount is 0 or a negative number, which don't change values then restart next loop

            if (command.equals("add")) {
                first.add(amount);

                // had to add similar conditions to (move) in case that (amount) was greater than a containers value
                // in which case we add and subtract by (first) container value 
            } else if (command.equals("move")) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains());
                    continue;
                }
                first.remove(amount);
                second.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }

}

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
 
        while (true) {
            System.out.println("First: " + first + "/100") ;
            System.out.println("Second: " + second + "/100");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            final String[] parts = input.split(" ");
            final String command = parts[0];
            final int amount = Integer.valueOf(parts[1]);
 
            //if amount is 0 or a negative number, which don't change values then restart next loop
            if (amount < 1) {
                continue;
            }

            if (command.equals("add")) {
                //add the amount and if its greather then 100, then it is given a value of 100
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            } else if (command.equals("move")) {
                //if amount is greater than first, then we only move as much as first is in value and first becomes 0
                if (first < amount) {
                    second += first;
                    first = 0;
                    continue;
                }
                //otherwise then we just apply amount to both values in their respective manner;
                first -= amount;
                second += amount;

                if (second > 100) {
                    second = 100;
                }
            } else if (command.equals("remove")) {
                //if amount is greater than second then second will just be equal to 0
                //otherwise just subtract it by amount value
                if (second < amount) {
                    second = 0;
                } else {
                    second = second - amount;
                }
            }
        }
    }
}
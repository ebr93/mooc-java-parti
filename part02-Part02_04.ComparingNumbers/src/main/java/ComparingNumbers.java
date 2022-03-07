
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double n1 = Double.valueOf(scanner.nextLine());
        Double n2 = Double.valueOf(scanner.nextLine());
        
        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2 + ".");
        } else if (n2 > n1) {
            System.out.println(n1 + " is smaller than " + n2 + ".");
        } else {
            System.out.println(n1 + " is equal to " + n2 + ".");
        }
    }
}
/*
In order to make this one work I had to make use of if, else if, and else.
I tried using to else if, but that did not work. I always think using Doubles is more useful than Integers, both still 
give the same answer. My answer was pretty much the same as the one provided by the course. 
In order to write down and have the scanner read the Double the formula has to be used:
Double n1= Double.valueOf(scanner.nextLine());
The others are
Int n1 = Integer.valueOf(scanner.nextLine());
*/
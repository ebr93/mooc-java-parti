
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        my code basically breaks down the formulas before
        implementing the conditional statements. Instead of performing the expression within the conditional
        I decided to create double variables. I was unaware that doubles and expressions could be used within  
        the conditional, regardless both are able to give the same correct anser.
        */

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        if (gift <= 4999) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift <= 25000) {
            double g1 = (100 + (gift - 5000) * .08);
            System.out.println("Tax: " + g1);
        } else if (gift >= 25000 && gift <= 55000) {
            double g2 = (1700 + (gift - 25000) * .10);
            System.out.println("Tax: " + g2);
        } else if (gift >= 55000 && gift <= 200000) {
            double g3 = (4700 + (gift - 55000) * .12);
            System.out.println("Tax: " + g3);
        } else if (gift >= 200000 && gift <= 1000000) {
            double g4 = (22100 + (gift - 200000) * .15);
            System.out.println("Tax: " + g4);
        } else if (gift >= 1000000) {
            double g5 = (142100 + (gift - 1000000) * .17);
            System.out.println("Tax: " + g5);
        }

    }
}

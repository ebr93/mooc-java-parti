
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // The hardest part of this exercise is making use of all of the variables given within the hints,
        // for that reason I struggled with the validity of being divisible by 100. The statement (year % 100 !=0)
        // basically cancels out any year that might be divisible by 100, but it does not count out the ones that
        // are divisible by 400. Important to note that ( != ) MEANS IT CANNOT BE EQUAL TO

        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}

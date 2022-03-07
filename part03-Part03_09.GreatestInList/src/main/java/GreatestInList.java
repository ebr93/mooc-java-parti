
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        //this variable HAS THE VALUE OF THE FIRST number in the INDEX.
        int largest = list.get(0);

        //this loop keeps on going until number it goes through the whole list in the array because
        //(list.get(i)) has a value of 0 so it starts at 1st number. At the end of each loop it goes up by +1. SO IT CHECKS EACH NUMBER
        for (int i = 0; i < list.size(); i++) {
            int numberIndex = list.get(i);

            if (largest < numberIndex) {
                largest = numberIndex;
                //1. as it keeps going up there is a condition in which if (numberIndex) is greater then (largest) becomes that value
                //2. as it loops again it keeeps compering the numbers in the Index, with (largest) maintaining the highest value
            }

        }

        System.out.println("The greatest number: " + largest);

    }
}

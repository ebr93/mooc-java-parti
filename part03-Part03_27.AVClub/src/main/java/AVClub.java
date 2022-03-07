
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputs = scanner.nextLine();

            if (inputs.equals("")) {
                break;
            }

            String[] elements = inputs.split(" ");
            for (String element : elements) {
                if (element.contains("av")) {
                    System.out.println(element);
                }
            }
        }
    }

}
// ITS BECAUSE MY DUMBASS HAD THE STRING (INPUTS) OUTSIDE, JMAKE NO SENSE
/*
    public static void avFinder(String[] elements) {
        int index = 0;
        while (index < elements.length) {
            if (elements[index].contains("av")) {
                System.out.println(elements[index]);
            }
            index++;
        }
    }
}
/*abstract


            for (String element : elements) {
                if (element.contains("av")) {
                    System.out.println(element);
                }
            }
*/